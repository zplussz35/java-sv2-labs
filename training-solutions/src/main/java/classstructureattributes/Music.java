package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Song song = new Song();
        System.out.println("Give your favourite song data: ");
        System.out.print("-The band: ");
        song.band=sc.nextLine();
        System.out.print("-The title: ");
        song.title=sc.nextLine();
        System.out.print("-The length: ");
        song.length=sc.nextInt();
        sc.nextLine();
        System.out.println("Your favourite song is: ");
        System.out.println(song.band+" - "+song.title+" ("+ song.length+" perc)");

    }
}
