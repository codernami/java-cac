use negocio;
## SE USAN PARA LOS COMENTARIOS como en java usamos //

## consulta 1) nombres de productos que se venden en este negocio
SELECT nombre FROM articulos;

## consulta 2) nombres y precios de productos
SELECT nombre, precio FROM articulos;

## consulta 3) nombre de los productos cuyo precio sea <= 200
SELECT nombre FROM articulos where precio <= 200;

## es la misma consulta pero agrego precio como referencia a que es correcta la consulta :D 
SELECT nombre, precio FROM articulos WHERE precio <= 200;  

## consulta 4) todos los datos de aquellos articulos cuyo precio se encuentre entre 75 y 120
SELECT * FROM articulos WHERE precio BETWEEN 75 AND 120;

## consulta 5) obtener el nombre y el precio en dolares de los productos
SELECT nombre, precio/40 FROM articulos;

## consulta 6) seleccionar el precio promedio de los productos
SELECT AVG(precio) FROM articulos;

## consulta 7) obtener el precio promedio de los articulos cuyo código de los fabricantes sea igual a 2
SELECT AVG(precio) FROM articulos WHERE fabricante = 2;

## consulta 8) obtener la cantidad de artículos cuyo precio sea superior a 150
SELECT count(codigo) FROM articulos WHERE precio > 150;

## consulta 9) obtener el nombre y el precio de los artículos cuyo precio sea >= a 150, ordenarlos en forma
## descendente por precio
SELECT nombre, precio FROM articulos WHERE precio >= 150 ORDER BY precio DESC;

## consulta 10) obtener el listado completo de los artículos incluyendo para cada artículo los datos del artículo y
## su fabricante 
SELECT articulos.*, fabricante.* FROM articulos, fabricante WHERE articulos.fabricante = fabricante.codigo;
## SELECT * FROM articulos, fabricante WHERE articulos.fabricante = fabricante.codigo; mi versión


## SEGUNDA PARTE
## consulta 11) obtener lista de artículos que incluya nombre, precio de artículos y nombre de fabricante
SELECT articulos.nombre, precio, fabricante.nombre FROM articulos, fabricante;

## consulta 12) obtener el precio promedio de los artículos de cada fabricante (solo código de fabricante)
SELECT AVG(precio), fabricante FROM articulos, fabricante GROUP BY fabricante;


## consulta 13) obtener el precio promedio de los artículos de cada fabricante mostrando el nombre
## del fabricante
SELECT articulos.AVG(precio), fabricante FROM articulos,fabricante GROUP BY fabricante;


## consulta 14) listar los nombres de todos los fabricantes cuyo precio promedio sea >= 120
## consulta 15) mostrar el nombre y el precio del artículo más barato
SELECT nombre, MIN(precio) FROM articulos;

## consulta 16) mostrar el nombre y precio del artículo más caro de cada fabricante
SELECT nombre, MAX(precio) FROM articulos GROUP BY fabricante;


## consulta 17) introducir un nuevo artículo cuyo nombre sea savora de valor = 70 y su fabricante de 
## código = 2 y el stock = 20
INSERT INTO articulos (codigo, nombre, precio, stock, fabricante)
VALUES
('savora', 70, 20, 2);

## consulta 18) cambiar el nombre del artículo 5 por parlantes
UPDATE articulos set nombre = 'parlantes' WHERE codigo = 5;

## consulta 19) aplicar un descuento del 10% a todos los productos
SELECT precio * 0.9 FROM articulos;


## consulta 20) aplicar un descuento de $10 a todos aquellos artículos cuyo precio sea >= 150
SELECT precio - 10 FROM ARTICULOS;