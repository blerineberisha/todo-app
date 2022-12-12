package m426.todoapp.todoappbe.todo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository extends JpaRepository<TodoList, Integer> {

  @Query(value = "SELECT TodoList.name, TodoList .tasks from TodoList")
  Optional<TodoList> findAllByName();
}
