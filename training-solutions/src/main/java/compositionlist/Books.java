package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> books = new ArrayList<>();

    public void addBook(String title){
        books.add(title);
    }

    public void findBookAndSetAuthor(String title, String author){
        for(int i = 0; i<books.size();i++){
            if(title.equals(books.get(i))){
                books.set(i,author+": "+title);
            }
        }
    }

    public List<String> getBooks() {
        return books;
    }
}
