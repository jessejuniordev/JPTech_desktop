/**
 * Author:  jessejunior
 * Created: 13 de jan. de 2025
 */

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

-- -------------------
--  Schema: jptech ---
-- -------------------
CREATE SCHEMA IF NOT EXISTS `jptech`;
USE `jptech`;

-- -------------------
-- Tabela: Clientes --
-- -------------------
CREATE TABLE IF NOT EXISTS `clientes` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `nome` varchar(255) NOT NULL,
	`cpf` varchar(11) NOT NULL UNIQUE,
    `genero` char(1) NOT NULL,
    `celular` varchar(14),
    `empresa` varchar(150) NOT NULL,
    `area` varchar(100) NOT NULL,
        
	PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


-- -----------------------
-- Tabela: Funcionarios --
-- -----------------------
CREATE TABLE IF NOT EXISTS `funcionarios` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `nome` varchar(255) NOT NULL,
	`cpf` varchar(11) NOT NULL UNIQUE,
    `genero` char(1) NOT NULL,
    `celular` varchar(14),
    `cargo` varchar(100) NOT NULL,
    `salario` decimal(10, 2) NOT NULL, -- 99.999.999,99
    `area` varchar(100) NOT NULL,
        
	PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;