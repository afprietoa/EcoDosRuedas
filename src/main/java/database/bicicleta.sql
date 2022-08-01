CREATE TABLE IF NOT EXISTS bicicleta(
	bici_id INT PRIMARY KEY,
    bici_fabricante INT NOT NULL,
    bici_precio INT NOT NULL,
    bici_anio INT NOT NULL,
    CONSTRAINT fk_bici_fabricante FOREIGN KEY (bici_fabricante) REFERENCES fabricante (fab_id)
);
INSERT INTO bicicleta VALUES (1, 1, 1200000, 2020);
INSERT INTO bicicleta VALUES (2, 2, 1450000, 2019);
INSERT INTO bicicleta VALUES (3, 3, 2000000, 2020);
INSERT INTO bicicleta VALUES (4, 4, 950000, 2021);
INSERT INTO bicicleta VALUES (5, 5, 1950000, 1018);
