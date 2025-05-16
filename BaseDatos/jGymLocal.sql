create database jgym;
use jgym;

CREATE TABLE persona(
	id_persona int auto_increment primary key,
    nombre VARCHAR(250),
    dni VARCHAR (20) unique,
    direccion VARCHAR (100),
    telefono varchar(50) not null
 );
 
 CREATE TABLE cliente (
    id_persona INT AUTO_INCREMENT ,
    fecha_inscripcion date,
    primary key (id_persona),
    FOREIGN KEY (id_persona) REFERENCES Persona(id_persona) on update cascade on delete cascade
);

 CREATE TABLE empleado (
    id_persona INT AUTO_INCREMENT,
    salario double,
    puesto varchar (100),
    contraseña varchar (100),
    primary key (id_persona),
    FOREIGN KEY (id_persona) REFERENCES Persona(id_persona) on update cascade on delete cascade
);

CREATE TABLE equipamiento (
    id_equipamiento int auto_increment primary key,
    nombre VARCHAR(100)
);

CREATE TABLE clase (
    id_clase INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    fechaHora date,
    realizado bool,
    id_persona int,
    FOREIGN KEY (id_persona) REFERENCES Empleado(id_persona) on update cascade on delete cascade
);

CREATE TABLE clase_cliente (
    id_clase INT not null,
    id_cliente INT not null,
    PRIMARY KEY (id_cliente, id_clase),
    FOREIGN KEY (id_clase) REFERENCES clase(id_clase) on update cascade on delete cascade,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_persona)on update cascade on delete cascade
);

create table equipamiento_clase(
id_clase int,
id_equipamiento int,
primary key ( id_clase, id_equipamiento),
FOREIGN KEY (id_equipamiento) REFERENCES equipamiento(id_equipamiento) on update cascade on delete cascade,
FOREIGN KEY (id_clase) REFERENCES clase(id_clase)on update cascade on delete cascade
);

create view empleadosSalario as
select persona.nombre, empleado.puesto, empleado.salario
from persona
join empleado on persona.id_persona = empleado.id_persona;

create view personasOrdenNombre as
select * from persona
order by nombre;

create view clasesRealizadas as
select * from clase
where realizado = 1;

create view nombreClaseMaterial as
select clase.nombre as nombreDeLaClase, equipamiento.nombre as nombreDelEquipamiento
from clase 
join equipamiento_clase on clase.id_clase = equipamiento_clase.id_clase
join equipamiento on equipamiento_clase.id_equipamiento = equipamiento.id_equipamiento
group by nombreDeLaClase, nombreDelEquipamiento;

-- drop database if exists jgym;

insert into persona (nombre,dni,direccion,telefono) values ('juan','11111111a','calle a','111111111'),('maria','22222222b','calle b','222222222'),('david','33333333c','calle c','333333333');
insert into empleado (id_persona,puesto,salario) values (1,'tecnico',1500),(2,'monitor',1700),(3,'recepcionista',1400);
insert into clase (nombre,fechaHora,realizado,id_persona) values ('zumba','2025-11-21',1,2),('spinning','2024-05-05',0,2);
insert into equipamiento (nombre) values ('mancuerna'),('mancuerna'),('mancuerna'),('mancuerna'),('mancuerna');
insert into equipamiento_clase (id_clase,id_equipamiento) values (1,1),(1,2),(2,3),(2,2),(2,5);

select * from empleadosSalario;
select * from personasOrdenNombre;
select * from clasesRealizadas;
select * from nombreClaseMaterial;


