package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {
    public static void main(String[] args) {
        List<String> flavors=new ArrayList<>(Arrays.asList("csoki", "vanília", "eper", "citrom", "puncs"));
        StringBuilder sb= new StringBuilder();
        System.out.print("Ma kapható: ");
        for (int i = 0; i < flavors.size(); i++) {
            sb.append(flavors.get(i));
            if(i< flavors.size()-1){
                sb.append(", ");
            }
            else{
                sb.append(".");
            }
        }
        System.out.println(sb.toString()+" Gyerekeknek féláron!");
    }
}
