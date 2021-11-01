package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        University uni = new University();
        Person person = new Person("Zoltán","15.zoltan@gmail.com",
                "187-5236-374","37454573-73452-37354","06-70-4445-654");
        Student student = new Student(person,"KIIFOQ","73453845");

        Person person2 = new Person("László","laci@gmail.com",
                "187-5236-374","37454573-73452-37354","06-70-4445-654");
        Student student2 = new Student(person,"SO65GH","73642845");

        Person person3 = new Person("Zoltán","15.zoltan@gmail.com",
                "187-5236-374","37454573-73452-37354","06-70-4445-654");
        Student student3 = new Student(person,"KIIFOQ","73453845");

        uni.addStudent(student);
        uni.addStudent(student2);
        uni.addStudent(student3);

        System.out.println(uni.getStudents());

        System.out.println("student==student2?: "+uni.areEqual(student,student2));
        System.out.println("student==student3?: "+uni.areEqual(student,student3));


    }
}
