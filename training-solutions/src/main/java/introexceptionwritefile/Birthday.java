package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        List<String> datas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Mennyi nevet szeretne megadni?: ");
        int count=sc.nextInt();
        sc.nextLine();
        String name;
        String dateOfBirthString;
        for(int i=0;i<count;i++){
            System.out.print((i+1)+". név: ");
            name=sc.nextLine();
            System.out.print("Születési dátum (yyyy.mm.dd): ");
            dateOfBirthString=sc.nextLine();
            datas.add(name+" "+dateOfBirthString);
        }
        try{
            Files.write(Paths.get("src/main/resources/birthdays.txt"),datas);
        }
        catch (IOException ioe){
            ioe.printStackTrace();;
        }

    }
}
