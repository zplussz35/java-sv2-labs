package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void addIngredients() {
        Recipe r = new Recipe();
        r.addIngredients(Paths.get("src/test/resources/recipe.txt"));
        assertEquals(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás", "citrom", "sütőpor", "vanillincukor",
                "tejföl", "alma", "fahéj"),r.getIngredients());
    }
}