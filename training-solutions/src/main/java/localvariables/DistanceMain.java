package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance dis = new Distance(5.5,true);
        System.out.println("Distance: "+dis.getDistanceInKm());
        System.out.println("Exact?: "+dis.isExact());

        int distance=(int)dis.getDistanceInKm();
        System.out.println("New distance: "+distance);
    }
}
