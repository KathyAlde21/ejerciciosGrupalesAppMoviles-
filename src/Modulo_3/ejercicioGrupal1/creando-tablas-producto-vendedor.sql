USE telovendo;

-- respaldo datos tabla cliente
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
);
