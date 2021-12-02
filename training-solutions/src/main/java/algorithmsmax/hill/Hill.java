package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int  getMax(List<Integer> heights){
        int max=Integer.MIN_VALUE;

        for (Integer h:heights) {
            if(h>max){
                max=h;
            }

        }
        return max;
    }
}
