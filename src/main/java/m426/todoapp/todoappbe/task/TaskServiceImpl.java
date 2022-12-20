package m426.todoapp.todoappbe.task;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    public TaskRepository taskRepository;

    @Override
    public List<Task> findTasksByTodoListId(int listId){
        List<Task> todolist = taskRepository.findAllByTodoListTodoListId(listId);
        return todolist;
    }
}
