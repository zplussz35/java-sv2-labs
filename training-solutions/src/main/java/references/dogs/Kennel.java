package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        Dog dog1= new Dog("Zozo",4,"brown");
        Dog dog2= new Dog("Zoe",6,"white");
        Dog dog3= new Dog("Zizi",1,"black");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

        System.out.println(dogList);

        Dog dog4 =dogList.get(1);
        dog4.setColour("purple");

        System.out.println(dogList);

        Dog dog5 = new Dog("Buksi",2,"white");
        System.out.println(dog5);

        dog5=dogList.get(1);
        System.out.println(dog5);

        dogList.add(dog5);
        System.out.println(dogList);

        Dog dog6 = dog4;
        dog6.setColour("orange");

        System.out.println(dogList);

        List<Dog> dogList2= dogList;

        Dog dog7=dog4;
        dog7.setColour("red");

        System.out.println(dogList2);

        dog2.setColour("yellow");

        System.out.println(dogList2);

        dog2=null;

        Dog dog8 = dogList.get(1);
        dog8=null;
        System.out.println(dogList2);

        Dog dog9=dogList.get(1);
        dog9.setColour("green");

        System.out.println(dogList2);

        System.out.println(dogList2);
    }
}
