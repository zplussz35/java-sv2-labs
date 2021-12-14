package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("Gyümölcs");
        fruit.setWeight(400.12);

        Apple apple = new Apple();
        apple.setName("Alma");
        apple.setWeight(300.35);
        apple.setPieces(12);

        Grape grape = new Grape();
        grape.setName("Szőlő");
        grape.setWeight(200.12);
        grape.setType("kék");

        GoldenDeliciuos goldenDeliciuos = new GoldenDeliciuos();
        goldenDeliciuos.setName("Aranyalma");
        goldenDeliciuos.setWeight(400.23);
        goldenDeliciuos.setPieces(20);

        Starking starking = new Starking();
        starking.setName("Starking alma");
        starking.setWeight(200.45);
        starking.setPieces(45);

        System.out.println(fruit.getName()+" "+fruit.getWeight()+"\n"+
                apple.getName()+" "+apple.getWeight()+" "+apple.getPieces()+"\n"+
                goldenDeliciuos.getName()+" "+goldenDeliciuos.getWeight()+" "+goldenDeliciuos.getPieces()+" "+goldenDeliciuos.getColour()+"\n"+
                starking.getName()+" "+starking.getWeight()+" "+starking.getPieces()+" "+starking.getColour()+"\n"+
                grape.getName()+" "+grape.getWeight()+" "+grape.getType());

    }
}
