-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: mvc2
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `codCliente` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`codCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'mari','111.111.111-11','ss'),(2,'Marcus Vinicius Veloso Duarte','111.111.111-11','ss'),(4,'Pedro','339.982.928-92','stella.lamounier@gmail.com'),(5,'yyy','666.666.666-66','6yy'),(7,'rui','111.111.111-11','1'),(8,'mari','222.222.222-22','s'),(9,'Maria Carolina Costa','898.989.898-99','maria.souza@yahoo.com.br'),(12,'mary','111.111.111-11','ss'),(13,'mary','111.111.111-11','ss'),(14,'mary','111.111.111-11','ss'),(15,'mary','111.111.111-11','ss'),(16,'mary','111.111.111-11','ss'),(17,'mary','111.111.111-11','ss'),(19,'mary','111.111.111-11','ss'),(20,'mary','111.111.111-11','ss'),(21,'mary','111.111.111-11','ss'),(22,'mary','111.111.111-11','ss'),(23,'mary','111.111.111-11','ss'),(24,'mary','111.111.111-11','ss'),(25,'mary','111.111.111-11','ss'),(26,'mary','111.111.111-11','ss'),(27,'mary','111.111.111-11','ss'),(28,'wwwww','111.111.111-11','ss'),(29,'wwwww','111.111.111-11','ss'),(30,'wwwww','111.111.111-11','ss'),(31,'wwwww','111.111.111-11','ss'),(32,'wwwww','111.111.111-11','ss'),(33,'wwwww','u','ss'),(34,'Carlos Duartet','111.555.111-33','carlosd.bambui@yahoo.com.br'),(35,'Carlos Duartet','111.555.111-33','carlosd.bambui@yahoo.com.br'),(36,'Carlos Duartet','111.555.111-33','carlosd.bambui@yahoo.com.br'),(37,'Carlos Duartet','111.555.111-33','carlosd.bambui@yahoo.com.br'),(38,'Carlos Duartet','111.555.111-33','carlosd.bambui@yahoo.com.br'),(39,'Carlos Duartet','111.555.111-33','carlosd.bambui@yahoo.com.br'),(40,'Carlos Duartet','111.555.111-33','carlosd.bambui@yahoo.com.br'),(47,'qqq','222.222.222-22','2'),(48,'Heron Soares Silva','898.986.737-76','heron.bambui@yahoo.com.br'),(52,'jose silva','889.898.989-99','jsm@gmail.com'),(54,'Ulisses Silva','736.736.099-99','ulisses.silva@yahoo.com.br'),(56,'ss','222.222.222-22','2w');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-27 11:28:12
