package algorithmscount.digits;

public class Digits {
    public int getCountOfNumbers(){
        int count=0;
        for (int i = 16; i < 100; i++) {
            int n1=i/10;
            int n2=i%10;
            if((n1+5==n2)||(n2+5==n1)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Digits().getCountOfNumbers());
    }
}
