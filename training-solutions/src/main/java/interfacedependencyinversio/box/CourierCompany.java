package interfacedependencyinversio.box;

public class CourierCompany {
    public static void main(String[] args) {
        SmallBox sb = new SmallBox();
        MediumBox mb = new MediumBox();
        LargeBox lb = new LargeBox();
        ExtraLargeBox eb = new ExtraLargeBox();

        System.out.println(sb.getSize()+" "+sb.getPrice());
        System.out.println(mb.getSize()+" "+mb.getPrice());
        System.out.println(lb.getSize()+" "+lb.getPrice());
        System.out.println(eb.getSize()+" "+eb.getPrice());
    }
}
