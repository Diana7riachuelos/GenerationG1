CREATE TABLE usuarios (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar (50),
    apellido varchar (50),
    password varchar (50),
    correo varchar (50),
    tipo varchar (50),
    nombre_usuario varchar (50),
);
CREATE TABLE tipocuenta (
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    alumno varchar (50),
    padre varchar (50),
    profesor varchar (50),
);
CREATE TABLE profesor (
    id_prof int PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    edad int PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    rut int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre_usuario varchar (50),
);

