package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    private List<String> names = new ArrayList<>(Arrays.asList("Zoltán","Tamás","Ágnes","Krisztina"));

    public void  addName(String name){
        names.add(name);
    }
    public void thanking(){
        for (String s:names) {
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!\n",s);
        }
    }
    public static void main(String[] args) {
        Thanks t = new Thanks();
        t.addName("Zoltán");
        t.addName("Tamás");
        t.addName("Krisztina");
        t.addName("Lilla");
        t.addName("László");

        t.thanking();
    }

}
