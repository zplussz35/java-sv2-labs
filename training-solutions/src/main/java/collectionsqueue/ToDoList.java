package collectionsqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {
    private List<ToDo> todos;
    public ToDoList(List<ToDo> todos) {
        this.todos = todos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();

        for (ToDo t : todos) {
            if (t.isUrgent()) {
                result.addFirst(t);
            } else {
                result.addLast(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<ToDo> todos = new ArrayList<>();
        todos.add(new ToDo("enni",false));
        todos.add(new ToDo("inni",true));
        todos.add(new ToDo("anni",false));
        todos.add(new ToDo("álmodni",false));
        todos.add(new ToDo("kocogni",true));
        todos.add(new ToDo("TV-zni",false));
        todos.add(new ToDo("szeretni",true));
        ToDoList todoList = new ToDoList(todos);

        Deque<ToDo> result=todoList.getTodosInUrgencyOrder();
        System.out.println(result);
        result.pop();
        System.out.println(result);
    }
}
