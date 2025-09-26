public class App {
    public static void main(String[] args) {
        TodoManager manager = new TodoManager();
        
        // Initial display
        manager.displayTodos();

        // Example of simple state change logic
        System.out.println("\n--- Toggling Todo #1 ---");
        manager.toggleCompletion(1);
        
        // Final display
        manager.displayTodos();
        
        // The participant will modify this file or TodoManager to demonstrate the new 'dueDate' feature.
    }
}