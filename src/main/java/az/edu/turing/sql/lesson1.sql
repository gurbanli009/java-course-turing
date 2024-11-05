CREATE TABLE users (
                       id bigint PRIMARY KEY,
                       created_at timestamp(3) DEFAULT now(),
                       updated_at timestamp(3) DEFAULT now(),
                       email varchar(255) NOT NULL UNIQUE CHECK (email LIKE '%@%_._%'),
                       age bigint NOT NULL,
                       gender varchar(6) NOT NULL,
                       username varchar(50) NOT NULL UNIQUE,
                       bio varchar(100)
);

CREATE TABLE posts (
                       id bigint PRIMARY KEY,
                       created_at timestamp(3) DEFAULT now(),
                       updated_at timestamp(3) DEFAULT now(),
                       title varchar(255) NOT NULL,
                       views bigint DEFAULT 0,
                       tags varchar(255),
                       likes bigint DEFAULT 0,
                       saves bigint DEFAULT 0,
                       user_id bigint REFERENCES users(id)
);

CREATE TABLE comments (
                          id bigint PRIMARY KEY,
                          created_at timestamp(3) DEFAULT now(),
                          updated_at timestamp(3) DEFAULT now(),
                          comment_likes_count bigint DEFAULT 0,
                          comment_replies_count bigint DEFAULT 0,
                          post_id bigint REFERENCES posts(id),
                          user_id bigint REFERENCES users(id)
);

CREATE TABLE likes (
                       id bigint PRIMARY KEY,
                       user_id bigint REFERENCES users(id),
                       post_id bigint REFERENCES posts(id),
                       created_at timestamp(3) DEFAULT now(),
                       updated_at timestamp(3) DEFAULT now()
);

insert into users(id, email, age, gender, username, bio) values(1, 'joshgun@gmail.com', 20, 'male', 'joshgun123', 'I am Joshgun');
insert into users(id, email, age, gender, username, bio) values(2, 'anar@gmail.com', 20, 'male', 'anar123', 'I am Anar');
insert into users(id, email, age, gender, username, bio) values(3, 'adil@gmail.com', 20, 'male', 'adil123', 'I am Adil');
insert into users(id, email, age, gender, username, bio) values(4, 'kamil@gmail.com', 20, 'male', 'kamil123', 'I am Kamil');

insert into posts(id, title, views, tags, likes, saves, user_id) values(1, 'Baku night', 15, 'baku', 10, 3, 1);
insert into posts(id, title, views, tags, likes, saves, user_id) values(2, 'Abroad', 25, 'dubai', 10, 5, 1);
insert into posts(id, title, views, tags, likes, saves, user_id) values(3, 'Jungle', 8, 'nature', 10, 1, 1);
insert into posts(id, title, views, tags, likes, saves, user_id) values(4, 'Mercedes', 25, 'car', 8, 4, 3);
insert into posts(id, title, views, tags, likes, saves, user_id) values(5, 'BMW', 24, 'car', 10, 3, 3);

insert into comments(id, comment_likes_count, comment_replies_count, post_id, user_id) values(1, 3, 4, 1, 1);
insert into comments(id, comment_likes_count, comment_replies_count, post_id, user_id) values(2, 5, 1, 2, 3);
insert into comments(id, comment_likes_count, comment_replies_count, post_id, user_id) values(3, 4, 4, 2, 1);

insert into likes(id, user_id, post_id) values(1, 2, 3);
insert into likes(id, user_id, post_id) values(2, 1, 5);
insert into likes(id, user_id, post_id) values(3, 3, 4);
insert into likes(id, user_id, post_id) values(4, 2, 5);

select u.username, p.title
from users u
         inner join posts p on u.id = p.user_id;

select u.username, p.title
from users u
         left join posts p on p.user_id = u.id;

select u.username, p.title
from users u
         right join posts p on p.user_id = u.id;


