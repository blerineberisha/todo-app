package m426.todoapp.todoappbe.users;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import m426.todoapp.todoappbe.role.Role;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {
    @Id
    @Column(name = "users_id")
    int usersId;
    @Column(name = "username", length = 20, unique = true)
    String username;
    @Column(name = "email", length = 50, unique = true)
    String email;
    @Column(name = "password")
    String password;
    @Column(name = "first_name", length = 20)
    String firstName;
    @Column(name = "last_name", length = 20)
    String lastName;
    @ManyToOne(optional = false, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_role", nullable = false, referencedColumnName = "role_id")
    Role role;
}

