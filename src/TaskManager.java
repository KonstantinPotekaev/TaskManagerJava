import java.util.*;

public class TaskManager {
    private Integer createId = 1;
    private Map<Integer, List<Object>> tasks = new HashMap<>();
    public void addtask(Date deadline, String name, String priority){
        tasks.put(createId,List.of(deadline, name, priority));
        System.out.println(tasks.get(1));
    }
    p

}

