package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {
    VideoTheque videoTheque;

    @BeforeEach
    void setUp() {
        videoTheque = new VideoTheque(new ArrayList<>());
        videoTheque.addMovie(new Movie("Titanic", Category.ROMANTIC, 3));
        videoTheque.addMovie(new Movie("Frozen", Category.ANIMATION, 4));
        videoTheque.addMovie(new Movie("The Lord of the Rings", Category.FANTASY, 5));
        videoTheque.addMovie(new Movie("The Lion King", Category.ANIMATION, 5));
        videoTheque.addMovie(new Movie("Garfield", Category.ANIMATION, 2));
        videoTheque.addMovie(new Movie("Shrek", Category.ANIMATION, 5));
        videoTheque.addMovie(new Movie("Mission: Impossible", Category.ACTION, 5));
    }

    @Test
    void getGoodMoviesWithCategoryGiven() {
        assertEquals(3,videoTheque.getGoodMoviesWithCategoryGiven(Category.ANIMATION).size());
        assertEquals(1,videoTheque.getGoodMoviesWithCategoryGiven(Category.ACTION).size());
        assertEquals(0,videoTheque.getGoodMoviesWithCategoryGiven(Category.SCIFI).size());


    }
}