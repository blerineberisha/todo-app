package m426.todoapp.todoappbe.todo;

import javax.management.InstanceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

  @Autowired
  private TodoListService todoListService;

  @GetMapping
  public ResponseEntity findAllTodoLists() {
    try {
      return ResponseEntity.status(HttpStatus.OK).body(todoListService.getAllToDoLists());
    } catch (InstanceNotFoundException e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    } catch (NullPointerException e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
  }
}
