CREATE DATABASE  IF NOT EXISTS `controle` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `controle`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: controle
-- ------------------------------------------------------
-- Server version	5.5.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cadeiras`
--

DROP TABLE IF EXISTS `cadeiras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cadeiras` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `id_enrolador` int(10) DEFAULT NULL,
  `mes_enrolacao` varchar(8) DEFAULT NULL,
  `data_enrolacao` varchar(8) DEFAULT NULL,
  `quinzena` varchar(1) DEFAULT NULL,
  `grande` int(4) DEFAULT NULL,
  `pequena` int(4) DEFAULT NULL,
  `paradinha` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_enrolador` (`id_enrolador`),
  CONSTRAINT `cadeiras_ibfk_1` FOREIGN KEY (`id_enrolador`) REFERENCES `enrolador` (`id_enrolador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cadeiras`
--

LOCK TABLES `cadeiras` WRITE;
/*!40000 ALTER TABLE `cadeiras` DISABLE KEYS */;
/*!40000 ALTER TABLE `cadeiras` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-01-07  9:58:11
