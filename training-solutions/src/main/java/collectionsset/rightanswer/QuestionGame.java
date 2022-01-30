package collectionsset.rightanswer;

import java.util.*;

public class QuestionGame {
    private  List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public  Set<String> drawWinners(){
        Random r = new Random();
        Set<String> winners=new HashSet<>();
        while(winners.size()<5){
            if(rightAnswers.size()==5){
                throw new IllegalStateException("Dont enough winners!");
            }
            int index=r.nextInt(rightAnswers.size());
            winners.add(rightAnswers.get(index).getName());
            rightAnswers.remove(index);
        }

        return winners;



    }


}
