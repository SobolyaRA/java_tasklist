insert into users(name, username, password)
values ('John Doe', 'johndoe1@mail.com', '$2y$10$BI3/d5kkcSmGF8JX6wQcUupYVop0nZGdSnTkKLUvUBmzHYB13b5fS'),
       ('Bobby Sab', 'bobbysadsab1@gmail.com', '$2y$10$BI3/d5kkcSmGF8JX6wQcUupYVop0nZGdSnTkKLUvUBmzHYB13b5fa');

insert into tasks(title, description, status, expiration_date)
values ('Buy cheese', null, 'TODO', '2023-01-29 12:00:00'),
       ('Do homework', 'Math', 'IN_PROGRESS', '2023-01-31 12:00:00'),
       ('Clean room', null, 'Done', '2023-01-23 12:00:00'),
       ('Call July', 'Meet with July', 'TODO', '2023-01-24 12:00:00');

insert into users_tasks(task_id, user_id)
values (1,1),
       (2,2),
       (3,2),
       (4,1);

insert into users_roles(user_id, role)
values  (1, 'ROLE_ADMIN'),
        (1, 'ROLE_USER'),
        (2, 'ROLE_USER');