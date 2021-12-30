-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2021 at 02:52 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `course_work`
--

-- --------------------------------------------------------

--
-- Table structure for table `delivered_materials`
--

CREATE TABLE `delivered_materials` (
  `number` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `manufacturer` varchar(255) NOT NULL,
  `quantity` varchar(45) NOT NULL,
  `weight (kg)` int(10) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `delivered_materials`
--

INSERT INTO `delivered_materials` (`number`, `name`, `manufacturer`, `quantity`, `weight (kg)`, `date`) VALUES
(1, 'Putty (Glad)', 'Kraft', '50', 25, '2020-01-02'),
(2, 'Gypsum board K (12.5mm)', 'Knauf', '101', 25, '2020-01-03'),
(3, 'Gypsum board K (9.5mm)', 'Knauf', '75', 20, '2020-09-28'),
(4, 'Сement (M500)', 'Kant Zavod', '55', 50, '2020-01-01'),
(7, 'steel bar', 'AQUAdom', '2', 0, '2021-12-29'),
(8, 'Rail (0.03*0.05*6)', 'Forest Russia', '5', 2, '2021-12-29'),
(9, 'cement', 'AQUAdom', '1', 0, '2021-12-30'),
(10, 'penoplex', 'Teppa Wood Comp', '1', 0, '2021-12-30'),
(11, 'Edged board (0.03*0.06*6)', 'Forest Russia', '3', 5, '2021-12-30'),
(12, 'clay', 'Stroymag', '9', 0, '2021-12-30');

-- --------------------------------------------------------

--
-- Table structure for table `finished_objects`
--

CREATE TABLE `finished_objects` (
  `number` int(10) NOT NULL,
  `objects` varchar(40) NOT NULL,
  `company` varchar(255) NOT NULL,
  `address` varchar(45) NOT NULL,
  `square (m2)` int(10) UNSIGNED NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `finished_objects`
--

INSERT INTO `finished_objects` (`number`, `objects`, `company`, `address`, `square (m2)`, `date`) VALUES
(1, 'Sofia', 'EliteHouse', 'str. Tokombaeva 27/4', 1900, '2018-11-01'),
(2, 'Maximum Plus', 'EliteHouse', 'str. Turusbekova 109/1', 4200, '2018-09-11'),
(3, 'South Park', 'EliteHouse', 'str. Sayakbai Karalaev 40/4', 3467, '2019-09-05'),
(4, 'Ala Too', 'EliteHouse', 'str. Isakeev 2', 8900, '2019-02-19'),
(5, 'Italien Quarter', 'EliteHouse', 'str. S.Bator', 11500, '2019-05-15'),
(6, 'Asanbai Ordo', 'EliteHouse', 'str. Aaly Tokombaev', 15800, '2021-03-28'),
(7, 'New York City', 'EliteHouse', 'str S.Batora', 2872, '2020-05-22'),
(8, 'Aleksandriya', 'EliteHouse', 'str. Togolok Moldo', 2551, '2020-09-18'),
(9, 'El Classico', 'EliteHouse', 'str. Isanova', 4500, '2021-02-12'),
(16, 'objects', 'company', 'address', 9999, '2021-12-19'),
(17, 'Karpinka', 'CupStroy', 'str. Karasaeva 89', 2751, '2021-12-23'),
(18, 'Club house \"Romance\"', 'CupStroy', 'str. Frunze', 1972, '2021-12-27'),
(19, 'AH \"Ihsan\"', 'Ihlas', 'str. Gogolya 57', 3698, '2021-12-27'),
(20, 'Nur-Ordo', 'CupStroy', 'str. Isanova 48/6', 3970, '2021-12-27'),
(21, 'AC\"Tyhiy Ugolok2\"', 'EmarkStroy', 'str. Bokonbai 97', 1275, '2021-12-27'),
(22, 'Eles', 'TSgroup', 'str. Mederova 103', 2468, '2021-12-29'),
(23, 'Zalkar', 'EmarkStroy', 'str. Kulatov 66', 3465, '2021-12-30');

-- --------------------------------------------------------

--
-- Table structure for table `materials`
--

CREATE TABLE `materials` (
  `number` int(11) NOT NULL,
  `name` varchar(40) NOT NULL,
  `manufacturer` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `quantity` int(10) UNSIGNED NOT NULL,
  `weight (kg)` int(10) NOT NULL,
  `cost` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `materials`
--

INSERT INTO `materials` (`number`, `name`, `manufacturer`, `type`, `quantity`, `weight (kg)`, `cost`) VALUES
(1, 'Balk (0.10*0.10*6)', 'Forest Russia', 'lumber', 100, 10, 1530),
(2, 'Edged board (0.03*0.06*6)', 'Forest Russia', 'lumber', 3, 5, 275),
(3, 'Edged board (0.04*0.10*6)', 'Forest Russia', 'lumber', 50, 5, 612),
(4, 'Edged board (0.04*0.20*6)', 'Forest Russia', 'lumber', 50, 6, 1224),
(5, 'Edged board (0.05*0.18*6)', 'Forest Russia', 'lumber', 80, 7, 1377),
(6, 'Rail (0.03*0.05*6)', 'Forest Russia', 'lumber', 90, 2, 230),
(7, 'Rail (0.04*0.05*6)', 'Forest Russia', 'lumber', 100, 3, 300),
(8, 'Rail (0.05*0.05*6)', 'Forest Russia', 'lumber', 100, 4, 380),
(9, 'Gypsum board K (12.5mm)', 'Knauf', 'drywall', 81, 25, 460),
(10, 'Gypsum board K (9.5mm)', 'Knauf', 'drywall', 100, 22, 400),
(11, 'Gypsum board G (12.5mm)', 'Gifas', 'drywall', 100, 25, 460),
(12, 'Gypsum board G (9.5mm)', 'Gifas', 'drywall', 100, 22, 380),
(13, 'penoplex', 'Teppa Wood Comp', 'Polymaterials', 11, 0, 1000),
(14, 'flitch', 'AQUAdom', 'Polymaterials', 10, 0, 1000),
(15, 'cement', 'AQUAdom', 'Cementing materials', 20, 0, 5300),
(16, 'gypsum', 'Buzzi', 'Cementing materials', 20, 0, 5300),
(17, 'lime', 'Buzzi', 'Cementing materials', 20, 0, 5300),
(19, 'fitting', 'AQUAdom', 'Metal products', 100, 0, 15000),
(20, 'grid(steel)', 'AQUAdom', 'Metal products', 100, 0, 15000),
(21, 'sand', 'Stroymag', 'Nonmetallic materials', 100, 0, 26000),
(22, 'steel bar', 'AQUAdom', 'Metal products', 0, 0, 15000),
(23, 'clay', 'Stroymag', 'Nonmetallic materials', 109, 0, 26000),
(24, 'pipe', 'AQUAdom', 'Metal products', 100, 0, 15000),
(25, 'rubble', 'Stroymag', 'Nonmetallic materials', 100, 0, 26000),
(26, 'styrofoam', 'ALABAMACom', 'repair materials', 200, 0, 32400),
(27, 'brick', 'Bulldozzer Group', 'Wall materials', 10000, 0, 70000);

-- --------------------------------------------------------

--
-- Table structure for table `materials_to_delivery`
--

CREATE TABLE `materials_to_delivery` (
  `number` int(10) NOT NULL,
  `name` varchar(55) DEFAULT NULL,
  `manufacturer` varchar(55) DEFAULT NULL,
  `quantity` int(10) DEFAULT NULL,
  `cost` int(10) NOT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `materials_to_delivery`
--

INSERT INTO `materials_to_delivery` (`number`, `name`, `manufacturer`, `quantity`, `cost`, `date`) VALUES
(6, 'Edged board (0.03*0.06*6)', 'Forest Russia', 22, 275, '2021-12-28'),
(10, 'penoplex', 'Teppa Wood Comp', 50, 1000, '2021-12-28'),
(11, 'cement', 'AQUAdom', 10, 5300, '2021-12-28'),
(12, 'Gypsum board K (12.5mm)', 'Knauf', 15, 460, '2021-12-27'),
(13, 'styrofoam', 'ALABAMACom', 2, 32400, '2021-12-29'),
(14, 'Rail (0.03*0.05*6)', 'Forest Russia', 25, 230, '2021-12-27'),
(15, 'steel bar', 'AQUAdom', 5, 15000, '2021-12-29'),
(16, 'clay', 'Stroymag', 1, 2000, '2021-12-26');

-- --------------------------------------------------------

--
-- Table structure for table `objects_constructing`
--

CREATE TABLE `objects_constructing` (
  `number` int(11) NOT NULL,
  `objects` varchar(40) NOT NULL,
  `company` varchar(255) NOT NULL,
  `square (m2)` int(10) UNSIGNED NOT NULL,
  `address` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `objects_constructing`
--

INSERT INTO `objects_constructing` (`number`, `objects`, `company`, `square (m2)`, `address`) VALUES
(1, 'EL Klasi', 'CupStroy', 2560, 'str. Isakeev 2'),
(3, 'Evergreen', 'EliteHouse', 1710, 'str. Erkindik 52'),
(4, 'Imperial', 'Ihlas', 1260, 'Sverdlovsky district'),
(5, 'Keremet', 'EmarkStroy', 2890, 'str. Lev Tolstoy 112/5'),
(6, 'Kok-Jar deLuxe', 'BishkekKurulush', 3880, 'Oktyabrsky district');

-- --------------------------------------------------------

--
-- Table structure for table `ordered_list`
--

CREATE TABLE `ordered_list` (
  `id` int(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `quantity` int(255) NOT NULL,
  `cost` int(255) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ordered_list`
--

INSERT INTO `ordered_list` (`id`, `name`, `quantity`, `cost`, `date`) VALUES
(2, 'Edged board (0.03*0.06*6)', 10, 275, '2021-12-20'),
(3, 'Gypsum board K (12.5mm)', 4, 460, '2021-12-23'),
(8, 'Balk (0.10*0.10*6)', 1, 1530, '2021-12-27'),
(9, 'Balk (0.10*0.10*6)', 1, 1530, '2021-12-27'),
(10, 'Gypsum board K (9.5mm)', 2, 400, '2021-12-27'),
(11, 'Edged board (0.05*0.18*6)', 3, 1377, '2021-12-27'),
(13, 'Balk (0.10*0.10*6)', 5, 1530, '2021-12-29'),
(14, 'Balk (0.10*0.10*6)', 2, 1530, '2021-12-30'),
(15, 'Balk (0.10*0.10*6)', 5, 1530, '2021-12-30'),
(16, 'Edged board (0.05*0.18*6)', 10, 1377, '2021-12-30');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `account_type` varchar(40) NOT NULL,
  `firstname` varchar(40) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`account_type`, `firstname`, `lastname`, `login`, `password`) VALUES
('Builder', '-', '-', 'build', '1234'),
('Builder', 'Artur', 'Rustamov', 'vilka', 'vilka007'),
('Builder', 'Cholpon', 'Sultanova', 'Chopa123', '1234chopa'),
('Builder', 'Daniyar', 'Moldobasarov', 'Donny123', '1234donny'),
('Builder', 'qwerty', 'qwerty', 'qwerty', 'qwerty'),
('Builder', 'username', 'lastname', 'username', 'hellothere'),
('Supplier', '', '', 'supp', '12345'),
('Supplier', 'Azamat', 'Satybaldiev', 'Aza123', '1234aza'),
('Supplier', 'Donny', 'Moslem', 'Donny', '221101');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `delivered_materials`
--
ALTER TABLE `delivered_materials`
  ADD PRIMARY KEY (`number`),
  ADD UNIQUE KEY `name_of_material_UNIQUE` (`name`);

--
-- Indexes for table `finished_objects`
--
ALTER TABLE `finished_objects`
  ADD PRIMARY KEY (`number`);

--
-- Indexes for table `materials`
--
ALTER TABLE `materials`
  ADD PRIMARY KEY (`number`),
  ADD UNIQUE KEY `name_of_material_UNIQUE` (`name`);

--
-- Indexes for table `materials_to_delivery`
--
ALTER TABLE `materials_to_delivery`
  ADD PRIMARY KEY (`number`);

--
-- Indexes for table `objects_constructing`
--
ALTER TABLE `objects_constructing`
  ADD PRIMARY KEY (`number`),
  ADD UNIQUE KEY `Name_of_areas_UNIQUE` (`objects`);

--
-- Indexes for table `ordered_list`
--
ALTER TABLE `ordered_list`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`account_type`,`firstname`,`lastname`,`login`,`password`),
  ADD UNIQUE KEY `firstname_UNIQUE` (`firstname`),
  ADD UNIQUE KEY `lastname_UNIQUE` (`lastname`),
  ADD UNIQUE KEY `login_UNIQUE` (`login`),
  ADD UNIQUE KEY `password_UNIQUE` (`password`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `delivered_materials`
--
ALTER TABLE `delivered_materials`
  MODIFY `number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `finished_objects`
--
ALTER TABLE `finished_objects`
  MODIFY `number` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `materials`
--
ALTER TABLE `materials`
  MODIFY `number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `materials_to_delivery`
--
ALTER TABLE `materials_to_delivery`
  MODIFY `number` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `objects_constructing`
--
ALTER TABLE `objects_constructing`
  MODIFY `number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `ordered_list`
--
ALTER TABLE `ordered_list`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ordered_list`
--
ALTER TABLE `ordered_list`
  ADD CONSTRAINT `ordered_list_ibfk_1` FOREIGN KEY (`id`) REFERENCES `materials` (`number`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
