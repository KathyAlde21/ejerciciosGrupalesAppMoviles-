/* Tablas originales:
CREATE TABLE cliente(
idCliente INT PRIMARY KEY AUTO_INCREMENT,
nombreCliente VARCHAR(50) NOT NULL,
apellidoCliente VARCHAR(50) NOT NULL,
telefono INT NOT NULL,
direccion VARCHAR(45) NOT NULL,
comuna VARCHAR(45) NOT NULL,
email  VARCHAR(45) NOT NULL,
fechaRegistro DATETIME DEFAULT CURRENT_TIMESTAMP(),
UNIQUE(idCliente)
);

CREATE TABLE producto(
sku INT PRIMARY KEY NOT NULL,
nombreProducto VARCHAR(50) NOT NULL,
categoria VARCHAR(40) NOT NULL,
fabricante VARCHAR(50) NOT NULL,
stock INT NOT NULL
);

CREATE TABLE vendedor(
run INT PRIMARY KEY NOT NULL,
nombreVendedor VARCHAR(50) NOT NULL,
apellidoVendedor VARCHAR(50) NOT NULL,
fechaNacimiento DATE,
seccionTrabajo VARCHAR(50) NOT NULL
);*/

-- para que se vean todas las tablas igual cambie nombres tabla y campos:
-- cliente (idCliente, nombreCliente, apellidoCliente, fechaRegistro)
ALTER TABLE cliente
RENAME COLUMN idCliente
TO id_cliente;

ALTER TABLE cliente
RENAME COLUMN nombreCliente
TO nombre_cliente;

ALTER TABLE cliente
RENAME COLUMN apellidoCliente
TO apellido_cliente;

ALTER TABLE cliente
RENAME COLUMN fechaRegistro
TO fecha_registro;

RENAME TABLE cliente
TO clientes;

-- producto (nombreProducto);
ALTER TABLE producto
RENAME COLUMN nombreProducto
TO nombre_producto;

RENAME TABLE producto
TO productos;

-- vendedor (nombreVendedor, apellidoVendedor, fechaNacimiento, seccionTrabajo)
ALTER TABLE vendedor
RENAME COLUMN nombreVendedor
TO nombre_vendedor;

ALTER TABLE vendedor
RENAME COLUMN apellidoVendedor
TO apellido_vendedor;

ALTER TABLE vendedor
RENAME COLUMN fechaNacimiento
TO fecha_nacimiento;

ALTER TABLE vendedor
RENAME COLUMN seccionTrabajo
TO seccion_trabajo;

RENAME TABLE vendedor
TO vendedores;
