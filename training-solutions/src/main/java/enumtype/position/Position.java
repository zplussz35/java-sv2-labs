package enumtype.position;

public enum Position {
    ALKALMAZOTT(200_000,""),KISFONOK(300_000,"kávé"),
    NAGYFONOK(500_000,"céges autó"),IGAZGATO(1_000_000,"Az egész cég jutalék 20% és céges autó");

    private int salary;
    private String benefit;

    Position(int salary,String benefit){
        this.salary=salary;
        this.benefit=benefit;

    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
