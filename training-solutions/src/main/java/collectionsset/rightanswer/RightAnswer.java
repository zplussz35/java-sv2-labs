package collectionsset.rightanswer;

import java.util.Objects;

public class RightAnswer {
    private String name;

    public RightAnswer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RightAnswer)) return false;

        RightAnswer that = (RightAnswer) o;

        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
