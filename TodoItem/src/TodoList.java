import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TodoList {

    private Queue<TodoItem> todos;

    public TodoList() {
        todos = new PriorityQueue<>();
    }

    public void add(Importance importance, int priority, String description) {
        TodoItem todo = new TodoItem(importance, priority, description);
        todos.add(todo);
    }

    public TodoItem remove() {
        return todos.remove();
    }

    public boolean isEmpty() {
        return todos.isEmpty();
    }

}



