package m426.todoapp.todoappbe.todo;

import org.springframework.stereotype.Service;


public interface TodoListService {
TodoList createToDoList(TodoList todoList, int userId);
}
