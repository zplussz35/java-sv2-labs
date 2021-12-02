package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers){
        Trainer maxAgeTrainer=null;
        for (Trainer t:trainers) {
            if(maxAgeTrainer==null||maxAgeTrainer.getAge()<t.getAge()){
                maxAgeTrainer=t;
            }
        }
        return maxAgeTrainer;
    }
}
