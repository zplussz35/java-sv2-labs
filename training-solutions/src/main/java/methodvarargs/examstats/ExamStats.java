package methodvarargs.examstats;

public class ExamStats {
    private final int maxPoints;
    public ExamStats(int maxPoints){
        this.maxPoints=maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results){
        if(results.length==0){
            throw new IllegalArgumentException("No result added!");
        }
        int counter=0;
        double result=0;
        for (int s:results) {
            result=s*1.0/maxPoints*100;
            if(result>=limitInPercent){
                counter++;
            }
        }
        return counter;
    }
    public boolean hasAnyFailed(int limitInPercent, int... results){
        if(results.length==0){
            throw new IllegalArgumentException("No result added!");
        }
        double result=0;
        for (int s:results) {
            result=s*1.0/maxPoints*100;
            if(result<limitInPercent){
                return true;
            }
        }
        return false;
    }
}
