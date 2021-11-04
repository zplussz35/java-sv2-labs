package junit5asserts;

public class Numbers {
    public int[] getEvenNumbers(int[] numbers){
        int[] result= new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==1){
                result[i]=0;
            }
            else{
                result[i]=numbers[i];
            }


        }
        return result;
    }
}
