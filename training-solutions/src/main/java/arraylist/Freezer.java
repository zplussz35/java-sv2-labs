package arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> foodList = new ArrayList<>();
        foodList.add("alma");
        foodList.add("banán");
        foodList.add("virsli");
        foodList.add("saláta");
        foodList.add("főzelék");
        System.out.println(foodList.toString()+" "+foodList.size());
        foodList.remove("alma");
        foodList.remove("saláta");
        System.out.println(foodList+" "+foodList.size());
    }


}
