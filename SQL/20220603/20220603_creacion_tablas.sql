CREATE USER 'Diana'@'localhost' IDENTIFIED BY 'Admin1234*';
GRANT ALL PRIVILEGES ON *.* TO 'Diana'@'localhost' WITH GRANT OPTION;

CREATE USER 'Diana'@'%' IDENTIFIED BY 'Admin1234*';
GRANT ALL PRIVILEGES ON *.* TO 'Diana'@'%' WITH GRANT OPTION;

FLUSH PRIVILEGES;

exit -> salir de mysql

********

-- ingresar a mysql con el nuevo usuario

mysql -u Diana -p

-- ver desde la terminal las bases de datods creadas
show databases;

-- cear base de datos 
create database generationg1;

-- usar la base dato creada
use generationg1;

-- mostrar las tablas creadas en la base datos seleccionada
show tables;

-- CREAR nuestra tabla
CREATE TABLE nombre_tabla(
    nombre_columna1 tipo_dato restriccion,
    nombre_columna2 tipo_dato restriccion,
    ...
    PRIMARY KEY (nombre_columna1),
    ADD FOREIGN KEY (nombre_columnafk) REFERENCES otra_tabla(nombre_pk)
);

CREATE table clientes(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(30) NOT NULL,
    correo varchar(50),
    ADD FOREIGN KEY (direccionId) REFERENCES direcciones(id)
);

--AUTOINCREMENT : SI NO AGREGAMOS LA PK EN LA INSERCION, CREA UNA SEGUN  LA SECUENCIA




-- conocer el estructura de la tabla
describe clientes;

-- consultar la data en la tabla
-- SELECT * from nombre_tabla (* todos los registros)
SELECT * FROM clientes;

-- Insercion de registros
--INSERT INTO nombre_tabla (columna1, columna2..., columnaN) VALUES (valor1, valor2,....valorN);
INSERT INTO clientes (id,nombre,correo) VALUES (1, 'Zoe','a@a.cl');
INSERT INTO clientes (id,nombre,correo) VALUES (2, 'Ayun','e@e.cl');
INSERT INTO clientes (id,nombre,correo) VALUES (3, 'Tom','i@i.cl');

INSERT INTO clientes (nombre,id, correo) VALUES ( 'Mishi',10,'o@o.cl');

Insert into clientes(id, nombre) values (4, 'Isra');

Insert into clientes(id) values (5);

-- VACIAR LA TABLA
TRUNCATE TABLE clientes;

-- ELIMINAR LA TABLA (ojito)
DROP TABLE clientes;

--ELIMINAR LA BASE DE DATOS
DROP database ejemplo;

-- insercion a la nueva tabla
INSERT INTO clientes (nombre,correo) VALUES ( 'Zoe','a@a.cl');
INSERT INTO clientes (nombre,correo) VALUES ('Ayun','e@e.cl');
INSERT INTO clientes (nombre,correo) VALUES ('Tom','i@i.cl');
INSERT INTO clientes (nombre, correo) VALUES ( 'Mishi','o@o.cl');
Insert into clientes(nombre) values ( 'Isra');
Insert into clientes(id,nombre) values ( 7, 'Alexis');
Insert into clientes(nombre) values ( 'Pamela');


-- ACTUALIZAR BASE REGISTRO EN TABLA
UPDATE NOMBRE_TABLA
SET columnaAModificar = valor_a_insertar, columnaAModificar2 = valor_a_insertar2
WHERE CONDICION -- filtrar
-- update sin where

UPDATE clientes
set correo = 'quezada@palma.cl'
Where id = 7;

select * from clientes where id > 3 ;

-- WHERE y LIKE 
SELECT * FROM Customers
-- WHERE CustomerName LIKE '%an%'
-- '%%' 
-- WHERE CustomerName LIKE 'fran%'
WHERE CustomerName LIKE '%tion'
and ContactName Like '%von'
;

-- Orden ascendente
SELECT * FROM Products
where price Between 10 and 30
Order by price asc;
;

-- Orden ascendente
SELECT * FROM Products
where price Between 10 and 30
Order by price desc;
;

CREATE TABLE direcciones(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(100) NOT NULL,
    numero int NOT NULL
);

-- modificar tabla
ALTER TABLE nombre_tabla
ADD nombre_columna tipo restriccion;

ALTER TABLE clientes
ADD direccionId int;

-- Eliminar columna
ALTER TABLE clientes
DROP COLUMN direccionId;

-- Relacionar tablas
ALTER TABLE clientes
ADD FOREIGN KEY (direccionId) REFERENCES direcciones(id);

ALTER TABLE CLIENTES
ADD CONSTRAINT FK_direccionId -- asignar nombre a la relacion
FOREIGN KEY (direccionId) REFERENCES direcciones(id);


show create table clientes;