package introexceptiontrycatchtrace;

public class Calculator {
    public double calculate(int n1,int n2,String m){
        double result;
        switch (m){
            case "+":
                result=n1+n2;
                break;
            case "-":
                result=n1-n2;
                break;
            case "*":
                result=n1*n2;
                break;
            case "/":
                result=n1/n2;
                break;
            default:
                System.out.println("Nem műveleti jel!");
                result=0.0;
                break;
        }
        return result;
    }
}
