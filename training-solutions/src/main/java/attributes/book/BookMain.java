package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book= new Book("The Lord of The Rings");
        System.out.println(book.getTitle());
        book.setTitle("Harry Potter");
        System.out.println(book.getTitle());

    }
}
