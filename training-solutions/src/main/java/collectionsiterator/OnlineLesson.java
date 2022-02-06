package collectionsiterator;

import java.time.LocalDateTime;

public class OnlineLesson {
    private String teacherName;
    private String nameOfLesson;
    private LocalDateTime startOfLesson;

    public OnlineLesson(String teacherName, String nameOfLesson, LocalDateTime startOfLesson) {
        this.teacherName = teacherName;
        this.nameOfLesson = nameOfLesson;
        this.startOfLesson = startOfLesson;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getNameOfLesson() {
        return nameOfLesson;
    }

    public LocalDateTime getStartOfLesson() {
        return startOfLesson;
    }
}
