package pl.sztukakodu.tasktree.tasks;

import java.util.List;

public interface TasksTreeRepository {

    void add(TaskTree task);

    List<TaskTree> fetchAll();

}
