create database jgym;
use jgym;

CREATE TABLE persona(
	id_persona int auto_increment primary key,
    nombre VARCHAR(250),
    dni VARCHAR (20) unique,
    direccion VARCHAR (100),
    contraseña_cuenta varchar(50) not null
 );
 

 CREATE TABLE Telefono (
    id_persona int,
    telefono INT ,
    tipo VARCHAR(20),
    primary key (id_persona, telefono),
    FOREIGN KEY (id_persona) REFERENCES Persona(id_persona) on update cascade on delete cascade
);

 
 CREATE TABLE cliente (
    id_persona INT AUTO_INCREMENT ,
    fecha_inscripcion date,
    primary key (id_persona),
    FOREIGN KEY (id_persona) REFERENCES Persona(id_persona) on update cascade on delete cascade
);
CREATE TABLE clase_cliente (
    id_clase INT not null,
    id_cliente INT not null,
    dni VARCHAR(20) unique,
    PRIMARY KEY (id_cliente, id_clase),
    FOREIGN KEY (id_clase) REFERENCES clase(id_clase) on update cascade on delete cascade,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)on update cascade on delete cascade
);
 
 CREATE TABLE empleado (
    id_persona INT AUTO_INCREMENT,
    salario double,
    puesto varchar (100),
    primary key (id_persona),
    FOREIGN KEY (id_persona) REFERENCES Persona(id_persona) on update cascade on delete cascade
);
CREATE TABLE clase (
    id_clase INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    fechaHora date,
    realizado bool,
    id_empleado int,
    FOREIGN KEY (id_empleado) REFERENCES Persona(id_persona) on update cascade on delete cascade
);



create table equipamiento_clase(
id_clase int,
id_equipamiento int,
primary key ( id_clase, id_equipamiento),
FOREIGN KEY (id_equipamiento) REFERENCES equipamiento(id_equipamiento) on update cascade on delete cascade,
FOREIGN KEY (id_clase) REFERENCES clase(id_clase)on update cascade on delete cascade
);

CREATE TABLE equipamiento (
    id_equipamiento int auto_increment primary key,
    nombre VARCHAR(100)
);








