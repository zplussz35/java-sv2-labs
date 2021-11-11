package introexceptiontrace;

import java.util.Arrays;

public class NumbersMain {
    public static void main(String[] args) {
        Change c = new Change();
        System.out.println(Arrays.toString(c.changeNumbers())); // a Randomoperations getnumber metódusában a for ciklus <=lengthOfArray-ig megy ami kivátelt dob hisz túlmentünk az indexen
    }
}
