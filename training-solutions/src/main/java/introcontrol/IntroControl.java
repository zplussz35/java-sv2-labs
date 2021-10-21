package introcontrol;

public class IntroControl {
    public int subtractTenIfGreaterThanTen(int number){
        return number>10?number-10:number;
    }
    public String describeNumber(int number){
        return number==0?"zero":"not zero";
    }
    public String greetingToJoe(String name){
        return name.equals("Joe")?"Hello Joe":"";
    }
    public double calculateBonus(double sale){
        return sale>=1_000_000?sale*0.1:0.0;
    }
    public int calculateConsumption(int prev, int next){
        return prev>next?9999-prev+next:next-prev;
    }
    public void printNumbers(int max){
        for(int i=0;i<max+1;i++){
            System.out.print(i+" ");
        }
    }
    public void printNumbersBetween(int min, int max){
        for(int i=min;i<max+1;i++){
            System.out.print(i+" ");
        }
    }
    public void printNumbersBetweenAnyDirection(int a, int b){
        if(a>b){
            for(int i=a;i>b-1;i--){
                System.out.print(i+" ");
            }
        }
        else{
            for(int i=a;i<b+1;i++){
                System.out.print(i+" ");
            }
        }
    }
    public void printOddNumbers(int max){
        for(int i=1;i<max+1;i+=2){
            System.out.print(i+" ");
        }
    }

}
