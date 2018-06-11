public class TodoItem implements Comparable<TodoItem> {

    private Importance importance;
    private int priority;
    private String description;

    public TodoItem(Importance importance, int priority, String description) {
        this.importance = importance;
        this.priority = priority;
        this.description = description;
    }

    public int compareTo(TodoItem todo) {
        if (this.importance == Importance.HIGH && todo.importance == Importance.MEDIUM) {
            return -1;
        }
        if (this.importance == Importance.HIGH && todo.importance == Importance.LOW) {
            return -1;
        }


        if (this.importance == Importance.LOW && todo.importance == Importance.HIGH) {
            return 1;

        }
        if (this.importance == Importance.LOW && todo.importance == Importance.MEDIUM) {
            return 1;

        }
        if (this.importance == Importance.MEDIUM && todo.importance == Importance.HIGH) {
            return 1;

        }
        if (this.importance == Importance.MEDIUM && todo.importance == Importance.LOW) {
            return -1;

        }

        if (this.importance == todo.importance) {
            if (this.priority < todo.priority) {
                return -1;

            }
            if (this.priority > todo.priority) {
                return 1;

            }
        }

        return 0;
    }

    @Override
    public String toString() {
        return "TODO ITEM: " + description + " | importance: " + this.importance + " | priority: " + this.priority;
    }
}
