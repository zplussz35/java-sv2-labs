package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Zoltán","HSV4335");
        Address address = new Address("Hungary","Debrecen","Nagy utca 2.","k9");
        person.moveTo(address);

        System.out.println(person.personToString());

        person.correctDate("László","HPV54");
        System.out.println();
        System.out.println(person.personToString());
    }
}
