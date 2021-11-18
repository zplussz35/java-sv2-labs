package introexceptionthrowjunit5;

public class Tank {
    private int angle;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber){
        angle+=angleNumber;
        if(angle>80){
            throw new IllegalArgumentException("Bigger than 80 angle!");
        }
        else{
            if(angle<-80){
                throw new IllegalArgumentException("Lower than -80 angle!");
            }
        }
    }
}