package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RecipeTest {


    @Test
    public void addIngredients() {
        Recipe recipe=new Recipe();
        recipe.addIngredients(Paths.get("src/test/resources/recipe.txt"));
        assertEquals(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás", "citrom",
                "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"),recipe.getIngredients());
    }
}