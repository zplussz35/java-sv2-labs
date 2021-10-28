package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        /*Book book;

        System.out.println(new Book());
        //System.out.println(book);

        Book book2 = new Book();
        System.out.println(book2);

        Book book3 = null;
        System.out.println(book3);

        Book anotherBook = new Book();
        System.out.println(book2==anotherBook);
        anotherBook=book2;
        System.out.println(book2==anotherBook);

*/

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;

        Book[] books = {book1,book2,book3};
        List<Book> bookList = new ArrayList<>(Arrays.asList(book1,book2,book3));
        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(book1);
        bookList2.add(book2);
        bookList2.add(book3);

        System.out.println(Arrays.asList(books));
        System.out.println(bookList);
        System.out.println(bookList2);
    }



}
