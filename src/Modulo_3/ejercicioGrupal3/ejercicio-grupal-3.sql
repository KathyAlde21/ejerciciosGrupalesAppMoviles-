USE telovendo; -- // Kathy Alderete

-- // -- En base a la base de datos creada, actualizar tablas y realizar consultas: --------

-- A) Ingrese 5 vendedores //
SELECT * FROM vendedores;

INSERT INTO vendedores (run, nombre_vendedor, apellido_vendedor, fecha_nacimiento, seccion_trabajo, salario)
VALUE ('123456789', 'Juan', 'Perez', '1985-06-15', 'Electronica', 485000), -- 1
('987654321', 'Maria', 'Gonzalez', '1990-08-22', 'Ropa', 649850), -- 2
('456789012', 'Carlos', 'Ramirez', '1978-12-05', 'Hogar', 480740), -- 3
('234567890', 'Ana', 'Lopez', '1982-03-18', 'Deportes', 575800), -- 4
('345678903', 'Luis', 'Martinez', '1995-11-30', 'Juguetes', 625000); -- 5

-- B) Ingrese 5 clientes //
SELECT * FROM clientes;

INSERT INTO clientes (nombre_cliente, apellido_cliente, telefono, direccion, comuna, email, total_pagado)
VALUE ('Pedro', 'Sánchez', '123456789', 'Calle Falsa 485', 'Santiago', 'pedro.sanchez@example.com', 24000), -- 1
('Laura', 'Fernández', '987654321', 'Avenida Siempre Viva 456', 'Valparaíso', 'laura.fernandez@example.com', 35000), -- 2
('Jorge', 'Mendoza', '456123789', 'Pasaje Los Olivos 789', 'Concepción', 'jorge.mendoza@example.com', 51700), -- 3
('Sofía', 'Rojas', '321654987', 'Camino Real 101', 'La Serena', 'sofia.rojas@example.com', 18000), -- 4
('Andrés', 'Castro', '789321654', 'Boulevard Central 202', 'Antofagasta', 'andres.castro@example.com', 27000); -- 5

-- C) Ingrese 5 productos //
SELECT * FROM productos;

INSERT INTO productos (sku, nombre_producto, categoria, fabricante, stock, precio)
VALUE ('12345', 'Televisor LED', 'Electronica', 'Samsung', 50, 380990), -- 1
('7890', 'Camiseta Deportiva', 'Ropa', 'Nike', 200, 8990), -- 2
('5421', 'Sofa 3 Plazas', 'Hogar', 'Ikea', 15, 75000), -- 3
('9876', 'Bicicleta Montaña', 'Deportes', 'Trek', 30, 150000), -- 4
('1223', 'Muñeca Barbie', 'Juguetes', 'Mattel', 100, 10990); -- 5


-- // ----- Manipulación de datos - Consultas SQL -------

-- D) Identifique cuál es el salario mínimo entre vendedores //
SELECT * FROM vendedores;

SELECT salario
FROM vendedores
ORDER BY salario ASC
LIMIT 1;  -- salario más bajo

SELECT salario
FROM vendedores
WHERE salario = (
	SELECT MIN(salario) 
    FROM vendedores
);

-- E) Identifique cuál es el salario máximo entre vendedores //
SELECT salario
FROM vendedores
ORDER BY salario DESC
LIMIT 1;  -- salario más alto

SELECT salario
FROM vendedores
WHERE salario = (
	SELECT MAX(salario) 
    FROM vendedores
);

-- F) Súmele al salario mínimo identificado al salario de todos los vendedores //
-- SALARIO MINIMO
SELECT salario
FROM vendedores
ORDER BY salario ASC
LIMIT 1;  -- salario más bajo

SELECT salario
FROM vendedores
WHERE salario = (
	SELECT MIN(salario) 
    FROM vendedores
);

-- FORMULA SUMAR A TODOS LOS SALARIOS
UPDATE vendedores
SET salario = salario + (
	SELECT MIN(salario) 
    FROM (SELECT * FROM vendedores) AS temp
);

-- G) Elimine el producto más caro del inventario //
SELECT * FROM productos;

SELECT * FROM productos
ORDER BY precio DESC
LIMIT 1;  -- precio más alto // laptop pro $ 1250000

SELECT * FROM productos
WHERE precio = (
	SELECT MAX(precio) 
    FROM productos
);

-- FORMULA ELIMINAR PRODUCTO MAS CARO
DELETE FROM productos
WHERE precio = (
    SELECT MAX(precio)
    FROM (SELECT * FROM productos) AS temp
);

-- H) Cree una tabla que contenga solo los clientes que han pagado más que el promedio //
SELECT * FROM clientes
WHERE total_pagado > (SELECT AVG(total_pagado) FROM clientes);

CREATE TABLE clientes_consumistas AS			-- que cree la tabla según la consulta:
SELECT * FROM clientes			
WHERE total_pagado > (
    SELECT AVG(total_pagado)
    FROM (SELECT * FROM clientes) AS temp
);

SELECT * FROM clientes_consumistas
WHERE total_pagado > (SELECT AVG(total_pagado) FROM clientes);

-- I) Actualice los datos de 3 productos //
/*
SELECT * FROM productos;
INSERT INTO productos (sku, nombre_producto, categoria, fabricante, stock, precio)
*/
UPDATE productos					-- 1 //
SET stock = 12,
    precio = 13000
WHERE sku = 127;

UPDATE productos					-- 2 //
SET nombre_producto = 'Vestido',
	fabricante = 'Versace',
 	stock = 4,
   precio = 145000
WHERE sku = 143;

UPDATE productos					-- 3 //
SET precio = 950000
WHERE sku = 1006;


-- J) Actualice los datos de 3 vendedores //
/*
SELECT * FROM vendedores;
INSERT INTO vendedores(run, nombre_vendedor, apellido_vendedor, fecha_nacimiento, seccion_trabajo, salario)
*/
UPDATE vendedores					-- 1 //
SET nombre_vendedor = 'Juanita',
    seccion_trabajo = 'Tecnología'
WHERE run = 123456789;

UPDATE vendedores					-- 2 //
SET apellido_vendedor = 'Norambuena',
    seccion_trabajo ='Hogar'
WHERE run = 137411596;

UPDATE vendedores					-- 3 //
SET nombre_vendedor = 'Ignacio',
    apellido_vendedor = 'Castillo'
WHERE run = 131574263;


-- K) Actualice los datos de 1 cliente //
/*
SELECT * FROM clientes;
INSERT INTO clientes(nombre_cliente, apellido_cliente, telefono, direccion, comuna, email, total_pagado)
*/
UPDATE clientes					-- 3
SET nombre_cliente = 'Marcelo',
    apellido_cliente = 'Castillo',
    telefono = 978956878
WHERE id_cliente = 11;


-- L) Seleccione el nombre y apellido de los vendedores que tienen un salario superior al promedio //
SELECT nombre_vendedor, apellido_vendedor
FROM vendedores
WHERE salario > (SELECT AVG(salario) FROM vendedores);

-- M) Indique cuál es el cliente con mayor gasto //
SELECT * FROM clientes
WHERE total_pagado = (
	SELECT MAX(total_pagado) 
    FROM clientes
);

SELECT * FROM clientes
ORDER BY total_pagado DESC
LIMIT 1;