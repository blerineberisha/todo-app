package m426.todoapp.todoappbe.todo;

import java.util.Optional;
import javax.management.InstanceNotFoundException;

public interface TodoListService {
  Optional<TodoList> getAllToDoLists() throws NullPointerException, InstanceNotFoundException;

}
