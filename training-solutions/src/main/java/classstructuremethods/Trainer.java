package classstructuremethods;

public class Trainer {
    private String name;

    private int yearOfBirth;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getNameAndYearOfBirth() {
        return name + " " + yearOfBirth;
    }

    public void changeName(String newName) {
        name = newName;
    }






}
