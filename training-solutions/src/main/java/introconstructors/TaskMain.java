package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("feladat1","kukát levinni");
        task.start();
        task.setDuration(200);

        System.out.println("Feladat címe: "+task.getTitle());
        System.out.println("Feladat leírása: "+task.getDescription());
        System.out.println("Feladat kezdő időpontja: "+task.getStartDateTime());
        System.out.println("Feladat időtartama: "+task.getDuration());

    }
}
