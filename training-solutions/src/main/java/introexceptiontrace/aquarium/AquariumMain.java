package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aq = new Aquarium();
        aq.addFish(new Fish("cápa","fekete"));
        aq.addFish(new Fish("delfin","szürke"));
        aq.addFish(new Fish("bélna","fehér"));
        aq.addFish(new Fish("Kishal","piros"));
        aq.addFish(new Fish("cápa","fehér"));

        System.out.println("Halak száma: "+aq.getNumberOfFish()); //mivel az Aquarium osztályban a halak listálya nem lett példányosítva ezért nem is lehetett bele halakat rakni.
    }
}
