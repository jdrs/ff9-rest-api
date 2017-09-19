-- MySQL dump 10.13  Distrib 5.7.19, for Linux (x86_64)
--
-- Host: localhost    Database: ff9db
-- ------------------------------------------------------
-- Server version	5.7.19-0ubuntu0.16.04.1

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
-- Table structure for table `ch_basic`
--

DROP TABLE IF EXISTS `ch_basic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ch_basic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `occupation` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ch_basic`
--

LOCK TABLES `ch_basic` WRITE;
/*!40000 ALTER TABLE `ch_basic` DISABLE KEYS */;
INSERT INTO `ch_basic` VALUES (1,'Zidane Tribal',16,'Thief'),(2,'Adelbert Steiner',33,'Captain');
/*!40000 ALTER TABLE `ch_basic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ch_home`
--

DROP TABLE IF EXISTS `ch_home`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ch_home` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ch_id` int(11) NOT NULL,
  `loc_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ch_id` (`ch_id`),
  KEY `loc_id` (`loc_id`),
  CONSTRAINT `ch_home_ibfk_1` FOREIGN KEY (`ch_id`) REFERENCES `ch_basic` (`id`),
  CONSTRAINT `ch_home_ibfk_2` FOREIGN KEY (`loc_id`) REFERENCES `loc_basic` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ch_home`
--

LOCK TABLES `ch_home` WRITE;
/*!40000 ALTER TABLE `ch_home` DISABLE KEYS */;
INSERT INTO `ch_home` VALUES (1,1,2),(2,2,1);
/*!40000 ALTER TABLE `ch_home` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loc_basic`
--

DROP TABLE IF EXISTS `loc_basic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loc_basic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `type` varchar(50) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loc_basic`
--

LOCK TABLES `loc_basic` WRITE;
/*!40000 ALTER TABLE `loc_basic` DISABLE KEYS */;
INSERT INTO `loc_basic` VALUES (1,'Alexandria Castle','Castle','Alexandria'),(2,'Lindblum','City','Mist Continent'),(3,'Mist Continent','Continent','Gaia'),(4,'Alexandria','City','Mist Continent'),(5,'Gaia','Planet',NULL);
/*!40000 ALTER TABLE `loc_basic` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-19 20:38:32
