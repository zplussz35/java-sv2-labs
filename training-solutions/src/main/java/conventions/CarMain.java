package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Audi","GRK-850",4,5);
        System.out.println("Car type: "+car.getCarType());
        System.out.println("Engine type: "+car.getEngineType());
        System.out.println("Doors number : "+car.getDoors());
        System.out.println("Person number: "+car.getPersons());
        car.setCarType("Skoda");
        car.addModelName("Yaris");
        car.setEngineType("HSW-537");
        car.setDoors(6);
        car.setPersons(8);
        System.out.println("Car type: "+car.getCarType());
        System.out.println("Engine type: "+car.getEngineType());
        System.out.println("Doors number : "+car.getDoors());
        System.out.println("Person number: "+car.getPersons());



    }
}
