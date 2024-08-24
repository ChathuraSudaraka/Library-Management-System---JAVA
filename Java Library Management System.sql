-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.32 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for library-management-system
CREATE DATABASE IF NOT EXISTS `library-management-system` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `library-management-system`;

-- Dumping structure for table library-management-system.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '0',
  `email` varchar(50) NOT NULL DEFAULT '0',
  `nic` varchar(13) NOT NULL DEFAULT '0',
  `password` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table library-management-system.admin: ~1 rows (approximately)
INSERT INTO `admin` (`id`, `name`, `email`, `nic`, `password`) VALUES
	(1, 'chathura', 'chathura@gmail.com', '200505903342', '123');

-- Dumping structure for table library-management-system.authors
CREATE TABLE IF NOT EXISTS `authors` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table library-management-system.authors: ~2 rows (approximately)
INSERT INTO `authors` (`id`, `name`) VALUES
	(55, 'Jane Austen'),
	(56, 'Great Expectations');

-- Dumping structure for table library-management-system.books
CREATE TABLE IF NOT EXISTS `books` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titles_id` int NOT NULL,
  `authors_id` int NOT NULL,
  `IsAvailable` tinyint NOT NULL DEFAULT '0',
  `IsDeleted` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `fk_books_titles1_idx` (`titles_id`),
  KEY `fk_books_authors1_idx` (`authors_id`),
  CONSTRAINT `fk_books_authors1` FOREIGN KEY (`authors_id`) REFERENCES `authors` (`id`),
  CONSTRAINT `fk_books_titles1` FOREIGN KEY (`titles_id`) REFERENCES `titles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table library-management-system.books: ~2 rows (approximately)
INSERT INTO `books` (`id`, `titles_id`, `authors_id`, `IsAvailable`, `IsDeleted`) VALUES
	(50, 58, 55, 3, 0),
	(51, 59, 56, 3, 0);

-- Dumping structure for table library-management-system.borrowed_books
CREATE TABLE IF NOT EXISTS `borrowed_books` (
  `id` int NOT NULL AUTO_INCREMENT,
  `borrowed_date` date NOT NULL,
  `is_returned` tinyint NOT NULL,
  `users_id` int NOT NULL,
  `books_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_borrowed_books_users1_idx` (`users_id`),
  KEY `fk_borrowed_books_books1_idx` (`books_id`),
  CONSTRAINT `fk_borrowed_books_books1` FOREIGN KEY (`books_id`) REFERENCES `books` (`id`),
  CONSTRAINT `fk_borrowed_books_users1` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table library-management-system.borrowed_books: ~0 rows (approximately)
INSERT INTO `borrowed_books` (`id`, `borrowed_date`, `is_returned`, `users_id`, `books_id`) VALUES
	(40, '2024-08-21', 0, 31, 51);

-- Dumping structure for table library-management-system.cities
CREATE TABLE IF NOT EXISTS `cities` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table library-management-system.cities: ~6 rows (approximately)
INSERT INTO `cities` (`id`, `name`) VALUES
	(1, 'Kandy'),
	(2, 'Colombo'),
	(3, 'kiribathgoda'),
	(4, 'Mabima'),
	(5, 'gampha'),
	(6, 'heiyanthuduwa');

-- Dumping structure for table library-management-system.genders
CREATE TABLE IF NOT EXISTS `genders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table library-management-system.genders: ~2 rows (approximately)
INSERT INTO `genders` (`id`, `type`) VALUES
	(1, 'Male'),
	(2, 'Female');

-- Dumping structure for table library-management-system.roles
CREATE TABLE IF NOT EXISTS `roles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table library-management-system.roles: ~2 rows (approximately)
INSERT INTO `roles` (`id`, `type`) VALUES
	(1, 'student'),
	(2, 'lecturer');

-- Dumping structure for table library-management-system.titles
CREATE TABLE IF NOT EXISTS `titles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `copies` int NOT NULL DEFAULT '0',
  `borrowings` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table library-management-system.titles: ~2 rows (approximately)
INSERT INTO `titles` (`id`, `title`, `copies`, `borrowings`) VALUES
	(58, 'Pride and Prejudice', 3, 0),
	(59, 'Charles Dickens', 5, 0);

-- Dumping structure for table library-management-system.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `email` varchar(45) NOT NULL,
  `nic` varchar(13) NOT NULL DEFAULT '0',
  `password` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `mobile` varchar(10) NOT NULL,
  `address` varchar(100) NOT NULL,
  `role_id` int NOT NULL,
  `gender_id` int NOT NULL,
  `city_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_users_roles_idx` (`role_id`),
  KEY `fk_users_genders1_idx` (`gender_id`),
  KEY `fk_users_cities1_idx` (`city_id`),
  CONSTRAINT `fk_users_cities1` FOREIGN KEY (`city_id`) REFERENCES `cities` (`id`),
  CONSTRAINT `fk_users_genders1` FOREIGN KEY (`gender_id`) REFERENCES `genders` (`id`),
  CONSTRAINT `fk_users_roles` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table library-management-system.users: ~0 rows (approximately)
INSERT INTO `users` (`id`, `name`, `email`, `nic`, `password`, `mobile`, `address`, `role_id`, `gender_id`, `city_id`) VALUES
	(31, 'chathura', 'sudaraka@gmail.com', '200505903342', NULL, '0112456785', 'srllljj', 1, 1, 2);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
