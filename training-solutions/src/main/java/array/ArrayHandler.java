package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source){
        for (int i = 0; i < source.length; i++) {
            source[i]+=i;
        }
    }
    public void concatenateIndexToWord(String[] source){
        for (int i = 0; i < source.length; i++) {
            source[i]=i+". "+source[i];
        }
    }

    public static void main(String[] args) {
        int[] numbers ={5,4,10,6,2,4,31};
        String[] words={"apple","banana","apricot","melon","lemon"};

        ArrayHandler arrayHandler= new ArrayHandler();
        for (int n:numbers) {
            System.out.println(n);
        }
        arrayHandler.addIndexToNumber(numbers);
        for (int n : numbers) {
            System.out.print(n+", ");
        }
        System.out.println();

        for (String w:words) {
            System.out.println(w);
        }
        arrayHandler.concatenateIndexToWord(words);
        for (String w:words) {
            System.out.print(w+", ");
        }
    }
}
