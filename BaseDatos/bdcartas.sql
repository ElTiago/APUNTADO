CREATE TABLE jugador (
  nombre varchar(255) NOT NULL DEFAULT 'Santiago',
  contraseña varchar(255) NOT NULL DEFAULT 'hola123',
  edad int NOT NULL DEFAULT '20',
  fichas int NOT NULL DEFAULT '20',
  PRIMARY KEY (nombre)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='Listado de Jugadores'
