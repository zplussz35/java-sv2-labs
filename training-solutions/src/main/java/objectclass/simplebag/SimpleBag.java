package objectclass.simplebag;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    private List<Object> items = new ArrayList<>();
    private int cursor;

    public SimpleBag(){
        cursor=-1;

    }

    public void putItem(Object item){
        this.items.add(item);
    }
    public boolean isEmpty(){
        if(size()==0){
            return true;
        }
        return false;
    }
    public int size(){
        return items.size();
    }
    public void beforeFirst(){
        cursor=-1;
    }
    public boolean hasNext(){
        if(cursor<size()-1){
            return true;
        }
        return false;
    }
    public Object next(){
        this.cursor++;
        return items.get(cursor);

    }
    public boolean contains(Object item){
        return items.contains(item);
    }
    public int getCursor(){
        return cursor;
    }

}
