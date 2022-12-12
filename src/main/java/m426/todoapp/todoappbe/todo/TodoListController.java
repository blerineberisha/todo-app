package m426.todoapp.todoappbe.todo;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

@AllArgsConstructor
@RequestMapping(value = {"/todolist"})
public class TodoListController {
@Autowired
  private final TodoListService listService;
  @PostMapping("/")
  public ResponseEntity<TodoList> createToDoList ( @RequestBody TodoList todoList){
    int userID = 2;
    return new ResponseEntity<>(listService.createToDoList(todoList, userID), HttpStatus.CREATED);
  }
}
