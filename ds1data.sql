/*SQL SCRIPT FOR DS1*/
/*VERSION 1*/
/* Delete the tables if they already exist */
drop table if exists Users;
drop table if exists Sedes;
/* Create the schema for our tables */
/*USERS*/
create table Users (idUser int PRIMARY KEY, first_name varchar(30) NOT NULL, last_name varchar(30), telefono varchar(10), direccion varchar(30), work_position varchar(20) NOT NULL, password varchar(40) NOT NULL, stateUser varchar(1) NOT NULL);
/*SEDES*/
create table Sedes (idSedes int PRIMARY KEY, city varchar(30), address varchar(50) NOT NULL, stateSede varchar(1) NOT NULL, idUser int);
/* Inserting our data */
insert into Users values(100, 'admin', 'admin', '5513222','casa 4','admin', 'ADMIN', 'T');
insert into Users values(111, 'Charles', 'Xavier', '1111','casa 1', 'Gerente', 'gorillaz', 'T');
insert into Users values(2488, 'Camilo', 'Sanchez', '2222','casa 2', 'Gerente', '2488', 'T');
insert into Users values(222, 'Elon', 'Musk', '33333','casa 3', 'Jefe de Taller', '123', 'T');
insert into Users values(333, 'David', 'Fincher', '4444','casa 6', 'Jefe de Taller','123', 'T');
insert into Users values(444, 'Itachi', 'Uchiha', '5555','casa 14', 'Vendedor','123', 'T');
insert into Users values(555, 'Lars', 'Von Trier', '7777','casa 10', 'Vendedor','123', 'T');

insert into Sedes values(1, 'Cali', 'Calle 6 casa 7', 'T', 222);
insert into Sedes values(2, 'Palmira', 'Calle 18 casa 9', 'T', 333);


