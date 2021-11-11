package introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {
        try{
            Winner w = new Winner();
            w.addName("Zoltán");
            w.addName(null);
            w.addName(null);
            w.addName("László");
            w.addName(null);
            w.addName("Ivett");
            w.addName(null);
            w.addName("Sándor");
            System.out.println(w.getWinner());
        }
        catch (NullPointerException ne){
            System.out.println("Null érték!");
            System.out.println(ne.getMessage());
        }

        System.out.println("End!");

    }
}
