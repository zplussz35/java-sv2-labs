package compositionlist;

import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Books books = new Books();

        System.out.print("Hány könyvcímet szeretne megadni?: ");
        int titledb=sc.nextInt();
        sc.nextLine();
        String title;
        for(int i=0;i<titledb;i++){
            System.out.print((i+1)+". cím: ");
            title= sc.nextLine();
            books.addBook(title);
        }

        System.out.println(books.getBooks());

        System.out.print("Melyik könyvnek tudja a szerzőjét?\nAdja meg a címét: ");
        title=sc.nextLine();

        System.out.print("Adja meg a szerzőt: ");
        String author=sc.nextLine();

        books.findBookAndSetAuthor(title,author);

        System.out.println(books.getBooks());
    }
}
