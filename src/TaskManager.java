import java.io.File;
import java.nio.file.Path;
import java.security.PublicKey;
import java.util.*;
import java.io.FileReader;
import java.util.Arrays;
import com.opencsv.CSVReader ;

public class TaskManager {
    private Integer counterdelete = 0;

    private List<Task> tasks = new ArrayList<>();
    public void addtask(String taskname, String username, String deadline, Priority priority){
        var task = new Task(taskname,username,deadline, priority);
        tasks.add(task);

    }

    public void downloadTasks(String path){
        File f = new File(path);
        if (f.exists() && !f.isDirectory()){
            CSVReader reader = new CSVReader(new FileReader(path),',', '"',1);
        }
    }

    public void saveTasks(String path){

    }
    public void printTasks(){
        var space = "         ";
        System.out.println("ID"+
                "         "+
                "Task name"+
                "         "+
                "Priority"+
                "         "+
                "Username"+
                "         "+
                "Creation date"+
                "         "+
                "Change date");
        for(int i = 0; i<tasks.size();i++){
            System.out.print(tasks.get(i).id + space);
            System.out.print(tasks.get(i).taskname+ space);
            System.out.print(tasks.get(i).priority+space);
            System.out.print(tasks.get(i).username+ space);
            System.out.print(tasks.get(i).changeDate+space);
            System.out.print(tasks.get(i).changeDate+space);
            System.out.print("\n");
        }
    }
    public void deletetask(Integer id){
        tasks.remove(id-counterdelete);
    }

    public void changetask(Integer id, String taskname){
        tasks.get(id-counterdelete).taskname = taskname;
        tasks.get(id-counterdelete).changeDate = Calendar.getInstance().getTime();
    }
    public void changeuser(Integer id, String username){
        tasks.get(id-counterdelete).username = username;
        tasks.get(id-counterdelete).changeDate = Calendar.getInstance().getTime();
    }
    public void change(Integer id, Priority priority){
        tasks.get(id-counterdelete).priority = priority;
        tasks.get(id-counterdelete).changeDate = Calendar.getInstance().getTime();
    }
    public void change(Integer id, String deadline){
        tasks.get(id-counterdelete).deadline = deadline;
        tasks.get(id-counterdelete).changeDate = Calendar.getInstance().getTime();
    }


    private class Task {
        static Integer creatId = 1;
        private Integer id;
        private String username, taskname;
        private Date creationDate, changeDate;
        private String deadline;
        private Priority priority;

        private Task( String taskname, String username, String deadline, Priority priority){
            this.id = creatId;
            creatId++;
            this.username = username;
            this.creationDate = Calendar.getInstance().getTime();
            this.deadline = deadline;
            this.taskname = taskname;
            this.priority = priority;
        }


    }
}

