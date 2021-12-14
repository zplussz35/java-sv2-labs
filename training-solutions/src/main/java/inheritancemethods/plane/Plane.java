package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger p = new Passenger("Zoltán",1200);
        PriorityPassenger pr = new PriorityPassenger("Zoltán",1200,50);
        FirstClassPassenger fpr = new FirstClassPassenger("Zoltán",1200,50);
        System.out.println(p.getName()+" "+p.getPriceOfPlaneTicket());
        System.out.println(pr.getName()+" "+pr.getPriceOfPlaneTicket());
        System.out.println(fpr.getName()+" "+fpr.getPriceOfPlaneTicket());
    }
}
