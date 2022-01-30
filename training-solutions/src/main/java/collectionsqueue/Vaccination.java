package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {
    public Queue<Integer> getVaccinationOrder(List<Person> people){
        Queue<Integer> ordered = new PriorityQueue<>();
        for (Person p:people) {
            if(p.getAge()>=18||p.getAge()<=65){
                ordered.add(p.getAge());
            }
        }
        return ordered;
    }

    public static void main(String[] args) {
        List<Person> personList= new ArrayList<>();
        personList.add(new Person("Zoltán",22));
        personList.add(new Person("László",10));
        personList.add(new Person("Krisztina",20));
        personList.add(new Person("Máté",14));
        personList.add(new Person("Pál",16));
        personList.add(new Person("Zoltán",27));
        personList.add(new Person("Zoltán",54));
        personList.add(new Person("Gábor",34));
        personList.add(new Person("Eszter",55));
        personList.add(new Person("János",66));
        personList.add(new Person("Tiborc",76));
        Vaccination v = new Vaccination();


        Queue<Integer> result=v.getVaccinationOrder(personList);
        System.out.println(result);
        result.poll();
        System.out.println(result);


    }
}
