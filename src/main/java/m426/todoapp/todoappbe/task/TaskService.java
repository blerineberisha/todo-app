package m426.todoapp.todoappbe.task;

import java.util.List;

public interface TaskService {
    List<Task> findTasksByTodoListId(int listId);
}
