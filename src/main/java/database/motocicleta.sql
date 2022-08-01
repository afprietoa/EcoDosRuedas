CREATE TABLE IF NOT EXISTS motocicleta(
	moto_id INT PRIMARY KEY AUTO_INCREMENT,
    moto_fabricante INT NOT NULL,
    moto_precio INT NOT NULL,
    moto_autonomia INT NOT NULL,
    moto_proveedor INT NOT NULL,
    CONSTRAINT fk_moto_proveedor FOREIGN KEY (moto_proveedor) REFERENCES proveedor (prov_id),
    CONSTRAINT fk_moto_fabricante FOREIGN KEY (moto_fabricante) REFERENCES fabricante (fab_id)
);
INSERT INTO motocicleta VALUES (1, 6, 4200000, 18, 101);
INSERT INTO motocicleta VALUES (2, 7, 5600000, 14, 102);
INSERT INTO motocicleta VALUES (3, 8, 4600000, 26, 101);
INSERT INTO motocicleta VALUES (4, 9, 8000000, 36, 103);
INSERT INTO motocicleta VALUES (5, 10, 5900000, 20, 104);
INSERT INTO motocicleta VALUES (6, 11, 4500000, 12, 105);
