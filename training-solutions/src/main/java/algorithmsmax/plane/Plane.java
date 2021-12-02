package algorithmsmax.plane;

public class Plane {

    public int getLongestOcean(String map){
        int counter=0;
        int maxCount=0;
        for (Character c:map.toCharArray()) {
            if(c=='0'){
                counter++;
            }
            else{
                if(counter>maxCount){
                    maxCount=counter;
                }
                counter=0;
            }
        }
        return maxCount;
    }
}
