package algorithmssum;

public class TwoDigitEvens {
    public static void main(String[] args) {
        System.out.println(TwoDigitEvens.getSum());
    }

    public static int getSum(){
        int sum=0;
        for (int i = 11; i<100;i+=2) {
            if(i%5!=0){
                sum+=i;
            }
        }
        return sum;
    }
}
