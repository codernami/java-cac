CREATE DATABASE empresa;
use empresa;

##EMPLEADOS
CREATE TABLE empleados(
dni VARCHAR(8),
nombre VARCHAR(100),
apellido VARCHAR(100),
departamento INT(3), 
PRIMARY KEY (dni)
);

INSERT INTO empleados (dni,nombre, apellido, departamento)
VALUES
('23345567', 'Juliana', 'Alvarez', 2),
('22787987', 'Mariana', 'Perez', 2),
('45678890', 'Martina', 'Lopez', 1),
('34567866', 'Alejandro', 'Paredes', 1),
('24687678', 'Juan', 'Estrella', 3),
('21466577', 'Mariano', 'Mile', 3),
('22357576', 'Aldana', 'Martin', 4),
('29823453', 'Juliana', 'Gonzalez', 4),
('34564676', 'Joaquin', 'Alvarado', 5),
('34565675', 'Sofía', 'Luma', 5);

##DEPARTAMENTOS
CREATE TABLE departamentos(
codigo INT(3),
nombre VARCHAR(100),
presupuesto INT(7),
PRIMARY KEY(codigo));

INSERT INTO departamentos (codigo, nombre, presupuesto)
VALUES
(1, 'informatica', 10780),
(2, 'diseño', 767000),
(3, 'administración', 456000),
(4, 'inventario', 23400),
(5, 'tecnologia', 234500),
(6, 'marketing', 450500),
(7, 'investigación', 170500);

##consulta 1 / obtener el apellido de todos los empleados OK
SELECT apellido FROM empleados;

##consulta 2 / obtener el apellido de todos los empleados sin repeticiones OK
SELECT DISTINCT apellido FROM empleados;

## consulta 3 / obtener todos los datos de todos los empleados de apellido Perez OK
SELECT * FROM empleados WHERE apellido = 'Perez';

## consulta 4 / obtener todos los datos de todos los empleados que se apelliden lopez o perez OK
SELECT * FROM empleados WHERE apellido = 'Perez' OR apellido='Lopez';

##consulta 5 / obtener todos los datos de los empleados que trabajan en el departamento 5 OK
SELECT * FROM empleados WHERE departamento= 5;

## consulta 6 / obtener todos los datos de los empleados que trabajan en el departemento 3 o 1 OK
SELECT * FROM empleados WHERE departamento = 3 OR departamento = 1;

## consulta 7 / obtener todos los datos de los empleados cuyo apellido comienza con P  OK
SELECT * FROM empleados WHERE apellido LIKE 'P%';

## consulta 8 / obtener el presupuesto de todos los departamentos OK
SELECT presupuesto FROM departamentos;
SELECT SUM(presupuesto) FROM departamentos;

##consulta 9 / obtener la cantidad de empleados de cada departamento OK
SELECT count(*) FROM empleados GROUP BY departamento;

SELECT COUNT(empleados.nombre), departamentos.nombre
FROM empleados, departamentos
WHERE empleados.departamento = departamentos.codigo
GROUP BY departamento;

## consulta 10 / obtener todos los datos de los empleados y los datos de los departamentos organizados por departamento
SELECT empleados.*, departamentos.* FROM empleados, departamentos
WHERE departamentos.codigo = empleados.departamento
ORDER BY departamentos.codigo ASC;

select * from empleados
inner join departamentos
on empleados.departamento = departamentos.codigo;

## consulta 11 / obtener todos los nombres y apellidos del empleado y nombre del departamento - OK
SELECT empleados.nombre, empleados.apellido, departamentos.nombre
FROM empleados, departamentos
WHERE departamentos.codigo = empleados.departamento;

##consulta 12 / obtener los nombres y apellidos de todos los empleados que trabajan en departamentos con 
##presupuesto menor a 100000 - OK
select empleados.nombre, empleados.apellido, departamentos.presupuesto
from empleados, departamentos
where empleados.departamento = departamentos.codigo and presupuesto < 100000;

## consulta 13 / mostrar los nombres de todos los departamentos que tengan al menos 2 empleados - OK
select count(departamento), departamentos.nombre 
from empleados, departamentos
where empleados.departamento = departamentos.codigo
group by empleados.departamento
having count(*) > 1;

##consulta 14 / obtener el nombre del departamento que tiene más empleados, si hay más de uno, de todos.
select departamentos.nombre 
where empleados.departamento = departamentos.codigo
and max(select count(departamento) from empleados);
##group by empleados.departamento;

##consulta 15 / agregar el departamento informatica con presupuesto de 100000 y codigo 14. Agregar al nuevo departamento
## a la empleada Juana Molina, dni 40256696. OK
INSERT INTO departamentos (codigo, nombre, presupuesto)
VALUES
(14, 'informática',100000);

INSERT INTO empleados (dni, nombre, apellido, departamento)
VALUES
('40256696', 'Juana', 'Molina', 14);

##consulta 16 / aplicar un recorte presupuestario del 10% a todos los departamentos - OK
SELECT presupuesto * 0.9 FROM departamentos;

set SQL_SAFE_UPDATES=0;
UPDATE departamentos set presupuesto = (presupuesto * 0.9);
set SQL_SAFE_UPDATES=1;

##consulta 17 / reubicar a todos los empleados del departamento Investigacion (7)
##al departamento de informática (14) - OK
set SQL_SAFE_UPDATES = 0;
UPDATE empleados set departamento = 14
WHERE departamento = 7;
set SQL_SAFE_UPDATES = 1;

##consulta 18 / despedir a todos los empleados de los departamentos con presupuesto inferior a 50000 - OK
set SQL_SAFE_UPDATES = 0;
DELETE empleados 
FROM empleados 
inner join departamentos
on empleados.departamento = departamentos.codigo 
WHERE departamentos.presupuesto < 50000;
set SQL_SAFE_UPDATES = 1; 

##consulta 19 / despedir a los empleados del departamento de informatica (14)- OK
set SQL_SAFE_UPDATES =0;
DELETE FROM empleados WHERE departamento = 14;
set SQL_SAFE_UPDATES =1;

##consulta 20 / despedir a todos los empleados - OK
set SQL_SAFE_UPDATES = 0; 
DELETE FROM empleados;
set SQL_SAFE_UPDATES =1;