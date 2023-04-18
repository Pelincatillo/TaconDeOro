drop database if exists tacondeoro;
create database if not exists `TaconDeOro`;
use TaconDeOro;
create table Socio
(codSocio int not null unique,
nombre varchar(50),
correoE varchar(20),
direccion varchar(20),
poblacion varchar(20),
primary key(codSocio));

create table TarjetaBancaria
(numero int not null unique,
codSocio int not null,
primary key(numero),
foreign key(codSocio) references Socio (codSocio));

create table Pedido
(codPedido int not null unique,
estado varchar(20),
fechap date,
codSocio int not null,
primary key(codPedido),
foreign key(codSocio) references Socio (codSocio));

create table Campana
(codCampana int not null unique,
año int,
temporada varchar(50),
primary key(codCampana));

create table Articulo
(codArticulo int not null unique,
nombre varchar(20),
precio float,
descripcion varchar(50),
material varchar(20),
tipo varchar(20) not null,
talla int,
codCampana int not null,
primary key(codArticulo),
foreign key(codCampana) references Campana (codCampana));

create table LineaPedido
(codPedido int not null,
codArticulo int not null,
ctd int,
primary key(codPedido,codArticulo),
unique(codPedido,codArticulo),
foreign key(codPedido) references Pedido(codPedido),
foreign key(codArticulo) references Articulo(codArticulo));

create table EmpresaTransporte
(codEmpresa int not null unique,
nombre varchar(20),
CIF varchar(50),
domicilioFiscal varchar(20),
primary key(codEmpresa));

create table Ruta
(codRuta int not null unique,
areaInfluencia varchar(20),
diasReparto varchar(20),
codEmpresa int not null,
primary key(codRuta),
foreign key(codEmpresa) references EmpresaTransporte(codEmpresa));

create table Incidencia
(codPedido int not null,
codRuta int not null,
primary key(codPedido,codRuta),
unique(codPedido,codRuta),
foreign key(codPedido) references Pedido (codPedido),
foreign key(codRuta) references Ruta(codRuta));

insert into socio
values(1,"Máximo","maximo@mail.com","c/ Locura","Sevilla"),
(2,"Prudencio","prudencio@mail.com","c/ Esperanza","Barcelona");

insert into campana
values(1,2023,"Primavera"),(2,2023,"Verano"),(3,2023,"Otoño");

insert into articulo
values(1,"NikeBolso",20,"Blaco, comodo y flexible","Cuero","Bolso",0,1),
(2,"NikeDeportivas",80,"Negro, comodo y flexible","Cuero","Zapato",42,2),
(3,"Cinturon",10,"Marron de 90 cm","Cuero","Accesorio",36,3);
