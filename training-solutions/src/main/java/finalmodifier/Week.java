package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static void main(String[] args) {
        List<String> weekdays = Arrays.asList("hétfő","kedd","szerda","csütörtök",
                "péntek","szombat","vasárnap");
        weekdays.set(1,"szerda");

        System.out.println(weekdays.toString());
    }


}
