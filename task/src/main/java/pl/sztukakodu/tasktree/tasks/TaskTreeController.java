package pl.sztukakodu.tasktree.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/")
public class TaskTreeController {

   private final static Logger log = LoggerFactory.getLogger(TaskTreeController.class);

    private final TasksTreeRepository tasksRepository;

    @Autowired
    public TaskTreeController(TasksTreeRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    @GetMapping
    public List<TaskTree> getTasks() {
        log.info("Pobieramy zadanie z systemu");
        return tasksRepository.fetchAll();
    }

    @PostMapping

    public void addTask(@RequestBody TaskTree task) {
        log.info("Dodajemy zadanie do systemu {}", task);
        tasksRepository.add(task);
    }


}
