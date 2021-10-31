package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person p1;
        Person p2;

        Person person1= new Person("Zoltán",21);
        p1=person1;
        p2=p1;
        p2.setName("László");

        System.out.println(p1.getName()+" "+p1.getAge());
        System.out.println(p2.getName()+" "+p2.getAge());



        int a = 24;
        int b=a;
        b+=1;

        System.out.println(a);
        System.out.println(b);


        Person person2 = new Person("Kriszti",19);
        p1=person2;

        System.out.println(p1.getName()+" "+p1.getAge());
        System.out.println(p2.getName()+" "+p2.getAge());
    }
}
