package classstructureconstructors;

public class Book {
    private String author;
    private String title;
    private String regNumber;

    public Book(String author,String title){
        this.author=author;
        this.title=title;

    }

    public void register(String regNumber){
        this.regNumber=regNumber;
    }

    public void setAuthor(String author){
        this.author=author;
    }
    public void  setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public String getRegNumber(){
        return regNumber;
    }
}
