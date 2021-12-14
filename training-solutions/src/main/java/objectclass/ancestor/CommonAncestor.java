package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        Fruit f = new Fruit();
        Apple a = new Apple();
        Starking s = new Starking();
        Vegetable v = new Vegetable();
        objects.add(f);
        objects.add(a);
        objects.add(s);
        objects.add(v);
        objects.add("alma");
        objects.add(12);
        objects.add('x');
        LocalDate localDate = LocalDate.of(2021,11,12);
        objects.add(localDate);
        int[] numberArray ={1,2,3,4,5};
        objects.add(numberArray);
        List<String> stringList = Arrays.asList("egy","ketto","harom");
        objects.add(stringList);

        for (Object o:objects) {
            System.out.println(o);
        }
    }
}
