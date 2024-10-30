USE telovendo;
-- para que se vean todas las tablas igual cambie nombres tabla y campos:
-- cliente
RENAME TABLE cliente
TO clientes;

-- producto
RENAME TABLE producto
TO productos;

-- vendedor
RENAME TABLE vendedor
TO vendedores;

/*-- alimentando tabla cliente
SELECT * FROM cliente;
INSERT INTO cliente (nombreCliente, apellidoCliente, telefono, direccion, comuna, email)
VALUE ('Alejandro', 'Gutiérrez Huenchuleo', '985296314', 'Psje Quino 123', 'La Florida', 'alejandro@gmail.com'), -- 1
('Camila', 'Tello Valenzuela', 987556391, 'Psje Ranquen 321', 'La Florida', 'camila@gmail.com'), -- 2
('Carlos', 'Carmona Carreño', 987456321 , 'Psje Pidima 456', 'La Florida', 'carlos@gmail.com'), -- 3
('Daisy', 'Castillo SAepúlveda', 965983214, 'Psje', 'La Florida', 'daisy@gmail.com'), -- 4
('Daniela', 'Nahuelpan Sierra', 989542325, 'Psje Los Trapenses', 'La Florida', 'daniela@gmail.com'), -- 5
('David', 'Villacura Villacura', 989876545, 'Psje Cajón', 'La Florida', 'david@gmail.com'), -- 6
('Fabian', 'Gallardo Nahuelñir', 932145632, 'Psje Meteoro', 'La Florida', 'fabian@gmail.com'), -- 7
('Francisca', 'Aedo Moreno', 974859632, 'Psje Ranquillon', 'La Florida', 'francisca@gmail.com'), -- 8
('Freya', 'Contreras Améstica', 987453214, 'Psje Escuadron', 'La Florida', 'freya@gmail.com'), -- 9
('Isanny', 'Velasquez Alvarez', 974859878, 'Psje Selva Oscura', 'La Florida', 'isanny@gmail.com'); -- 10*/

/*-- alimentando tabla producto
SELECT * FROM producto;
INSERT INTO producto (sku, nombreProducto, categoria, fabricante, stock)
VALUE (123, 'Polera', 'Ropa', 'Nike', 5), -- 1
(124, 'Polerón', 'Ropa', 'Adidas', 12), -- 2
(135, 'Polera', 'Ropa', 'Opposite', 2), -- 3
(211, 'Pantalla', 'Tecnología', 'Samsung', 10), -- 4
(127, 'Vestido', 'Ropa', 'Zibele', 8), -- 5
(223, 'Teléfono', 'Tecnología', 'Samsung', 14), -- 6
(143, 'Calcetines', 'Ropa', 'Monarch', 45), -- 7
(128, 'Pantalón', 'Ropa', 'Levis', 9), -- 8
(544, 'Zapatilla', 'Calzado', 'Nike', 10), -- 9
(556, 'Botas', 'Calzado', '16 Horas', 6); -- 10*/

/*-- alimentando tabla vendedor
SELECT * FROM vendedor;
INSERT INTO vendedor (run, nombreVendedor, apellidoVendedor, fechaNacimiento, seccionTrabajo)
VALUE (124859653, 'Karin', 'Aburto Vergara', '1987-08-17', 'Calzado'), -- 1
(188523697, 'Kevin', 'Navarrete Molina', '1989-01-07', 'Tecnología'), -- 2
(179874563, 'Lipsy', 'Reyes Bastias', '1987-03-02', 'Ropa'), -- 3
(139852367, 'Sandra', 'Gonzalez Pavez', '1978-09-21', 'Ropa'), -- 4
(137411596, 'Scarlete', 'Norambuena Norambuena', '1978-03-08', 'Ropa'), -- 5
(129519556, 'Sybella', 'Sandoval Soto', '1975-12-14', 'Calzado'), -- 6
(143212589, 'Raul', 'Rojo Urra', '1985-11-30', 'Calzado'), -- 7
(228623597, 'Patricio', 'Quidel Painemil', '1995-10-21', 'Tecnología'), -- 8
(107896321, 'Pablo', 'Egaña Acevedo', '1972-04-21', 'Tecnología'), -- 9
(131574263, 'Paulina', 'Gonzalez Miranda', '1980-05-17', 'Tecnología'); -- 10*/

