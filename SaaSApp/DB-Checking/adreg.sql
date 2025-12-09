-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2025 at 11:06 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cloud`
--

-- --------------------------------------------------------

--
-- Table structure for table `adreg`
--

CREATE TABLE `adreg` (
  `una` varchar(20) NOT NULL,
  `psw` varchar(20) NOT NULL,
  `admin` varchar(20) NOT NULL,
  `pin` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `adreg`
--

INSERT INTO `adreg` (`una`, `psw`, `admin`, `pin`) VALUES
('Rahini', '122', 'Admin1', '200'),
('Priyanka', '546', 'Admin1', '33'),
('saranya', '78as', 'Admin1', '34'),
('muthu', '5h6h', 'Admin1', '56'),
('muthulekshmi', 'hfyt', 'Admin2', '87'),
('radha', 'gj6565', 'Admin1', '55'),
('sowmiya', '87h', 'Admin3', '12'),
('kohila', '8yuh', 'Admin3', '907');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
