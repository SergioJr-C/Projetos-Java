-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 10-Abr-2021 às 10:47
-- Versão do servidor: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `automovel`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `automovel`
--

CREATE TABLE IF NOT EXISTS `automovel` (
`id` int(11) NOT NULL,
  `marca` varchar(40) NOT NULL,
  `modelo` varchar(40) NOT NULL,
  `ano_fab` varchar(40) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `automovel`
--

INSERT INTO `automovel` (`id`, `marca`, `modelo`, `ano_fab`) VALUES
(1, 'volkswagen', 'Gol', '2021'),
(2, 'Ford', 'Mustang Shelby GT500', '2020'),
(3, 'Honda', 'Civic', '2019'),
(4, 'Nissan', 'Versa', '2018'),
(5, 'pegout', 'fusca', '2020');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `automovel`
--
ALTER TABLE `automovel`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `automovel`
--
ALTER TABLE `automovel`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
