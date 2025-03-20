
INSERT INTO products(id, title, description, price) VALUES (1, 'Bicicleta', 'Bicicleta rodada 25', 4500.50), (2, 'Bicicleta Montaña', 'Bicicleta todo terreno rodada 26', 5800.75);
INSERT INTO products(id, title, description, price) VALUES (3, 'Patineta', 'Patineta profesional', 1500.90);
INSERT INTO products(id, title, description, price) VALUES (4, 'Casco', 'Casco de seguridad para bicicleta', 800.50);
INSERT INTO products(id, title, description, price) VALUES (5, 'Guantes', 'Guantes antideslizantes para ciclismo', 450.75);
INSERT INTO products(id, title, description, price) VALUES (6, 'Rodilleras', 'Rodilleras para deportes extremos', 650.30);
INSERT INTO products(id, title, description, price) VALUES (7, 'Monopatín', 'Monopatín estilo clásico', 2300.00);
INSERT INTO products(id, title, description, price) VALUES (8, 'Bicicleta Eléctrica', 'Bicicleta con batería integrada', 12500.95);
INSERT INTO products(id, title, description, price) VALUES (9, 'Cámara', 'Cámara de aire para bicicleta', 300.45);
INSERT INTO products(id, title, description, price) VALUES (10,'Luz Frontal', 'Luz LED para bicicleta', 250.00);
INSERT INTO products(id, title, description, price) VALUES (11,'Reflector', 'Reflector trasero rojo para bicicleta', 180.35);

INSERT INTO roles(id, name) VALUES (1, 'ADMIN');
INSERT INTO roles(id, name) VALUES (2, 'CUSTOMER');

INSERT INTO customers(id, first_name, last_name, email, password, active) VALUES (1, 'Bob', 'Esponja', 'bob@esponja.com', '$2a$10$Su5Y7B0V9ab24ZBUG6OsBOWyzXchSLp6AshwOq6mlDu8rA6zmt2oW', true);
INSERT INTO customers(id, first_name, last_name, email, password, active) VALUES (2, 'Arenita', 'Mejillas', 'arenita@mejillas.com', '$2a$10$Su5Y7B0V9ab24ZBUG6OsBOWyzXchSLp6AshwOq6mlDu8rA6zmt2oW', true);

INSERT INTO customer_has_role(customer_id, role_id) VALUES (1,2); -- Bob es Customer
INSERT INTO customer_has_role(customer_id, role_id) VALUES (2,2); -- Arenita es Customer
INSERT INTO customer_has_role(customer_id, role_id) VALUES (2,1); -- Arenita es Admin