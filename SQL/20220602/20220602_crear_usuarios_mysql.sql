CREATE USER 'Diana'@'localhost' IDENTIFIED BY 'Admin1234*';
GRANT ALL PRIVILEGES ON *.* TO 'Diana'@'localhost' WITH GRANT OPTION;

CREATE USER 'Diana'@'%' IDENTIFIED BY 'Admin1234*';
GRANT ALL PRIVILEGES ON *.* TO 'Diana'@'%' WITH GRANT OPTION;

FLUSH PRIVILEGES;

exit -> salir de mysql

********

-- ingresar a mysql con el nuevo usuario