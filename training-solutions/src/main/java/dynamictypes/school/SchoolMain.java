package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("Iskola",12);
        School school2 = new PrimarySchool("Általános iskola",8);
        School school3 = new SecondarySchool("Középiskola",4);

        System.out.println(school);
        System.out.println(school2);
        System.out.println(school3);

    }
}
