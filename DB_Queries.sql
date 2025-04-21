CREATE DATABASE student_management;

use student_management;

create table admin(
    admin_id int auto_increment primary key,
    username varchar(50) not null unique,
    password varchar(50) not null
);

insert into admin (username, password) values ('dhaya','dhaya1234'); 

select * from admin;
