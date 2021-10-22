package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> emberek = new ArrayList<>(Arrays.asList("Zoltán","Botond","Eszter","Kinga","Csenge",
                "Gizella","Máté","Balázs","Krisztina","László"));
        Random rnd = new Random();
        int r1=rnd.nextInt(1,5);
        int r2=rnd.nextInt(6,10);
        System.out.println("1. nyertes: "+emberek.get(r1)+" 2. nyertes: "+emberek.get(r2));


    }
}
