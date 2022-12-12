package m426.todoapp.todoappbe.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@RequiredArgsConstructor
@Service
public class TodoListServiceImpl implements TodoListService{
  @Autowired
  private final TodoListRepository todoListRepository;
  @Override
  public TodoList createToDoList(TodoList todoList, int userId) {
    if(userId == todoList.getUser().getUsersId()){
      return (TodoList) todoListRepository.save(todoList);
    }
    else throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED);
  }
}
