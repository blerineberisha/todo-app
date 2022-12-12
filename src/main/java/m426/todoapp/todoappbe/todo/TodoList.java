package m426.todoapp.todoappbe.todo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import lombok.experimental.FieldDefaults;
import m426.todoapp.todoappbe.task.Task;

import java.util.HashSet;
import java.util.Set;
import m426.todoapp.todoappbe.users.Users;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TodoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todoList_id", nullable = false)
    int todoListId;
    @Column(name = "name", length = 20)
    String name;
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST}, mappedBy = "todoList")
    @JsonBackReference
    Set<Task> tasks = new HashSet<>();
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner", referencedColumnName = "users_id", nullable = false)
    private Users user;
}
