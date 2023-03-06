create database Persona;
use Persona;

create table domicilio (
nombre varchar(100), 
direccion varchar(100), 
localidad int(3)
);

insert into domicilio 
values 
('Juan', 'Lima 940', 1),
('Antonio', 'Boedo 100',2),
('Juliana','Maza 345',3);

## muestro todos los campos de la tabla domicilio
select * from domicilio;

## muestro todos los campos de la tabla domicilio cuya localidad sea Rosario (3)
select * from domicilio 
where localidad = 1;

## cargo mas datos a la tabla domicilio
insert into domicilio (nombre, direccion, localidad)
values 
('Luis','Salta 25',1),
('Javier','Moreno 1225',3),
('Maria', 'San Juan 27', 5), 
('Azul', 'Corrientes 183',2), 
('Pedro','Posadas 1234',1), 
('Silvia','Puan 314',3),
('Pablo', 'Salta 655',4),
('Pamela','Virrey del Pino 1225',5);

## muestro los nombres cargados en la tabla domicilio cuya localidad sea Rosario (3)
select nombre from domicilio where localidad = 3;  

## muestro los nombres y localidades de la tabla domicilio donde los nombres empiecen con j
select nombre,localidad from domicilio where nombre like 'J%' ;

## creo una nueva tabla para localidades
create table localidad (
codigo int(3), 
nombre varchar(100));

insert into localidad (codigo,nombre)
values 
(1,'CABA'),
(2,'Cordoba'),
(3,'Rosario'),
(4,'Paraná'),
(5,'Sta. Rosa');

## muestro los nombres de personas y localidades de cada tabla a la que pertenecen
## donde coincidan por codigo la localidad
select domicilio.nombre, localidad.nombre
from domicilio, localidad
where domicilio.localidad = localidad.codigo;

##clase hoy 9/4

## agrego una columna para 'edad' a la tabla modificando asi su estructura. le doy la posición
alter table domicilio add column edad int(2) after nombre;

select * from domicilio;

SET SQL_SAFE_UPDATE = 0;

delete from domicilio where edad > 0;

insert into domicilio (edad) values 
(23),(22),(18),(16),(24),(20),(21),(20);

select * from domicilio;
