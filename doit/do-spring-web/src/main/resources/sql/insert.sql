create table users(
  name varchar(100),
  age integer,
  email varchar(100),
  sex BOOLEAN
);

insert into users values('Matthey', 34, 'Matthey@bk.ru', TRUE);

select * from project1;

ALTER TABLE users ADD id SERIAL;

alter table users add password varchar(100) default 1234;