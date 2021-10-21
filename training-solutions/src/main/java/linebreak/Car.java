package linebreak;

public class Car {
    public String getBrandAndTypeInSeparateLines(String brand,String type){
        return brand + System.lineSeparator() +type;
    }

    public static void main(String[] args) {
        Car car = new Car();
        String brand="Toyota";
        String type="Yaris";
        System.out.println(car.getBrandAndTypeInSeparateLines(brand,type));
    }
}
