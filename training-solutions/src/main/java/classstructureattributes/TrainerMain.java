package classstructureattributes;

public class TrainerMain {
    public static void main(String[] args) {
        Trainer john = new Trainer();
        john.name = "John Doe";
        john.yearOfBirth = 1980;
        System.out.println(john.name);
        System.out.println(john.yearOfBirth);

        Trainer jack = new Trainer();
        jack.name = "Jack Doe";
        System.out.println(jack.name);
    }
}
