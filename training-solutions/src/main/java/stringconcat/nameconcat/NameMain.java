package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name name = new Name("Tóth","János","Zoltán",Title.valueOf("DR"));
        Name name2= new Name("Kovács","Andtrás","Péter");

        System.out.println("Külföldi: "+name.concatNameWesternStyle());
        System.out.println("Magyar: "+name.concatNameHungarianStyle());
        System.out.println("Külföldi: "+name2.concatNameWesternStyle());
        System.out.println("Magyar: "+name2.concatNameHungarianStyle());
    }
}
