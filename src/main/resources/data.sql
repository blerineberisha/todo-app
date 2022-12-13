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
    (5, 'SEE_OWN_TODOLIST'),
    (6, 'CREATE_TODOLIST'),
    (7, 'CREATE_TASKS'),
    (8, 'DELETE_TODOLIST'),
    (9, 'DELETE_TASK'),
    (10, 'EDIT_TASK'),
    (11, 'EDIT_TODOLIST'),
    (12, 'EDIT_USER');

insert into vinosfue_todoapp.role_authority(role_id, authority_id)
VALUE
    (1, 1),
    (1, 3),
    (1, 4),
    (1, 12),
    (2, 2),
    (2, 5),
    (2, 6),
    (2, 7),
    (2, 8),
    (2, 9),
    (2, 10),
    (2, 11);

insert into users(users_id, email, first_name, last_name, password, username, id_role)
VALUE
    (1, 'john.doe@gmail.com', 'John', 'Doe', '1234', 'john.doe', 1),
    (2, 'julie,gray@gmail.com', 'Julie', 'Gray', 'julie123', 'julie.gray', 2);


insert into todo_list(todo_list_id, name, id_users)
VALUE
    (1, 'School', 2),
    (2, 'Work', 2);

insert into task(task_id, description, name, state, id_todo_list)
    VALUE
    (1, 'Write book summary', 'English', 'OPEN', 1),
    (2, 'Create base structure of webshop', 'IT', 'OPEN', 1),
    (3, 'Create get and put endpoint for user', 'User Endpoints', 'IN_PROGRESS', 2);