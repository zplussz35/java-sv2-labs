package collectionslist.food;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FoodStoreTest {

    @Test
    void sellFirst() {
        FoodStore foodStore=new FoodStore();
        foodStore.addFood(new Food("alma", LocalDate.of(2023,11,12)));
        foodStore.addFood(new Food("barack", LocalDate.of(2023,11,12)));
        foodStore.addFood(new Food("tojás", LocalDate.now()));

        assertEquals(3,foodStore.getFoods().size());
        assertEquals("alma",foodStore.getFoods().get(0).getName());

        foodStore.sellFirst();
        assertEquals(3,foodStore.getFoods().size());
        assertEquals("tojás",foodStore.getFoods().get(0).getName());
    }
}