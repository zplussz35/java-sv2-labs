package catalog;

import java.util.List;

public class Validators {
    public static boolean isBlank(String s){
        return s == null || s.strip().equals("");
    }

    public static boolean isEmpty(List<String> l){
        return l == null || l.isEmpty();
    }

}
