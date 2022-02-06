package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {
    private List<OnlineLesson> onlineLessons=new ArrayList<>();

    public void addNewLesson(OnlineLesson lesson){
        onlineLessons.add(lesson);
    }
    public List<OnlineLesson> getLessonsByTitle(String title){
        List<OnlineLesson> result= new ArrayList<>();
        Iterator<OnlineLesson> i = onlineLessons.iterator();
        while(i.hasNext()){
            OnlineLesson lesson=i.next();
            if(lesson.getNameOfLesson().equals(title)){
                result.add(lesson);
            }
        }
        return result;
    }
    public void removeLesson(LocalDateTime startTime){
        Iterator<OnlineLesson> i = onlineLessons.iterator();
        while(i.hasNext()){
            OnlineLesson lesson=i.next();
            if(lesson.getStartOfLesson().equals(startTime)){
                i.remove();
            }
        }

    }
}
