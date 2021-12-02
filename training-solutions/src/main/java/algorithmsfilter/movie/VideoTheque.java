package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> movies;

    public VideoTheque(List<Movie> movies) {
        this.movies = movies;
    }

    public void addMovie(Movie m){
        this.movies.add(m);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category cat){
        List<Movie> result= new ArrayList<>();
        int rating = 3;
        for (Movie m:movies) {
            if(m.getCategory()==cat&&m.getRating()>rating) {
                result.add(m);
            }
        }
        return result;
    }
}
