package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable {
    private List<String> tasks;

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep() {
        if (tasks.size() != 0) {
            tasks.remove(tasks.size() - 1);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        while (!tasks.isEmpty()){
            nextStep();

        }

    }
}
