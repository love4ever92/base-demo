create table if not exists t_user (
ID varchar(32) not null primary key,
user_name varchar(100)
);


create table if not exists t_order (
ID varchar(32) not null primary key,
user_id varchar(32),
money varchar(20)
);

