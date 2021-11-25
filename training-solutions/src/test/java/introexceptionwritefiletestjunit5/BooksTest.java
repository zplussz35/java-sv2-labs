package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File tempDir;


    @Test
    void correctBooks() throws IOException {
        Path path= Paths.get("src/test/resouces/books2.txt");

        new Books().correctBooks(path);

        List<String> lines = Files.readAllLines(path);

        assertEquals(Arrays.asList("Gárdonyi Géza: Egri csillagok","Molnár Ferenc: Pál utcai fiúk",
                "Fekete István: Tüskevár","Jókai Mór: Kőszívű ember fiai"),lines);


    }
}