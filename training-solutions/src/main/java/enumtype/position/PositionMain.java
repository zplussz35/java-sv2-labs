package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        Position[] psArray=Position.values();

        for (int i = 0; i < psArray.length; i++) {
            System.out.println(psArray[i].name()+" salary: "+psArray[i].getSalary()+" benefit: "+
                    psArray[i].getBenefit());
        }
    }
}
