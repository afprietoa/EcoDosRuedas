CREATE TABLE IF NOT EXISTS cliente(
	clte_usuario VARCHAR(20) PRIMARY KEY,
    clte_contraseña VARCHAR(20) NOT NULL,
    clte_nombre VARCHAR(20) NOT NULL,
    clte_apellido VARCHAR(20) NOT NULL,
    clte_email VARCHAR(50) UNIQUE NOT NULL,
    clte_celular VARCHAR(20) NOT NULL,
    clte_fecha VARCHAR(50) NOT NULL
);
INSERT INTO cliente VALUES ("lucky", "159357","Pedro", "Perez", "pedrop@gmail.com", "3207663917", "1994-09-04");
INSERT INTO cliente VALUES ("malopez", "753951","Maria", "Lopez", "marial@gmail.com", "3202363917", "1990-05-01");
INSERT INTO cliente VALUES ("diva", "852456","Ana", "Diaz", "anad@gmail.com", "3207645917", "2000-08-05");
INSERT INTO cliente VALUES ("dreamer", "285645","Luis", "Rojas", "luisr@gmail.com", "3207673917", "2002-07-03");
INSERT INTO cliente VALUES ("ninja", "793155","Andres", "Cruz", "andresc@gmail.com", "3207663989", "2006-05-11");
INSERT INTO cliente VALUES ("neon", "648255","Nelson", "Ruiz", "nelsonr@gmail.com", "3101163917", "1990-09-05");
INSERT INTO cliente VALUES ("rose", "553287","Claudia", "Mendez", "claudiam@gmail.com", "3207612137", "2008-06-02");
INSERT INTO cliente VALUES ("green", "961482","Jorge", "Rodriguez", "jorger@gmail.com", "3201415917", "1993-01-15");