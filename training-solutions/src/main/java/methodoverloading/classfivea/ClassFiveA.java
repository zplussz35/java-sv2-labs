package methodoverloading.classfivea;

import java.util.ArrayList;
import java.util.List;

public class ClassFiveA {
    private List<String> students = new ArrayList<>();

    public ClassFiveA(List<String> students) {
        this.students = students;
    }

    public String getTodayReferringStudent(int number){
        return students.get(number-1);
    }
    public String getTodayReferringStudent(Number number){
        return students.get(number.getValue());
    }
    public String getTodayReferringStudent(String numberName){
        switch (numberName){
            case "one":
                return students.get(0);
            case "two":
                return students.get(1);
            case "three":
                return students.get(2);
            default:
                return "No more students!";
        }
    }
}
