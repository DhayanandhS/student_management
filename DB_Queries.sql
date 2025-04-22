CREATE DATABASE student_management;

use student_management;

create table admin(
    admin_id int auto_increment primary key,
    username varchar(50) not null unique,
    password varchar(50) not null
);

insert into admin (username, password) values ('dhaya','dhaya1234'); 

select * from admin;

create table students(
    student_id int auto_increment primary key,
    name varchar(100) not null,
    age int,
    grade varchar(10),
    email varchar(100),
    phone varchar(15),
    address text
);

insert into students(name, age, grade, email, phone, address) values
('Aarav', 15, '10', 'aarav@gmail.com', '2956147874', 'Chennai'),
('Diya Sharma', 14, '9', 'diya@example.com', '9123456780', 'Coimbatore');

