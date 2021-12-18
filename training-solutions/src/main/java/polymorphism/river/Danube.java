package polymorphism.river;

import java.awt.image.DataBufferUShort;
import java.util.List;

public class Danube extends River{
    private List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        Water water = new Danube("Duna",12000,List.of("Budapest","Esztergom","győr"));
        River river = new Danube("Tisza",10000,List.of("Miskolc","tiszafüred"));
        Danube danube = new Danube("Sió",5000,List.of("Sió","Békés"));

        System.out.println(water);
        System.out.println(river.getName()+" "+river.getLength());
        System.out.println(danube.getName()+" "+danube.getLength()+" "+danube.getCapitals());
    }
}
