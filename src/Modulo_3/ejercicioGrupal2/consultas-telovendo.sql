-- // 	ACTUALIZACION DE TABLAS ----------------------------------------------------------------
-- A.	A la tabla productos agregue el atributo Precio.
ALTER TABLE productos
ADD precio DOUBLE NOT NULL;

-- B.	A la tabla vendedores agregue el atributo Salario.
ALTER TABLE vendedores
ADD salario DOUBLE NOT NULL;

-- C.	A la tabla clientes agregue el atributo Total pagado.
ALTER TABLE clientes
ADD total_pagado DOUBLE NOT NULL;

-- // ----------------------------------------------------------------------------------------------
-- D.	Ingrese 10 vendedores.
/* vendedores(run INT PRIMARY KEY, nombre_vendedor VARCHAR(50), apellido_vendedor VARCHAR(50),
fecha_nacimiento DATE, seccion_trabajo VARCHAR(50), salario DOUBLE); */
-- // secciones trabajo: Tecnología, Calzado, Ropa, Belleza, Hogar, Electrónica
INSERT INTO vendedores(run, nombre_vendedor, apellido_vendedor, fecha_nacimiento, seccion_trabajo, salario)
VALUES 
(159874563, 'Andrés', 'Muñoz', '1985-04-12', 'Electrónica', 415000), -- 1
(214529872, 'Beatriz', 'Rojas', '1990-06-23', 'Belleza', 316000), -- 2
(129876327, 'Claudio', 'Pérez', '1982-11-15', 'Calzado', 417000), -- 3
(236547896, 'Daniela', 'González', '1995-02-28', 'Hogar', 395000), -- 4
(146586523, 'Esteban', 'Lara', '1988-09-05', 'Tecnología', 765000), -- 5
(223216548, 'Fernanda', 'Silva', '1993-12-19', 'Electrónica', 615000), -- 6
(141456547, 'Gonzalo', 'Vargas', '1987-07-30', 'Electrónica', 716000), -- 7
(217937538, 'Héctor', 'Reyes', '1991-03-22', 'Hogar', 370000), -- 8
(147418523, 'Isabel', 'Morales', '1984-10-10', 'Hogar', 455000), -- 9
(219649878, 'Javier', 'Navarro', '1992-01-17', 'Belleza', 365000); -- 10

SELECT * FROM vendedores;
  
  
  -- E.	Ingrese 15 clientes.
/* clientes( id_cliente INT PRIMARY KEY AUTO_INCREMENT, nombre_cliente VARCHAR(50),
apellido_cliente VARCHAR(50), telefono INT, direccion VARCHAR(45), comuna VARCHAR(45), email VARCHAR(45),
fecha_registro DATETIME DEFAULT CURRENT_TIMESTAMP(), total_pagado DOUBLE, UNIQUE(id_cliente)); */
INSERT INTO clientes(nombre_cliente, apellido_cliente, telefono, direccion, comuna, email, total_pagado)
VALUES ('Juan', 'Pérez', '912345679', 'Calle Falsa 123', 'Santiago', 'juan.perez@example.com', 650000), -- 
('María', 'Gómez', '987654321', 'Avenida Siempre Viva 742', 'Valparaíso', 'maria.gomez@example.com', 23500), -- 2
('Ricardo', 'Mendoza', '101010101', 'Calle de la Luna 808', 'Puerto Montt', 'ricardo.mendoza@example.com', 52500), -- 3
('Carlos', 'Sánchez', '925555555', 'Boulevard de los Sueños 456', 'Concepción', 'carlos.sanchez@example.com', 12000), -- 4
('Ana', 'Martínez', '444444444', 'Pasaje de la Luna 789', 'La Serena', 'ana.martinez@example.com', 31000), -- 5
('Luis', 'Rodríguez', '333333333', 'Camino del Sol 101', 'Antofagasta', 'luis.rodriguez@example.com', 27500), -- 6
('Elena', 'Fernández', '222222222', 'Calle del Mar 202', 'Iquique', 'elena.fernandez@example.com', 180000), -- 7
('Jorge', 'López', '111111111', 'Avenida del Parque 303', 'Temuco', 'jorge.lopez@example.com', 220050), -- 8
('Laura', 'Hernández', '666666666', 'Camino de las Flores 404', 'Rancagua', 'laura.hernandez@example.com', 195000), -- 9
('Pedro', 'García', '777777777', 'Pasaje de los Pinos 505', 'Talca', 'pedro.garcia@example.com', 250000), -- 10
('Sofía', 'Ramírez', '888888888', 'Calle de la Estrella 606', 'Arica', 'sofia.ramirez@example.com', 30000), -- 11
('Gabriela', 'Torres', '999999999', 'Avenida de la Paz 707', 'Viña del Mar', 'gabriela.torres@example.com', 32000), -- 12
('Valentina', 'Castro', '202020202', 'Pasaje de las Rosas 909', 'Chillán', 'valentina.castro@example.com', 275000), -- 13
('Diego', 'Vega', '303030303', 'Camino de los Andes 1010', 'Osorno', 'diego.vega@example.com', 190000), -- 14
('Camila', 'Silva', '404040404', 'Boulevard del Sol 1111', 'Copiapó', 'camila.silva@example.com', 126000); -- 15

SELECT * FROM clientes;

-- F.	Ingrese 10 productos.
/* productos( sku INT PRIMARY KEY, nombre_producto VARCHAR(50), categoria VARCHAR(40),
fabricante VARCHAR(50), stock INT, precio DOUBLE); */
-- // secciones trabajo: Tecnología, Calzado, Ropa, Belleza, Hogar, Electrónica
INSERT INTO productos(sku, nombre_producto, categoria, fabricante, stock, precio)
VALUES (1001, 'Laptop Pro', 'Electrónica', 'TechCorp', 50, 1250000), -- 1
(1002, 'Smartphone X', 'Electrónica', 'MobileInc', 100, 800000), -- 2
(1003, 'Tablet S', 'Electrónica', 'GadgetWorld', 75, 450000), -- 3
(1004, 'Auriculares', 'Accesorios', 'SoundWave', 200, 45000), -- 4
(1005, 'Cámara Digital', 'Fotografía', 'PhotoSnap', 30, 60000), -- 5
(1006, 'Impresora Láser', 'Oficina', 'PrintMaster', 40, 300000), -- 6
(1007, 'Monitor HD', 'Electrónica', 'ScreenTech', 60, 250000), -- 7
(1008, 'Teclado Inalámbrico', 'Accesorios', 'KeyPro', 150, 10000), -- 8
(1009, 'Mouse Inalámbrico', 'Accesorios', 'ClickFast', 180, 5000), -- 9
(1010, 'Altavoces Bluetooth', 'Audio', 'SoundWave', 90, 22000); -- 10

SELECT * FROM productos;
