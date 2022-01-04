package schoolrecords;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        this.marks.add(mark);
    }

    public double calculateAverage() {
        if (marks.isEmpty()) {
            return 0.0;
        }
        double result = 0.0;
        for (Mark mark : marks) {
            result += mark.getMarkType().getMark();
        }
        result = result / marks.size();
        return BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double calculateSubjectAverage(Subject subject) {
        double result = 0.0;
        int count = 0;
        boolean found = false;
        for (Mark mark : marks) {
            if (mark.getSubject().getName().equals(subject.getName())) {
                found = true;
                result += mark.getMarkType().getMark();
                count++;
            }
        }
        if (!found) {
            return 0.0;
        }
        result = result / count;
        return BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + " marks: ");

        for (Mark mark : marks) {
            sb.append(mark.getSubject().getName()).append(": ");
            sb.append(mark);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }


}
