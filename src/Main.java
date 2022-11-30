import java.util.Calendar;
import java.util.Date;
import java.util.logging.ConsoleHandler;

public class Main {
    public static void main(String[] args) {
        var taskmanager = new TaskManager();
        taskmanager.addtask("Add something", "Konstantin","29.11.2022", Priority.HIGH);
        taskmanager.printTasks();
    }
}