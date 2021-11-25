package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    @TempDir
    File tempDir;

    @Test
    void testWriteStreets() throws IOException {

        Path path=tempDir.toPath().resolve("streets.txt");

        new Electricity().writeStreets(path);

        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList(LocalDate.now().toString(),"Aladár u.","Kárpát u.","Zátony u."),lines);
    }
}