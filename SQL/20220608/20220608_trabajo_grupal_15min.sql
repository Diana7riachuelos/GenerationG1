select p.productName, p.quantityInStock
from products p
where p.productLine = 'Motorcycles'
order by p.quantityInStock desc;
select p.productName, p.productLine, p.quantityInStock
from products p
where productName like '%Ford%'
order by p.productLine asc; (editado) 