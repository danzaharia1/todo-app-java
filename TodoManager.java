import java.util.ArrayList;
import java.util.List;

public class TodoManager {
    private List<Todo> todos;

    public TodoManager() {
        // Initial list of items (analogous to data.js)
        this.todos = new ArrayList<>();
        todos.add(new Todo(1, "Review design mocks", false));
        todos.add(new Todo(2, "Set up user research session for code prediction feature", false));
        todos.add(new Todo(3, "Draft technical spec for new shopping cart API", true));
        todos.add(new Todo(4, "Prepare performance review doc for 1:1 with Kate", false));
    }

    public List<Todo> getAllTodos() {
        return todos;
    }

    public void toggleCompletion(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.setCompleted(!todo.isCompleted());
                return;
            }
        }
    }

    public void displayTodos() {
        System.out.println("\n--- To-Do List ---");
        // Minor Task: The header display logic will go here
        
        System.out.println("--- Tasks ---");
        for (Todo todo : todos) {
            System.out.println(todo); 
        }
    }
}