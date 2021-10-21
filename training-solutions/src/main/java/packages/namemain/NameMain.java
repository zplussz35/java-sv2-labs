package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        Prefix prefix = new Prefix("Dr.");
        FirstName firstName = new FirstName("Toth");
        LastName lastName = new LastName("Zoltan");
        String name=prefix.getPre()+" "+firstName.getFirst()+" "+lastName.getLast();
        System.out.println("Name: "+name);

    }
}
