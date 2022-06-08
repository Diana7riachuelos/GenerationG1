--iner join
select c.customerNumber, o.orderNumber ,c.customerName 
from customers c, orders o
where c.customerNumber = o.customerNumber -- filtrando
and c.customerNumber = 496 -- filtro
order by c.customerNumber desc; -- ordenado el resultado por la columna mencionada

select * 
from customers c --- tabla A
inner join orders o -- tabla B
on c.customerNumber = o.customerNumber
order by c.customerNumber desc;

select * 
from orderdetails o --- tabla A
inner join product p -- tabla B
on o.orderNumber = productCode
order by o.orderNumber desc;




