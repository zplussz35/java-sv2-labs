package conventions;

public class Car {
    private int persons;
    private int doors;
    private String carType;
    private String engineType;

    public Car(String carType, String engineType, int doors, int persons)
    {
        this.carType = carType;
        this.engineType = engineType;
        this.doors = doors;
        this.persons = persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getPersons() {
        return persons;
    }

    public int getDoors() {
        return doors;
    }

    public String getCarType() {
        return carType;
    }
    public String getEngineType() {
        return engineType;
    }

    public void addModelName(String modelName) {
        this.carType = carType + " " + modelName;
    }
}
