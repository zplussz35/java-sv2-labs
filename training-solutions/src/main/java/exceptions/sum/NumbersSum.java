package exceptions.sum;

public class NumbersSum {
    public int getSum(int[] numbers){
        if (numbers == null) {
            throw new IllegalArgumentException("Cannot be null!");
        }
        int sum=0;
        for (int n:numbers) {
            sum+=n;
        }
        return sum;
    }
    public int getSum(String[] numbers){
        if (numbers == null) {
            throw new IllegalArgumentException("Cannot be null!");
        }
        try{

            int number=0;
            int sum=0;
            for (String n:numbers) {
                    number=Integer.parseInt(n);
                    sum+=number;
            }
            return sum;
        }catch (NumberFormatException nfe){
            throw new IllegalStateException("Not number found!",nfe);
        }

    }
}
