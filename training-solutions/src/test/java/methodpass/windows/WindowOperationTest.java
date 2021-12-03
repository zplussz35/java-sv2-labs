package methodpass.windows;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    @Test
    void riseSize() {
        List<Window> ws = Arrays.asList(new Window("r1",100,100),
                new Window("r2",200,130),
                new Window("r3",300,120),
                new Window("r4",400,110));

        new WindowOperation().riseSize(ws,10);
        assertEquals(130,ws.get(2).getHeight());
    }
}