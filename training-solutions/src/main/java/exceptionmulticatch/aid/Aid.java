package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path){
        try {
            List<String> result = new ArrayList<>();
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                String[] data = line.strip().split(":");
                StringBuilder sb = new StringBuilder(data[0]);
                String cityAmount = String.valueOf(amount / Integer.parseInt(data[1].strip()));
                sb.append(": ").append(cityAmount);
                result.add(sb.toString());
            }
            return result;
        }catch (NullPointerException | IOException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException ex){
            throw new IllegalStateException("Something went wrong while counting.", ex);
        }
    }

    public static void main(String[] args) {
        Aid aid = new Aid(1_489_600);
        System.out.println(aid.countAmountsOfAid(Paths.get("src/test/resources/population1.txt")));
    }
}
