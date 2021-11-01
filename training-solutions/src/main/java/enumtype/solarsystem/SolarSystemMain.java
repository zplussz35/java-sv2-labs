package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        SolarSystem[] solArray= SolarSystem.values();
        for(int i=0;i<solArray.length;i++){
            System.out.println(solArray[i]+" Holdak száma: "+solArray[i].getHoldDb());

        }
    }



}
