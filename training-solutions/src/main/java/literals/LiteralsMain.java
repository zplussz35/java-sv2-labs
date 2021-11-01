package literals;

public class LiteralsMain {

    public static void main(String[] args) {
        System.out.println("1"+"2");

        double quotient=3F/4;

        System.out.println(quotient);

        long big=  3_244_444_444L;

        System.out.println(big);

        String word="title".toUpperCase();

        System.out.println(word);

        int a =1;
        int b = -2;


        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

    }
}
