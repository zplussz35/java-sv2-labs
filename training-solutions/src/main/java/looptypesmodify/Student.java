package looptypesmodify;

public class Student {
    private String name;
    private boolean active;
    public Student(String name){
        this.name=name;
        active=true;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setActive(boolean active){
        this.active=active;
    }
    public String getName(){
        return this.name;
    }
    public boolean isActive(){
        return this.active;
    }

}
