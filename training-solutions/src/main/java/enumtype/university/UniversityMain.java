package enumtype.university;

public class UniversityMain {
    public static void main(String[] args) {
        University[] uniArray=University.values();

        for (int i = 0; i < uniArray.length; i++) {
            System.out.println(uniArray[i].name()+" "+uniArray[i].getName());
        }
    }
}
