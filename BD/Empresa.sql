create database Empresa
use Empresa

create table departamento(
Codigo_depa int primary key not null identity(1,1), 
Nombre_depa varchar (20),
Presupuesto_anual float 
)

create table poseen(
Codigo_depa int,
Codigo_centro int,
foreign key (Codigo_depa) references departamento (Codigo_depa),
foreign key (Codigo_centro) references centro_trabajo (Codigo_centro)
)

create table centro_de_trabajo(
Codigo_centro int primary key not null identity(1,1), 
Nombre_centro varchar (20),
direccion_centro varchar(20))

create table dirige (
Codigo_emple int ,
Codigo_centro int ,
foreign key (Codigo_emple) references empleado (Codigo_emple),
foreign key (Codigo_centro) references centro_trabajo (Codigo_centro)
)

create table empleado (
Codigo_emple int primary key not null identity (1,1),
telefono_emple int ,
fecha_alta date ,
nombre_emple varchar (20),
numero_de_hijos int ,
salario money )


create table tendran(
Codigo_depa int ,
Codigo_emple int,
foreign key (Codigo_emple) references empleado (Codigo_emple),
foreign key (Codigo_depa) references departamento (Codigo_depa)
)

create table tienen(
Codigo_emple int ,
Codigo_hijo int,
foreign key (Codigo_emple) references empleado (Codigo_emple),
foreign key (Codigo_hijo) references hijo_empleado (Codigo_hijo)
)

create table hijo_empleado(
Codigo_hijo int primary key not null identity (1,1),
nombre_hijo varchar (20),
fecha_nacimiento date 
)

create table obtienen(
Codigo_emple int , 
Codigo_habi int , 
foreign key (Codigo_emple) references empleado (Codigo_emple),
foreign key (Codigo_habi) references habilidad_empleado (Codigo_habi)
)

create table habilidad_empleado (
Codigo_habi int primary key not null identity (1,1),
descripcion varchar (60),
)
	
drop table obtienen

