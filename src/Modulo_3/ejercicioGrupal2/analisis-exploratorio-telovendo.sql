-- Análisis exploratorio - Consultas SQL.

-- vendedores(run, nombre_vendedor, apellido_vendedor, fecha_nacimiento, seccion_trabajo, salario)
-- clientes(nombre_cliente, apellido_cliente, telefono, direccion, comuna, email, total_pagado)
-- productos(sku, nombre_producto, categoria, fabricante, stock, precio)

-- // -----------

-- G.	Seleccione los vendedores que tienen un salario superior al promedio.
SELECT nombre_vendedor, apellido_vendedor, salario
FROM vendedores
WHERE salario > (SELECT AVG(salario) FROM vendedores);

-- H.	Seleccione los productos más caros que el promedio.
SELECT nombre_producto, precio
FROM productos
WHERE precio > (SELECT AVG(precio) FROM productos);

-- I.	Seleccione los clientes que han pagado más que el promedio.
SELECT nombre_cliente, apellido_cliente, total_pagado
FROM clientes
WHERE total_pagado > (SELECT AVG(total_pagado) FROM clientes);

-- J.	Indique cuántos vendedores tienen un salario inferior al promedio.
SELECT COUNT(*) AS vendedores_inferior_promedio
FROM vendedores
WHERE salario < (SELECT AVG(salario) FROM vendedores);

-- K.	Indique cuántos productos son más baratos que el promedio.
SELECT COUNT(*) AS productos_inferior_promedio
FROM productos
WHERE precio < (SELECT AVG(precio) FROM productos);

-- L.	Seleccione el nombre y el apellido de los vendedores que tienen un salario superior al promedio.
SELECT nombre_vendedor, apellido_vendedor
FROM vendedores
WHERE salario > (SELECT AVG(salario) FROM vendedores);

-- M.	Indique cuál es el producto más barato y el producto más caro del inventario.
SELECT nombre_producto, precio
FROM productos
ORDER BY precio ASC
LIMIT 1;  -- Producto más barato

SELECT nombre_producto, precio
FROM productos
ORDER BY precio DESC
LIMIT 1;  -- Producto más caro

-- N.	Indique cual es el costo de comprar uno de cada producto en el inventario.
SELECT SUM(precio) AS costo_total_inventario
FROM productos;

-- O.	Identifique la comuna que tiene más clientes registrados.
SELECT comuna, COUNT(*) AS cantidad_clientes
FROM clientes
GROUP BY comuna
ORDER BY cantidad_clientes DESC
LIMIT 1;

-- P.	Identifique los productos que tienen más de 5 unidades en stock.
SELECT nombre_producto, stock
FROM productos
WHERE stock > 5;

