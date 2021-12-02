package immutable.car;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String type;
    private final int yearOfMade;

    public Car(String brand, String type, int yearOfMade) {
        if(brand==null||brand.isEmpty()){
            throw new IllegalArgumentException("Dont correct brand!");
        }
        if(yearOfMade> LocalDate.now().getYear()){
            throw new IllegalArgumentException("Dont correct year of made!");
        }
            this.brand = brand;
            this.type = type;
            this.yearOfMade=yearOfMade;


    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }
}
