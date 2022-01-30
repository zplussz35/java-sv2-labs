package collectionsset.rightanswer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {

    @Test
    void drawWinners() {
        List<RightAnswer> rightAnswers=new ArrayList<>();
        rightAnswers.add(new RightAnswer("Zoltán"));
        rightAnswers.add(new RightAnswer("Hágel"));
        rightAnswers.add(new RightAnswer("Tamás"));
        rightAnswers.add(new RightAnswer("Mária"));
        rightAnswers.add(new RightAnswer("Zoltán"));
     ;

        QuestionGame questionGame=new QuestionGame(rightAnswers);

        assertThrows(IllegalStateException.class, questionGame::drawWinners);

        //System.out.println(questionGame.drawWinners());


    }
}