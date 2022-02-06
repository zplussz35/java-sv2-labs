package collectionscomp;

import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building>{
    private String address;
    private double area;
    private int levels;

    public Building(String address, double area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building)) return false;

        Building building = (Building) o;

        if (Double.compare(building.area, area) != 0) return false;
        if (levels != building.levels) return false;
        return address.equals(building.address);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = address.hashCode();
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + levels;
        return result;
    }

    @Override
    public int compareTo(Building o) {
        return this.getLevels()-o.getLevels();
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", levels=" + levels +
                '}';
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("A utca 1",100,2));
        buildings.add(new Building("B utca 1",200,1));
        buildings.add(new Building("C utca 1",300,3));
        buildings.add(new Building("D utca 1",400,7));
        buildings.add(new Building("E utca 1",500,5));
        buildings.add(new Building("F utca 1",600,2));

        System.out.println(buildings);
    }
}
