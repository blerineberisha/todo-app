package m426.todoapp.todoappbe.task;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import m426.todoapp.todoappbe.state.StateType;
import m426.todoapp.todoappbe.todo.TodoList;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Task {
    @Id
    @Column(name = "task_id")
    int taskId;
    @Column(name = "name", length = 20)
    String name;
    @Column(name = "description", length = 100)
    String description;
    @ManyToOne(optional = false, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @Enumerated(EnumType.STRING)
    StateType state;
    @ManyToOne(optional = false, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    TodoList todoList;
}
