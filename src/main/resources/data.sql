insert into vinosfue_todoapp.role(role_id, role_name)
VALUES
    (1, 'ADMIN'),
    (2, 'USER');

insert into vinosfue_todoapp.authority(authority_id, authority_name)
VALUE
    (1, 'SEE_ALL_USERS'),
    (2, 'SEE_OWN_TASKS'),
    (3, 'SEE_ALL_TASKS'),
    (4, 'SEE_ALL_TODOLIST'),
    (5, 'SEE_OWN_TODOLIST');

insert into vinosfue_todoapp.role_authority(id_role, id_authority)
VALUE
    (1, 1),
    (1, 3),
    (1, 4),
    (2, 2),
    (2, 5);

insert into users(users_id, email, first_name, last_name, password, username, id_role)
VALUE
    (1, 'john.doe@gmail.com', 'John', 'Doe', '1234', 'john.doe', 1),
    (2, 'julie,gray@gmail.com', 'Julie', 'Gray', 'julie123', 'julie.gray', 2);


insert into todo_list(todo_list_id, name, id_users)
           VALUE
           (1, 'School', 2);

insert into task(task_id, description, name, state, id_todo_list)
    VALUE
    (1, 'Write book summary', 'English', 'OPEN', 1)
    (2, 'Create base structure of webshop', 'IT', 'OPEN', 1);