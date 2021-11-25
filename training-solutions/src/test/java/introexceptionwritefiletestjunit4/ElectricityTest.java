package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ElectricityTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testWriteStreets() throws IOException {

        Path path = temporaryFolder.newFile("streets.txt").toPath();
        new Electricity().writeStreets(path);


        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList(LocalDate.now().toString(),"Aladár u.","Kárpát u.","Bajcsy-Zsilinszky u.","Zsolnai u.","Ó u.","Apostol u."),lines);

    }
}