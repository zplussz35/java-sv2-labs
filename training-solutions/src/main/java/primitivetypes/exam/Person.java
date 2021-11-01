package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int locateNum;
    private double score;

    public Person(String name, LocalDate dateOfBirth, int locateNum, double score) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.locateNum = locateNum;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getLocateNum() {
        return locateNum;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "név: " + name + '\n' +
                "születési dátum: " + dateOfBirth +"\n"+
                "irányítószám: " + locateNum +"\n"+
                "átlag: " + score +"\n";
    }
}
