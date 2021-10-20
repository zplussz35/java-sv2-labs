package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Agatha Christie","Murder");
        book.register("RG-154288");
        System.out.println("your book:");
        System.out.println("-author: "+book.getAuthor());
        System.out.println("-title: "+book.getTitle());
        System.out.println("-registration number: "+book.getRegNumber());
    }
}
