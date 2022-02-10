package searching;

import java.util.Arrays;

public class Mountain {
    private int[] heights ={100,200,300,400,450,455,600,800,1200,1220,1400,1500,4500,6000,7000,12000};

    public boolean searchPeak(Peak peak){
        return Arrays.binarySearch(heights, peak.getHeight()) >= 0;
    }

    public static void main(String[] args) {
        Mountain m = new Mountain();
        System.out.println(m.searchPeak(new Peak("Zerge",1200)));
    }
}
