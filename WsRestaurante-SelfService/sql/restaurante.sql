drop database if exists restaurante;

create database restaurante;
use restaurante;

create table cliente(
    id_cliente integer not null auto_increment primary key,
    cedula varchar(20) not null,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
    direccion varchar(100) not null,
    telefono varchar(20),
    correo_electronico varchar(100) not null,
    edad integer not null,
    fecha_nacimiento date not null,
    genero varchar(20) not null,
    fecha_registro timestamp not null default current_timestamp,
    fecha_modificacion timestamp not null default current_timestamp on update current_timestamp
);