CREATE DATABASE TestJoin
GO

USE TestJoin
GO

CREATE TABLE Grupos
(
    Id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    Nombre varchar(20)
    grupo_id int
);

CREATE TABLE Alumnos
(
    Id int,
    Nombre varchar(20),
    curso_id int
);

INSERT INTO Grupos VALUES(1, 'Grupo1');
INSERT INTO Grupos VALUES(2, 'Grupo2');
INSERT INTO Grupos VALUES(3, 'Grupo3');
INSERT INTO Grupos VALUES(4, 'Grupo4');
INSERT INTO Grupos VALUES(5, 'Grupo5');
INSERT INTO Grupos VALUES(6, 'Grupo6');
INSERT INTO Grupos VALUES(7, 'Grupo7');

,('Pamela', NULL);
,('Israel', NULL);

,('Leonardo Utreras', 1);
,('Luis Mejias', 1);
,('Francisco Cid', 1);
,('Francisco Perez', 1);
,('Marysabel Aedo', 1);
,('Ignacio Romero', 1);

,('Nicolas Neira', 2);
,('Genesis Quezada', 2);
,('Catalina Castillo', 2);
,('Carlos Iturra', 2);
,('Gabriel Guzman', 2);


,('Danko', 4);
,('Wladimir', 4);
,('Catalina', 4);
,('Esteban', 4);
,('Katherina', 4);


,('Nicole Olivares', 5);
,('Hector Gomez', 5);
,('Fernando Faundez',5);
,('Ignacio Galaz', 5);
,('Constanza Mardones', 5);


,('Alondra', 6);
,('Diana', 6);
,('Michael', 6);
,('Paulino', 6);
,('Matias', 6);

ALTER TABLE alumnos
ADD CONSTRAINT FK_grupo_id
FOREIGN KEY (grupo_id) REFERENCES grupos(id);