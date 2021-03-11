--creating db
create database mydb;

--using database
use mydb;

--creating tables:
create table Employee(id int primary key ,
name varchar(30) NOT NULL,
age int NOT NULL,
location varchar(20));