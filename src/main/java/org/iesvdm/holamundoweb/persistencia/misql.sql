-- Crear la base de datos si no existe
CREATE DATABASE IF NOT EXISTS Empresa;

-- Usar la base de datos
USE Empresa;

-- Crear la tabla empleado si no existe
CREATE TABLE IF NOT EXISTS empleado (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY, -- Identificador único
    nombre VARCHAR(50) NOT NULL,               -- Nombre del empleado
    apellido VARCHAR(50) NOT NULL,             -- Apellido del empleado
    puesto VARCHAR(100),                       -- Puesto de trabajo
    salario DECIMAL(10, 2),                    -- Salario
    fecha_contratacion DATE,                   -- Fecha de contratación
    activo BOOLEAN DEFAULT TRUE                -- Estado del empleado
);

SELECT * FROM empleado;

/*

docker run --name mysql-empresa -e MYSQL_ROOT_PASSWORD=secret -e MYSQL_DATABASE=Empresa -p 3306:3306 -d mysql:latest

*/