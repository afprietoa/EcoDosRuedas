SELECT 'Consulta 1';
SELECT fab_nombre FROM fabricante ORDER BY fab_nombre ASC;

SELECT 'Consulta 2';
SELECT fab_nombre, bici_precio, bici_anio FROM bicicleta, fabricante WHERE bicicleta.bici_fabricante = fabricante.fab_id AND bici_anio >= 2019 ORDER BY fab_nombre ASC;

SELECT 'Consulta 3';
SELECT fab_nombre FROM motocicleta, fabricante, proveedor WHERE  motocicleta.moto_fabricante = fabricante.fab_id AND motocicleta.moto_proveedor = proveedor.prov_id AND prov_nombre = "Auteco";

SELECT 'Consulta 4';
SELECT fab_nombre FROM fabricante, cliente, intencion_compra WHERE intencion_compra.int_compra_fabricante = fabricante.fab_id AND intencion_compra.int_compra_usuario = cliente.clte_usuario AND cliente.clte_usuario = "lucky" ORDER BY fab_nombre ASC;

SELECT 'Consulta 5';
SELECT clte_usuario, clte_nombre, clte_apellido FROM cliente, fabricante, intencion_compra WHERE intencion_compra.int_compra_fabricante = fabricante.fab_id AND fab_nombre = "Yeti" AND intencion_compra.int_compra_usuario = cliente.clte_usuario;

SELECT 'Consulta 6';
SELECT COUNT(bici_id) FROM bicicleta WHERE bici_anio >= 2019;