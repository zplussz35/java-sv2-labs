package enumtype.firstenum;

public class FirstEnumMain {
    public static void main(String[] args) {
        System.out.println(Continent.AFRICA);
        System.out.println(Continent.AMERICA);
        System.out.println(Continent.ASIA);
        System.out.println(Continent.ANTARCTICA);
        System.out.println(Continent.EUROPA);
        System.out.println(Continent.AUSTRALIA);

        System.out.println();

        for(int i=0;i<Continent.values().length;i++){
            System.out.print(Continent.values()[i]+" ");
        }
        System.out.println();

        System.out.println(Ocean.valueOf("CSENDES"));
        System.out.println(Ocean.valueOf("ATLANTI"));
        System.out.println(Ocean.valueOf("JEGES"));
        System.out.println(Ocean.valueOf("INDIAI"));

        System.out.println();

        for(int i=0;i<Football.values().length;i++){
            System.out.println(Football.values()[i].name());
        }
    }
}
