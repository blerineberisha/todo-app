package m426.todoapp.todoappbe.task;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
@Slf4j
@AllArgsConstructor
public class TaskController {

    @Autowired
    private final TaskService taskService;

    @GetMapping("/{listId}")
    public ResponseEntity<List<Task>> findTasksByTodoListId(@PathVariable int listId){
        return new ResponseEntity<>(taskService.findTasksByTodoListId(listId), HttpStatus.OK);
    }

}