-- AHORA:
/*clientes(
id_cliente INT PRIMARY KEY AUTO_INCREMENT,
nombre_cliente VARCHAR(50) NOT NULL,
apellido_cliente VARCHAR(50) NOT NULL,
telefono INT NOT NULL,
direccion VARCHAR(45) NOT NULL,
comuna VARCHAR(45) NOT NULL,
email  VARCHAR(45) NOT NULL,
fecha_registro DATETIME DEFAULT CURRENT_TIMESTAMP(),
total_pagado DOUBLE NOT NULL
UNIQUE(id_cliente)
);

productos(
sku INT PRIMARY KEY NOT NULL,
nombre_producto VARCHAR(50) NOT NULL,
categoria VARCHAR(40) NOT NULL,
fabricante VARCHAR(50) NOT NULL,
stock INT NOT NULL,
precio DOUBLE NOT NULL
);

vendedores(
run INT PRIMARY KEY NOT NULL,
nombre_vendedor VARCHAR(50) NOT NULL,
apellido_vendedor VARCHAR(50) NOT NULL,
fecha_nacimiento DATE,
seccion_trabajo VARCHAR(50) NOT NULL,
salario DOUBLE NOT NULL
);*/
-- // -------------------
-- PRIMERO AGREGAR DATOS NUEVOS A LOS ANTIGUOS INGRESADOS
-- productos antiguos datos columna precio:
UPDATE productos
SET precio = 12000
WHERE sku = 123; -- (123, 'Polera', 'Ropa', 'Nike', 5)

UPDATE productos
SET precio = 24000
WHERE sku = 124; -- (124, 'Polerón', 'Ropa', 'Adidas', 12)

UPDATE productos
SET precio = 8000
WHERE sku = 135; -- (135, 'Polera', 'Ropa', 'Opposite', 2)

UPDATE productos
SET precio = 220000
WHERE sku = 211; -- (211, 'Pantalla', 'Tecnología', 'Samsung', 10)

UPDATE productos
SET precio = 15000
WHERE sku = 127; -- (127, 'Vestido', 'Ropa', 'Zibele', 8)

UPDATE productos
SET precio = 150000
WHERE sku = 223; -- (223, 'Teléfono', 'Tecnología', 'Samsung', 14)

UPDATE productos
SET precio = 1500
WHERE sku = 143; -- (143, 'Calcetines', 'Ropa', 'Monarch', 45)

UPDATE productos
SET precio = 18000
WHERE sku = 128; -- (128, 'Pantalón', 'Ropa', 'Levis', 9)

UPDATE productos
SET precio = 42000
WHERE sku = 544; -- (544, 'Zapatilla', 'Calzado', 'Nike', 10)

UPDATE productos
SET precio = 48000
WHERE sku = 556; -- (556, 'Botas', 'Calzado', '16 Horas', 6)

-- // -------------------
-- vendedores antiguos datos columna salario:
UPDATE vendedores
SET salario = 550000
WHERE run = 124859653; -- (124859653, 'Karin', 'Aburto Vergara', '1987-08-17', 'Calzado')

UPDATE vendedores
SET salario = 750000
WHERE run = 188523697; -- (188523697, 'Kevin', 'Navarrete Molina', '1989-01-07', 'Tecnología')

UPDATE vendedores
SET salario = 520000
WHERE run = 179874563; -- (179874563, 'Lipsy', 'Reyes Bastias', '1987-03-02', 'Ropa')

UPDATE vendedores
SET salario = 535000
WHERE run = 139852367; -- (139852367, 'Sandra', 'Gonzalez Pavez', '1978-09-21', 'Ropa')

UPDATE vendedores
SET salario = 595000
WHERE run = 137411596; -- (137411596, 'Scarlete', 'Norambuena Norambuena', '1978-03-08', 'Ropa')

UPDATE vendedores
SET salario = 642000
WHERE run = 129519556; -- (129519556, 'Sybella', 'Sandoval Soto', '1975-12-14', 'Calzado')

UPDATE vendedores
SET salario = 625000
WHERE run = 143212589; -- (143212589, 'Raul', 'Rojo Urra', '1985-11-30', 'Calzado')

UPDATE vendedores
SET salario = 734000
WHERE run = 228623597; -- (228623597, 'Patricio', 'Quidel Painemil', '1995-10-21', 'Tecnología')

UPDATE vendedores
SET salario = 785000
WHERE run = 107896321; -- (107896321, 'Pablo', 'Egaña Acevedo', '1972-04-21', 'Tecnología')

UPDATE vendedores
SET salario = 697000
WHERE run = 131574263; -- (131574263, 'Paulina', 'Gonzalez Miranda', '1980-05-17', 'Tecnología')

-- // -------------------
-- clientes antiguos datos columna total_pagado:
UPDATE clientes
SET total_pagado = 25000
WHERE id_cliente = 1;

UPDATE clientes
SET total_pagado = 21000
WHERE id_cliente = 2;

UPDATE clientes
SET total_pagado = 26000
WHERE id_cliente = 3;

UPDATE clientes
SET total_pagado = 59500
WHERE id_cliente = 4;

UPDATE clientes
SET total_pagado = 250000
WHERE id_cliente = 5;

UPDATE clientes
SET total_pagado = 195000
WHERE id_cliente = 6;

UPDATE clientes
SET total_pagado = 350000
WHERE id_cliente = 7;

UPDATE clientes
SET total_pagado = 48000
WHERE id_cliente = 8;

UPDATE clientes
SET total_pagado = 220000
WHERE id_cliente = 9;

UPDATE clientes
SET total_pagado = 24000
WHERE id_cliente = 10;
