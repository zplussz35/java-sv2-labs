package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BooksTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void TestCorrectBooks() throws IOException {

        Path path= Paths.get("src/test/resources/books.txt");

        new Books().correctBooks(path);

        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList("Gárdonyi Géza: Egri csillagok","Molnár Ferenc: Pál utcai fiúk",
                "Fekete István: Tüskevár","Jókai Mór: Kőszívű ember fiai"),lines);

    }
}