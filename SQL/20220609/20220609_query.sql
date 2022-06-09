SELECT * from alumnos;
select * from grupos g;

-- inner join
select *
from tablaA a
inner join tableB b
on a.key= b.key;

select a.id, a.nombre as alumno, g.nombre as nombreGrupo
from alumnos a
inner join grupos g
on a.key= g.id;
where g.id= 5
;

-- left join, muestra toda la informacion de la tabla de la izquierda, con los datos que pueden coincidir con los de la derecha
select *
select alumnos a
left join grupos g
on a.grupo_id = g.id;

--rigth join : se da prioridad a la tabla de la derecha
INSERT INTO Grupos VALUES(7, 'Grupo7');
INSERT INTO Grupos VALUES(8, 'gRUPO8');

select *
select alumnos a
RIGHT JOIN grupos g
on a.grupo_id = g.id;

--exclusion
select a.id, a.nombre as 'alumno' , g.nombre as 'nombreGrupo'
FROM alumnos a
RIGTH JOIN grupo g
on a.grupo_id = g.id;

--FULL JOIN
--pero no funciona en mysql
select *
select alumnos a
FULL JOIN grupos g
on a.grupo_id = g.id;

select a.id, a.nombre as 'alumno' , g.nombre as 'nombreGrupo'
FROM alumnos a
FULL JOIN grupo g
on a.grupo_id = g.id;

--alternativa para mysql
select * from(
select alumnos a
RIGHT JOIN grupos g
on a.grupo_id = g.id;
UNION
select *
FROM alumnos a
LEFTH JOIN grupo g
on a.grupo_id = g.id
)as universo
--where -- is null



