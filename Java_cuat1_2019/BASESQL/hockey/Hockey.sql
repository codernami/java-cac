create database Hockey;
use Hockey;

create table jugadores (
codJug int PRIMARY KEY, 
codigo int(4), 
nombre varchar(100)
);

insert into jugadores (codJug, codigo,nombre)
values 
(300, 3000, 'Garcia'),
(310, 3001, 'Alabama'),
(320, 3002, 'Fernandez'),
(330, 3003, 'Meridiano'),
(340, 3004, 'Martinez'),
(350, 3005, 'Alanis'),
(360, 3006, 'Galiano'),
(370, 3007, 'Estevanez'),
(380, 3008, 'Diaz'),
(390, 3009, 'Benitez');

select * from jugadores;

create table equipo (
codEqui int PRIMARY KEY, 
codigo int(3),
nombre varchar(100)
); 
 
insert into equipo (codEqui,codigo,nombre) 
values
(100, 1000, 'Valencia'),
(110, 1001, 'Barcelona'),
(120, 1002, 'Zaragoza'),
(130, 1003, 'Milan'),
(140, 1004, 'Juventus'),
(150, 1005, 'Inter'),
(160, 1006, 'Bayer'),
(170, 1007, 'Berlin'),
(180, 1008, 'Munich'),
(190, 1009, 'Tottengam'),
(200, 1010, 'Madrid');

select * from equipo;
 
create table juegaEn (
codJug int, 
fInicio date, 
fFinal date, 
codEqui int
);
 
insert into juegaEn (codJug,fInicio,fFinal,codEqui)
values
(300, '2010-10-10', '2012-12-01',100),
(310, '2007-12-03', '2008-10-10',100),
(320, '2014-07-12', '2015-03-30',110), 
(330, '2016-02-16', '2018-11-18',130);

select * from juegaEn;
 
select jugadores.nombre, equipo.nombre 
from jugadores, equipo, juegaEn 
where jugadores.codJug = juegaEn.codJug;
 