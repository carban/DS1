/*SQL SCRIPT FOR DS1*/
/*VERSION 1*/
/* Delete the tables if they already exist */
drop table if exists Users cascade;
drop table if exists Sedes cascade;
drop table if exists Producto cascade;
drop table if exists Inventario cascade;
drop table if exists Venta cascade;
drop table if exists Cotiza cascade;
drop table if exists Orden cascade;
drop table if exists vendedoresSede cascade;

/* Create the schema for our tables */
/*USERS*/
create table Users (idUser int PRIMARY KEY, first_name varchar(30) NOT NULL, last_name varchar(30), telefono varchar(10), direccion varchar(30), work_position varchar(20) NOT NULL, password varchar(40) NOT NULL, stateUser varchar(8) NOT NULL);
/*SEDES*/
create table Sedes (idSedes SERIAL PRIMARY KEY, city varchar(30), address varchar(50) NOT NULL, stateSede varchar(8) NOT NULL, idUser int UNIQUE, FOREIGN KEY (idUser) REFERENCES Users (idUser));

/*TABLA VENDEDOR SEDE*/
create table vendedoresSede (idSedes int, idUser int UNIQUE, PRIMARY KEY(idSedes, idUser), FOREIGN KEY (idUser) REFERENCES Users (idUser), FOREIGN KEY (idSedes) REFERENCES Sedes (idSedes));

/*PRODUCTO*/
create table Producto (idProducto int PRIMARY KEY, nombre varchar(30), descripcion varchar(50) NOT NULL, color varchar(20) NOT NULL,
largo numeric, ancho numeric, precio numeric );
/*INVENTARIO*/
--INVENTARIO VA A ALMACENAR LOS PRODUCTOS DE CADA SEDE, CADA PRODUCTO TIENE EL ID de la sede a la que corresponde
create table Inventario (idProducto int, idSedes int, PRIMARY KEY (idProducto, idSedes), FOREIGN KEY (idProducto) REFERENCES Producto (idProducto), FOREIGN KEY (idSedes) REFERENCES Sedes (idSedes));
/*VENTA*/
create table Venta (idVenta int PRIMARY KEY, idUser int, precioTotal decimal, fecha date, FOREIGN KEY (idUser) REFERENCES Users (idUser));
/*COTIZACION*/
create table Cotiza (idUser int, idProducto int, fechaCot date, precioCot numeric, PRIMARY KEY (idUser, idProducto), FOREIGN KEY (idUser) REFERENCES Users (idUser), FOREIGN KEY (idProducto) REFERENCES Producto (idProducto));
/*ORDENES*/
create table Orden (idOrden int PRIMARY KEY, descripcion varchar(50), cantidad_pedido int, precioPedido numeric);
/* Inserting our data */
insert into Users values(100, 'admin', 'admin', '5513222','casa 4','admin', 'ADMIN', 'Activo');
insert into Users values(111, 'Charles', 'Xavier', '1111','casa 1', 'Gerente', 'gorillaz', 'Activo');
insert into Users values(2488, 'Camilo', 'Sanchez', '2222','casa 2', 'Gerente', '2488', 'Activo');
insert into Users values(222, 'Elon', 'Musk', '33333','casa 3', 'Jefe de Taller', '123', 'Activo');
insert into Users values(333, 'David', 'Fincher', '4444','casa 6', 'Jefe de Taller','123', 'Activo');
insert into Users values(444, 'Itachi', 'Uchiha', '5555','casa 14', 'Vendedor','123', 'Activo');
insert into Users values(555, 'Lars', 'Von Trier', '7777','casa 10', 'Vendedor','123', 'Inactivo'); --Inactive
insert into Users values(666, 'Alfred', 'Hitchcock', '63200','casa 30', 'Vendedor','123', 'Activo');
insert into Users values(777, 'Chritopher', 'Nolan', '63110','casa 80', 'Vendedor','123', 'Activo');
/*Sedes*/
insert into Sedes (city, address, stateSede, idUser) values ('Cali', 'Calle 6 casa 7', 'Activo', 222);
insert into Sedes (city, address, stateSede, idUser) values ('Palmira', 'Calle 18 casa 9', 'Activo', 333);
/*vendedores sedes*/
/*La idea es que solo hayan ids de vendedores*/
insert into vendedoresSede values (1, 444);
insert into vendedoresSede values (2, 666);
insert into vendedoresSede values (2, 777);
