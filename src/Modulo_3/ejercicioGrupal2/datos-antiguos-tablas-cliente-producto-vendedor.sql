USE telovendo;

-- alimentando tabla cliente
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
('Isanny', 'Velasquez Alvarez', 974859878, 'Psje Selva Oscura', 'La Florida', 'isanny@gmail.com'); -- 10

-- alimentando tabla producto
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
(556, 'Botas', 'Calzado', '16 Horas', 6); -- 10

-- alimentando tabla vendedor
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
(131574263, 'Paulina', 'Gonzalez Miranda', '1980-05-17', 'Tecnología'); -- 10
