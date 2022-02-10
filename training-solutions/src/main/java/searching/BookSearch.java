package searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookSearch {
    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title){
        if(author==null|| author.isEmpty() || title==null||title.isEmpty()){
            throw new IllegalArgumentException("author or title should not be empty!");
        }
        Book toFind=new Book(author,title);
        int index=Collections.binarySearch(books,toFind);
        if (index < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        return books.get(index);
    }
}
