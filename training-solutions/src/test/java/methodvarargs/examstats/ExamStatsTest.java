package methodvarargs.examstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    @Test
    void testGetNumberOFTopGrades(){
        ExamStats examStats = new ExamStats(100);
        int count=examStats.getNumberOfTopGrades(90,60,70,67,12,54,98,99,78,69,97,100,32);
        assertEquals(4,count);
    }

    @Test
    void testHasAnyFailed(){
        ExamStats examStats = new ExamStats(100);
        boolean result=examStats.hasAnyFailed(50,60,70,67,12,54,98,99,78,69,97,100,32);
        assertTrue(result);
    }

}