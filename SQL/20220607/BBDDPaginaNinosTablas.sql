USE BBDDNinosDEMO;

CREATE TABLE  roles(
id_roles int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_rol varchar(30),
descripcion varchar(50)
);

CREATE TABLE modulos(
id_modulo int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_modulo varchar(50),
descripcion varchar(50)
);

CREATE TABLE etapas(
id_etapas int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_etapa varchar(50),
descripcion varchar(50),
id_contenido int
);

CREATE TABLE asignaturas(
id_asignatura int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_asignatura varchar(50),
id_contenido int
);

CREATE TABLE contenidos(
id_contenido int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_contenido varchar(50),
descripcion varchar(50),
id_modulo int
);

CREATE TABLE preguntas(
id_preguntas int PRIMARY KEY NOT NULL AUTO_INCREMENT,
descripcion varchar(50),
id_respuestas int
);

CREATE TABLE respuestas(
id_respuestas int PRIMARY KEY NOT NULL AUTO_INCREMENT,
descripcion varchar(50),
id_pregunta int
);

CREATE TABLE juegos(
id_juegos int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre varchar(50),
descripcion varchar(50),
id_etapas int
);

CREATE TABLE  usuarios(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre varchar(30),
apellido varchar(30),
correo varchar(30),
password varchar(30),
nombre_usuario varchar(30),
edad int,
rut varchar(30),
id_roles int
);

/*CREACION DE LLAVES FORANEAS Y RELACIONES*/

/*RELACION ENTRE TABLA USUARIOS CON TABLA ROLES*/
ALTER TABLE usuarios ADD CONSTRAINT FK_rolID FOREIGN KEY (id_roles) REFERENCES roles(id_roles);

/*RELACION ENTRE TABLA ASIGNATURAS CON TABLA CONTENIDOS*/
ALTER TABLE asignaturas ADD CONSTRAINT FK_contenidoID FOREIGN KEY (id_contenido) REFERENCES contenidos(id_contenido);

/*RELACION ENTRE TABLA ETAPAS CON TABLA CONTENIDOS*/
ALTER TABLE etapas ADD CONSTRAINT FK_contenido2ID FOREIGN KEY (id_contenido) REFERENCES contenidos(id_contenido);

/*RELACION ENTRE TABLA JUEGOS CON TABLA ETAPAS*/
ALTER TABLE juegos ADD CONSTRAINT FK_etapaID FOREIGN KEY (id_etapas) REFERENCES etapas(id_etapas);

/*RELACION ENTRE TABLA PREGUNTAS CON TABLA RESPUESTAS*/
ALTER TABLE preguntas ADD CONSTRAINT FK_respuestaID FOREIGN KEY (id_respuestas) REFERENCES respuestas(id_respuestas);

/*RELACION ENTRE TABLA CONTENIDOS CON TABLA MODULOS*/
ALTER TABLE contenidos ADD CONSTRAINT FK_modulosID FOREIGN KEY (id_modulo) REFERENCES modulos(id_modulo);
/***********ESTA RELACION NO DEBERIA SER AL REVES??????************************/


/*COMENTARIOS

//TABLA DE PRUEBAS TODAVIA NO CREADA PORQUE NO SE SI ES REALMENTE NECESARIA, CONSULTAR CON GRUPO



*/



/*DATOS DE INGRESO SOLO PARA PROBAR TABLAS*/

