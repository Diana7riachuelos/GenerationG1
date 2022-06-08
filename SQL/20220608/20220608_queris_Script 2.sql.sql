SELECT * FROM custoners c;

SELECT *
FROM customers c;
WHERE c.customerNumber LIKE '%toy%';

SELECT c.customeNumber , c.customerName
FROM customers c
WHERE c.customerNumber LIKE '%toy%';

SELECT c.customerNumber , c.customerName ,c.city
FROM customers c;
WHERE c.city='Madrid';

--obteniendo todos los registros de ambas tablas
SELECT *
FROM customers c, orders o 
ORDER BY c.customerNumber DESC;

SELECT *
FROM customers c, orders o 
WHERE c.customerNumber = o.customerNumber
ORDER BY c.customerNumber DESC;


SELECT c.customerNumber, o.orderNumber
FROM customers c, orders o 
WHERE c.customerNumber = o.customerNumber
ORDER BY c.customerNumber DESC;

--obtener todas las ordenes por cliente
SELECT c.customerNumber, o.orderNumber ,c.customerName
FROM customers c, orders o 
WHERE c.customerNumber = o.customerNumber
AND c.customerNumber = 496
ORDER BY c.customerNumber DESC;

SELECT * FROM customer c
WHERE c.customerNumber = 496;

SELECT * FROM orders o
WHERE o.customerNumber = 496;









