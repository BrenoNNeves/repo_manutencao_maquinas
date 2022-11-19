CREATE DATABASE  IF NOT EXISTS `manutencao` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `manutencao`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: manutencao
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `idOrder` int NOT NULL AUTO_INCREMENT,
  `descriptionOrder` longtext NOT NULL,
  `beginDateOrder` datetime NOT NULL,
  `finishedOrder` bit(1) NOT NULL,
  `mantainerId` int NOT NULL,
  `machineId` int NOT NULL,
  PRIMARY KEY (`idOrder`),
  UNIQUE KEY `idOrder_UNIQUE` (`idOrder`),
  KEY `mantainerId_idx` (`mantainerId`),
  KEY `machineId_idx` (`machineId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (3,'ordem 1','2021-02-02 00:00:00',_binary '',1,2),(4,'ordem','2021-02-02 00:00:00',_binary '',1,2),(5,'ordem mil','2021-02-02 00:00:00',_binary '',1,2),(6,'ordem 2','2021-02-02 00:00:00',_binary '\0',4,3),(7,'Descrição 1','2022-11-10 00:00:00',_binary '\0',1,2),(8,'Descrição 2','2022-10-11 00:00:00',_binary '\0',4,5),(9,'Máquina com defeito','2021-10-20 00:00:00',_binary '\0',4,2),(10,'Description','2022-01-09 00:00:00',_binary '',1,2),(11,'Máquina com defeito no motor','2022-10-08 00:00:00',_binary '\0',4,2),(12,'Problema na prensa','2021-10-10 00:00:00',_binary '\0',1,2),(13,'Torno não está ligando - finalizada','2023-06-11 00:00:00',_binary '\0',1,5),(14,'Broca quebrada','2021-10-12 00:00:00',_binary '\0',4,3),(15,'Torno não está ligando corretamente - Finalizada','2021-12-01 00:00:00',_binary '',4,5),(16,'manutenção','2022-01-02 00:00:00',_binary '\0',7,5),(17,'ordem 4','2022-02-02 00:00:00',_binary '\0',1,2),(18,'dasdasdas','3233-09-01 00:00:00',_binary '\0',1,2),(19,'dasda','2223-10-22 00:00:00',_binary '\0',1,2),(20,'aaaaaaaaaaaaa','2223-10-22 00:00:00',_binary '\0',1,14);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-13 14:26:27
