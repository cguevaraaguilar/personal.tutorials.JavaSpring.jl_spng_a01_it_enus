-- Se posiciona en la BD de sistema.
use sys;

-- Borrado de la BD si existe.
DROP DATABASE IF EXISTS springdemodb;

-- Creación de la BD con UTF-8 actualizado.
CREATE DATABASE IF NOT EXISTS 
	springdemodb
	DEFAULT CHARACTER SET utf8mb4
	DEFAULT COLLATE utf8mb4_general_ci;

USE springdemodb;

CREATE TABLE foodgroups
(
	id			int				NOT NULL,
    name		varchar (45)	NOT NULL,
    description	varchar (100)	NOT NULL,
    primary key (id)
);
