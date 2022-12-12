package m426.todoapp.todoappbe.todo;

import java.util.Optional;
import javax.management.InstanceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoListServiceImpl implements TodoListService{

  @Autowired
  private TodoListRepository todoListRepository;

  @Override
  public Optional<TodoList> getAllToDoLists() throws NullPointerException, InstanceNotFoundException {
    Optional<TodoList> toDoLists = todoListRepository.findAllByName();
    if (!(toDoLists.isEmpty() || toDoLists == null)) {
      return toDoLists;
    } else
      throw new NullPointerException("Location List is empty");
  }
}
