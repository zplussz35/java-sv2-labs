package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Zoltán");
        note.setTopic("Zoo");
        note.setText("Don't forget to visit the new zoo in the city center!");
        System.out.println(note.getNoteText());
    }
}
