package collectionlist.food;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {
    private List<Food> foods=new LinkedList<>();

    public List<Food> getFoods() {
        return foods;
    }

    public void addFood(Food food){
        foods.add(food);
    }

    public void sellFirst(){
        int index=-1;
        for (int i=0;i<foods.size();i++) {
            if(foods.get(i).getExpDate().isEqual(LocalDate.now())){
                foods.add(0, foods.get(i));
                index=i;
                break;
            }
        }
        if(index>0){
            foods.remove(index);
        }



    }
}
