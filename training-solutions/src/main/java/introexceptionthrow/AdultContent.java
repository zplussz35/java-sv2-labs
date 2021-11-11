package introexceptionthrow;

public class AdultContent {
    public static void main(String[] args) {
        try{
            Adult adult = new Adult("Zoltán",21);
            Adult adult2 = new Adult("Kriszti",19);
            Adult adult3 = new Adult("Balázs",16);
        }
        catch (IllegalArgumentException ie){
            System.out.println(ie.getMessage());
        }

    }
}
