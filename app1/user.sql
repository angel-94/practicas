drop database if exists test;
create database test;
use test;

create table user(
	user_id int not null,
    first_name varchar(50),
    last_name varchar(50),
    gener varchar(10),
    city varchar(30),
    primary key(user_id)
);

insert into user values  
	(906, 'Ankush', 'Thakur', 'male', 'gurgaon'),
	(907, 'Anamika', 'Singh', 'female', 'meerut'),
	(908, 'Shweta', 'Gupta', 'female', 'gurgaon'),
	(909, 'Rajesh', 'Chauhan', 'male', 'noida'),
	(911, 'Andrew', 'Symonds', 'male', 'delhi');
 
 select * from user;