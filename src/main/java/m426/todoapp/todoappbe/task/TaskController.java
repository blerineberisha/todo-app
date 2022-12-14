package m426.todoapp.todoappbe.task;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private final TaskService tService;

    @PutMapping("/{id}")
    //@CrossOrigin(origins = "*")
    //@PreAuthorize("permitAll()")
    public ResponseEntity<Task> updateTask(@PathVariable("id") int id, @RequestBody Task task){
        return ResponseEntity.ok().body(tService.updateTask(task, id));
    }
}
