package inheritanceattributes.building;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("Épület",120.5,4);
        SchoolBuilding school = new SchoolBuilding("Iskola",150.5,3,25);
        System.out.println(building.name+" "+building.area+" "+building.getFloors()+" "+ school.getFloors()+" "+school.name+" "+ school.area);
    }
}
