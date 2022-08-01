CREATE TABLE IF NOT EXISTS intencion_compra(
	int_compra_id INT PRIMARY KEY,
    int_compra_usuario VARCHAR(20) NOT NULL,
    int_compra_fabricante INT NOT NULL,
    int_compra_fecha_hora VARCHAR(50) NOT NULL,
	CONSTRAINT fk_int_compra_cliente FOREIGN KEY (int_compra_usuario) REFERENCES cliente (clte_usuario),
    CONSTRAINT fk_int_compra_fabricante FOREIGN KEY (int_compra_fabricante) REFERENCES fabricante (fab_id)
);
INSERT INTO intencion_compra VALUES (1001, "lucky", 1, "2017-10-25 20:00:00");
INSERT INTO intencion_compra VALUES (1002, "lucky", 2, "2019-03-15 18:30:00");
INSERT INTO intencion_compra VALUES (1003, "lucky", 6, "2019-05-20 20:30:00");
INSERT INTO intencion_compra VALUES (1004, "malopez", 1, "2018-05-20 20:30:00");
INSERT INTO intencion_compra VALUES (1005, "malopez", 6, "2020-01-20 20:30:00");
INSERT INTO intencion_compra VALUES (1006, "diva", 3, "2019-05-20 20:30:00");
INSERT INTO intencion_compra VALUES (1007, "diva", 4, "2018-06-22 21:30:00");
INSERT INTO intencion_compra VALUES (1008, "diva", 7, "2020-03-17 15:30:20");
INSERT INTO intencion_compra VALUES (1009, "dreamer", 7, "2020-03-17 15:30:20");
INSERT INTO intencion_compra VALUES (1010, "dreamer", 8, "2020-04-10 18:30:20");
INSERT INTO intencion_compra VALUES (1011, "ninja", 9, "2020-02-17 20:30:20");
INSERT INTO intencion_compra VALUES (1012, "ninja", 6, "2020-02-20 16:30:20");
INSERT INTO intencion_compra VALUES (1013, "ninja", 10, "2020-03-27 18:30:20");
INSERT INTO intencion_compra VALUES (1014, "rose", 11, "2020-03-20 21:30:20");
INSERT INTO intencion_compra VALUES (1015, "green", 3, "2020-01-10 17:30:20");
INSERT INTO intencion_compra VALUES (1016, "green", 2, "2020-02-15 20:30:20");
INSERT INTO intencion_compra VALUES (1017, "green", 5, "2020-03-17 18:30:20");