-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2022 at 08:42 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblreservation`
--

CREATE TABLE `tblreservation` (
  `reservation_id` int(11) NOT NULL,
  `password` int(11) NOT NULL DEFAULT 1276,
  `room_id` int(11) DEFAULT NULL,
  `customer_name` varchar(20) NOT NULL,
  `customer_nic` varchar(20) NOT NULL,
  `customer_telno` int(11) NOT NULL,
  `customer_email` varchar(30) NOT NULL,
  `check_in` date DEFAULT NULL,
  `check_out` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblreservation`
--

INSERT INTO `tblreservation` (`reservation_id`, `password`, `room_id`, `customer_name`, `customer_nic`, `customer_telno`, `customer_email`, `check_in`, `check_out`) VALUES
(1, 1276, 101, 'ranjan1.0', '20897656', 986753409, 'ranjan10@gmail.com', '2022-01-14', '2022-01-15'),
(34, 1276, 110, 'Bhathisha43', '1232156', 9890876, 'bhathishamahiman@gmail.com', '2022-01-12', '2022-01-19'),
(459, 1276, 206, 'Bhathisha', '1232156', 98908, 'bathisha09@gmail.com', '2022-01-14', '2022-01-25'),
(460, 1276, 205, 'Bhathisha45', '12321', 678, 'ranjan20@gmail.com', '2022-01-13', '2022-01-25'),
(461, 1276, 109, 'Bhathisha', '123210', 9890876, 'ranjan20@gmail.com', '2022-01-06', '2022-01-18');

-- --------------------------------------------------------

--
-- Table structure for table `tblroom`
--

CREATE TABLE `tblroom` (
  `room_id` int(11) NOT NULL,
  `person` int(11) NOT NULL,
  `main_type` varchar(20) NOT NULL,
  `sub_type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tblroom`
--

INSERT INTO `tblroom` (`room_id`, `person`, `main_type`, `sub_type`) VALUES
(101, 2, 'normal', 'standed'),
(102, 2, 'normal', 'standed'),
(103, 2, 'normal', 'standed'),
(104, 2, 'normal', 'standed'),
(105, 2, 'normal', 'standed'),
(106, 2, 'normal', 'standed'),
(107, 2, 'normal', 'standed'),
(108, 2, 'normal', 'standed'),
(109, 2, 'normal', 'standed'),
(110, 2, 'normal', 'standed'),
(201, 2, 'normal', 'luxury'),
(202, 2, 'normal', 'luxury'),
(203, 2, 'normal', 'luxury'),
(204, 2, 'normal', 'luxury'),
(205, 2, 'normal', 'luxury'),
(206, 2, 'normal', 'luxury'),
(301, 4, 'large', 'standed'),
(302, 4, 'large', 'standed'),
(303, 4, 'large', 'standed'),
(304, 4, 'large', 'standed'),
(305, 4, 'large', 'standed'),
(306, 4, 'large', 'standed'),
(307, 4, 'large', 'standed'),
(401, 4, 'large', 'luxury'),
(402, 4, 'large', 'luxury'),
(403, 4, 'large', 'luxury'),
(404, 4, 'large', 'luxury'),
(501, 6, 'xlarge', 'standed'),
(502, 6, 'xlarge', 'standed'),
(503, 6, 'xlarge', 'standed'),
(504, 6, 'xlarge', 'standed'),
(601, 6, 'xlarge', 'luxury'),
(602, 6, 'xlarge', 'luxury');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblreservation`
--
ALTER TABLE `tblreservation`
  ADD PRIMARY KEY (`reservation_id`),
  ADD UNIQUE KEY `reservation_id` (`reservation_id`);

--
-- Indexes for table `tblroom`
--
ALTER TABLE `tblroom`
  ADD PRIMARY KEY (`room_id`),
  ADD UNIQUE KEY `room_id` (`room_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tblreservation`
--
ALTER TABLE `tblreservation`
  MODIFY `reservation_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=462;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
