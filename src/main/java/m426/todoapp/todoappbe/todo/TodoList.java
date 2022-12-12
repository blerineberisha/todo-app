package m426.todoapp.todoappbe.todo;

import javax.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import m426.todoapp.todoappbe.task.Task;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TodoList {
    @Id
    @Column(name = "todoList_id")
    int todoListId;
    @Column(name = "name", length = 20)
    String name;
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_task", nullable = false, referencedColumnName = "task_id")
    Set<Task> task = new HashSet<>();
}
