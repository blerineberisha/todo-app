package m426.todoapp.todoappbe.auth;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import m426.todoapp.todoappbe.role.Role;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Auth {
    @Id
    @Column(name = "authority_id")
    int authId;
    @Column(name = "authority_name", length = 20, unique = true)
    String authName;
    @ManyToMany(mappedBy = "authorities")
    Set<Role> roles = new HashSet<>();
}
