/*SQL SCRIPT FOR DS1*/
/*VERSION 1*/
/* Delete the tables if they already exist */
drop table if exists Users;
drop table if exists Sedes;
/* Create the schema for our tables */
/*USERS*/
create table Users (idUser int PRIMARY KEY, first_name varchar(30) NOT NULL, last_name varchar(30), work_position varchar(20) NOT NULL, password varchar(40) NOT NULL, stateUser varchar(1) NOT NULL, idSedes int);
/*SEDES*/
create table Sedes (idSedes int PRIMARY KEY, city varchar(30), address varchar(50) NOT NULL, stateSede varchar(1) NOT NULL, idUser int);
/* Inserting our data */
insert into Users values(100, 'admin', 'admin', 'admin', 'ADMIN', 't', null);
insert into Users values(111, 'Charles', 'Xavier', 'Gerente', 'gorillaz', 't', 000);
insert into Users values(222, 'Elon', 'Musk', 'Jefe de Taller', '123', 't', 1);
insert into Users values(333, 'David', 'Fincher', 'Jefe de Taller','123', 't', 2);
insert into Users values(444, 'Itachi', 'Uchiha', 'Vendedor','123', 't', 1);
insert into Users values(555, 'Lars', 'Von Trier', 'Vendedor','123', 't', 2);

insert into Sedes values(1, 'Cali', 'Calle 6 casa 7', 't', 222);
insert into Sedes values(2, 'Cali', 'Calle 18 casa 9', 't', 333);
insert into Sedes values(3, 'Medellin', 'Calle 3 casa 1', 't', null);

