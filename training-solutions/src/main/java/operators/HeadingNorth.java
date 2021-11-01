package operators;

public class HeadingNorth {

    public int getNumberOfNewDirections(){
        int szamlalo=1;
        int dir=10;
        int fordul=10;
        while(dir%360!=0){
            fordul+=10;
            dir+=fordul;
            szamlalo++;
        }
        return szamlalo;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth= new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());
    }
}
