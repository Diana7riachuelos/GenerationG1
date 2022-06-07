use generationg;

CREATE TABLE registros(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    codigo_registro varchar(50) NOT NULL,
    rut varchar(50) NOT NULL
);

CREATE TABLE cursos(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(30) NOT NULL,
    descripcion varchar(100),
);

CREATE TABLE direcciones(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(30) NOT NULL,
    numero int not null,
    ciudad varchar(30),
);

CREATE TABLE alumnos(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
    edad int,
    curso_id int,
    direccion_id int,
    registro_id int,
);

-- FOREING KEY
ALTER TABLE alumnos
ADD CONSTRAINT FK_direccion_id -- asignar nombre a la relacion
FOREIGN KEY (direccion_id) REFERENCES direcciones(id),
ADD CONSTRAINT FK_curso_id -- asignar nombre a la relacion
FOREIGN KEY (curso_id) REFERENCES cursos(id),
ADD CONSTRAINT FK_registro_id -- asignar nombre a la relacion
FOREIGN KEY (registro_id) REFERENCES registros(id)
;


---------INSERCIONES ----------
--INSERT INTO nombre_tabla (columna1, columna2..., columnaN) VALUES (valor1, valor2,....valorN);
-- multiple inserciones
INSERT INTO cursos (nombre, descripcion) VALUES ('Alfa','aplicados'), ('Beta','inteligentes'),('Gamma','Astutos');

INSERT INTO registros (codigo_registro,	rut) values('ZP202201','123456-8'), ('AP202201','2345678-9'),('TL202203','34567898-1'); 

INSERT INTO direcciones (nombre,numero,	ciudad) values
('Prat','123','Arica'),
('Bulnes','444','Punta arenas'),
('Arana','765','Concepcion'); 

INSERT INTO alumnos (nombre,	apellido,	edad,	curso_id,	direccion_id,registro_id)
values 
('Zoe','Palma','3','1','3','1'),
('Ayun','Palma','3','1','3','2'),
('Tom','Loren','5','3','1','3');
