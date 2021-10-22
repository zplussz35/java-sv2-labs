package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Favourite animal: ");
        String favAnimal=sc.nextLine();
        System.out.print("Favourite singer: ");
        String favSinger=sc.nextLine();
        System.out.print("Favourite movie: ");
        String favMovie=sc.nextLine();
        List<String> favouriteThings = new ArrayList<>(Arrays.asList(favAnimal,favMovie,favSinger));
        System.out.println("Your favourite things:");
        System.out.println(favouriteThings.toString());
    }
}
