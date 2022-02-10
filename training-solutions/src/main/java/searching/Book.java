package searching;

import java.util.Comparator;

public class Book implements Comparable<Book>{
    private int id;
    private String title;
    private String author;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book o) {
        if(author.compareTo(o.getAuthor())!=0){
            return author.compareTo(o.getAuthor());

        } else{
            return title.compareTo(o.getTitle());
        }
    }
}
