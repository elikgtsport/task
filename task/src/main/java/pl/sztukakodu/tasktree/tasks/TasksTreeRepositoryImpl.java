package pl.sztukakodu.tasktree.tasks;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Component
public class TasksTreeRepositoryImpl implements TasksTreeRepository {

    private final Set<TaskTree> tasks = new HashSet();

    @Override
    public void add(TaskTree task) {
        tasks.add(task);
    }

    @Override
    public List<TaskTree> fetchAll() {
        return new ArrayList<>(tasks);
    }
}
