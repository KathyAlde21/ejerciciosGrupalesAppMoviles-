-- Análisis exploratorio - Consultas SQL.

-- vendedores(run, nombre_vendedor, apellido_vendedor, fecha_nacimiento, seccion_trabajo, salario)
-- clientes(nombre_cliente, apellido_cliente, telefono, direccion, comuna, email, total_pagado)
-- productos(sku, nombre_producto, categoria, fabricante, stock, precio)

-- G.	Seleccione los vendedores que tienen un salario superior al promedio.

-- H.	Seleccione los productos más caros que el promedio.

-- I.	Seleccione los clientes que han pagado más que el promedio.

-- J.	Indique cuántos vendedores tienen un salario inferior al promedio.

-- K.	Indique cuántos productos son más baratos que el promedio.

-- L.	Seleccione el nombre y el apellido de los vendedores que tienen un salario superior al promedio.

-- M.	Indique cuál es el producto más barato y el producto más caro del inventario.

-- N.	Indique cual es el costo de comprar uno de cada producto en el inventario.

-- O.	Identifique la comuna que tiene más clientes registrados.

-- P.	Identifique los productos que tienen más de 5 unidades en stock.

Consultas SQL para cada pregunta
G. Seleccione los vendedores que tienen un salario superior al promedio.

sql
Copiar código
SELECT nombre, apellido, salario
FROM vendedores
WHERE salario > (SELECT AVG(salario) FROM vendedores);
H. Seleccione los productos más caros que el promedio.

sql
Copiar código
SELECT nombre_producto, precio
FROM productos
WHERE precio > (SELECT AVG(precio) FROM productos);
I. Seleccione los clientes que han pagado más que el promedio.

sql
Copiar código
SELECT nombre_cliente, apellido_cliente, total_pagado
FROM clientes
WHERE total_pagado > (SELECT AVG(total_pagado) FROM clientes);
J. Indique cuántos vendedores tienen un salario inferior al promedio.

sql
Copiar código
SELECT COUNT(*) AS vendedores_inferior_promedio
FROM vendedores
WHERE salario < (SELECT AVG(salario) FROM vendedores);
K. Indique cuántos productos son más baratos que el promedio.

sql
Copiar código
SELECT COUNT(*) AS productos_inferior_promedio
FROM productos
WHERE precio < (SELECT AVG(precio) FROM productos);
L. Seleccione el nombre y el apellido de los vendedores que tienen un salario superior al promedio.

sql
Copiar código
SELECT nombre, apellido
FROM vendedores
WHERE salario > (SELECT AVG(salario) FROM vendedores);
M. Indique cuál es el producto más barato y el producto más caro del inventario.

sql
Copiar código
SELECT nombre_producto, precio
FROM productos
ORDER BY precio ASC
LIMIT 1;  -- Producto más barato

SELECT nombre_producto, precio
FROM productos
ORDER BY precio DESC
LIMIT 1;  -- Producto más caro
N. Indique cuál es el costo de comprar uno de cada producto en el inventario.

sql
Copiar código
SELECT SUM(precio) AS costo_total_inventario
FROM productos;
O. Identifique la comuna que tiene más clientes registrados.

sql
Copiar código
SELECT comuna, COUNT(*) AS cantidad_clientes
FROM clientes
GROUP BY comuna
ORDER BY cantidad_clientes DESC
LIMIT 1;
P. Identifique los productos que tienen más de 5 unidades en stock.

sql
Copiar código
SELECT nombre_producto, stock
FROM productos
WHERE stock > 5;