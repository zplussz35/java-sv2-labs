package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        List<String> todoes= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy új teendőt (x -> vége/fájlbaírás): ");
        String todo=sc.nextLine();
        while(!"x".equals(todo)){
            todoes.add(todo);
            System.out.print("Adjon meg egy új teendőt (x -> vége/fájlbaírás): ");
            todo=sc.nextLine();
        }
        try{
            Files.write(Paths.get("src/main/resources/todos.txt"),todoes);
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
