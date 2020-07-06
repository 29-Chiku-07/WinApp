-- MySQL dump 10.13  Distrib 5.5.50, for Win32 (x86)
--
-- Host: localhost    Database: lib
-- ------------------------------------------------------
-- Server version	5.5.50

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
-- Table structure for table `acc`
--

DROP TABLE IF EXISTS `acc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `acc` (
  `name` varchar(20) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acc`
--

LOCK TABLES `acc` WRITE;
/*!40000 ALTER TABLE `acc` DISABLE KEYS */;
INSERT INTO `acc` VALUES ('Ashish','ak297','12345','9898163197'),('Animesh','anny','56789','1234567890'),('at','atul','123','5676898789');
/*!40000 ALTER TABLE `acc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill_items`
--

DROP TABLE IF EXISTS `bill_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill_items` (
  `item_code` int(10) NOT NULL,
  `type` varchar(20) DEFAULT NULL,
  `brandname` varchar(30) DEFAULT NULL,
  `item_name` varchar(40) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  PRIMARY KEY (`item_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_items`
--

LOCK TABLES `bill_items` WRITE;
/*!40000 ALTER TABLE `bill_items` DISABLE KEYS */;
INSERT INTO `bill_items` VALUES (0,'null','null','null',0);
/*!40000 ALTER TABLE `bill_items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `product` varchar(25) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES ('TV','Rs. 11,990'),('HEADPHONE','Rs. 2,680'),('TV','Rs. 11,990'),('CAMERA','Rs. 2,83,990'),('HEELS','Rs. 490'),('SALWAR SUIT','Rs. 618');
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `data`
--

DROP TABLE IF EXISTS `data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data` (
  `accountinfo` int(10) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `amount` varchar(20) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`accountinfo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data`
--

LOCK TABLES `data` WRITE;
/*!40000 ALTER TABLE `data` DISABLE KEYS */;
/*!40000 ALTER TABLE `data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lib`
--

DROP TABLE IF EXISTS `lib`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lib` (
  `acc_no` int(5) NOT NULL,
  `btitle` varchar(30) NOT NULL,
  `author1` varchar(30) DEFAULT NULL,
  `author2` varchar(30) DEFAULT NULL,
  `pub_id` int(4) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `pdate` date DEFAULT NULL,
  `pages` int(5) DEFAULT NULL,
  `edition` int(4) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  PRIMARY KEY (`acc_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lib`
--

LOCK TABLES `lib` WRITE;
/*!40000 ALTER TABLE `lib` DISABLE KEYS */;
INSERT INTO `lib` VALUES (1,'fantasy','Amisha','',2,200,'2017-02-03',50,3,'Y');
/*!40000 ALTER TABLE `lib` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mainlogin`
--

DROP TABLE IF EXISTS `mainlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mainlogin` (
  `userid` varchar(25) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mainlogin`
--

LOCK TABLES `mainlogin` WRITE;
/*!40000 ALTER TABLE `mainlogin` DISABLE KEYS */;
INSERT INTO `mainlogin` VALUES ('ASHISH KUMAR','272529');
/*!40000 ALTER TABLE `mainlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `memb_no` int(6) NOT NULL,
  `memb_name` varchar(30) DEFAULT NULL,
  `memb_add` varchar(30) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  `medate` date DEFAULT NULL,
  `mfee` double(8,2) DEFAULT NULL,
  `mem_status` char(1) DEFAULT NULL,
  `mem_issue` char(1) DEFAULT NULL,
  `memb_phone` int(12) DEFAULT NULL,
  PRIMARY KEY (`memb_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'Ashish','Sec 2-A','2016-03-03','2016-03-03',2000.00,'Y','N',678798675);
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `membermnhkl`
--

DROP TABLE IF EXISTS `membermnhkl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `membermnhkl` (
  `memb_no` int(6) NOT NULL,
  `memb_name` varchar(30) DEFAULT NULL,
  `memb_add` varchar(30) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  `medate` date DEFAULT NULL,
  `mfee` double(8,2) DEFAULT NULL,
  `mem_status` char(1) DEFAULT NULL,
  `mem_issue` char(1) DEFAULT NULL,
  PRIMARY KEY (`memb_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `membermnhkl`
--

LOCK TABLES `membermnhkl` WRITE;
/*!40000 ALTER TABLE `membermnhkl` DISABLE KEYS */;
/*!40000 ALTER TABLE `membermnhkl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mens_wear`
--

DROP TABLE IF EXISTS `mens_wear`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mens_wear` (
  `item_code` int(10) NOT NULL,
  `type` varchar(20) DEFAULT NULL,
  `brandname` varchar(30) DEFAULT NULL,
  `item_name` varchar(40) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  PRIMARY KEY (`item_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mens_wear`
--

LOCK TABLES `mens_wear` WRITE;
/*!40000 ALTER TABLE `mens_wear` DISABLE KEYS */;
/*!40000 ALTER TABLE `mens_wear` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `missue`
--

DROP TABLE IF EXISTS `missue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `missue` (
  `acc_no` int(5) DEFAULT NULL,
  `memb_no` int(5) DEFAULT NULL,
  `idate` date DEFAULT NULL,
  `rdate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `missue`
--

LOCK TABLES `missue` WRITE;
/*!40000 ALTER TABLE `missue` DISABLE KEYS */;
/*!40000 ALTER TABLE `missue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `missueb`
--

DROP TABLE IF EXISTS `missueb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `missueb` (
  `acc_no` int(5) DEFAULT NULL,
  `memb_no` int(5) DEFAULT NULL,
  `idate` date DEFAULT NULL,
  `rdate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `missueb`
--

LOCK TABLES `missueb` WRITE;
/*!40000 ALTER TABLE `missueb` DISABLE KEYS */;
/*!40000 ALTER TABLE `missueb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publ`
--

DROP TABLE IF EXISTS `publ`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `publ` (
  `pub_id` int(4) NOT NULL,
  `pub_name` varchar(30) DEFAULT NULL,
  `pub_address` varchar(40) DEFAULT NULL,
  `pub_phone1` varchar(12) DEFAULT NULL,
  `pub_phone2` varchar(12) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  PRIMARY KEY (`pub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publ`
--

LOCK TABLES `publ` WRITE;
/*!40000 ALTER TABLE `publ` DISABLE KEYS */;
/*!40000 ALTER TABLE `publ` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `publisher` (
  `pub_id` int(4) NOT NULL,
  `pub_name` varchar(30) DEFAULT NULL,
  `pub_address` varchar(40) DEFAULT NULL,
  `pub_phone1` varchar(12) DEFAULT NULL,
  `pub_phone2` varchar(12) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  PRIMARY KEY (`pub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
INSERT INTO `publisher` VALUES (1,'animesh','Sec 1-B','67786578','9834259987','Y'),(2,'ASHISH','Sec 2-A','979867879','898767899','Y');
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase` (
  `mobile` varchar(20) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL,
  `product` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase`
--

LOCK TABLES `purchase` WRITE;
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
INSERT INTO `purchase` VALUES ('8798786798','sec 2-A','Jharkhand','Item 1','2000',NULL),('fdsde','sfr','esfse','HEADPHONE','3456',NULL),('wfe','dfsdf','dsfr','TV','4556',NULL),('78678987','dfcdsf','fdsvf','HEADPHONE','3344','ak297'),('78678987','dfcdsf','fdsvf','HEADPHONE','3344','ak297'),('4543','gffdg','dgfbvfzd','LAPTOP','Rs. 1,28,000','ak297'),('8798679867','sec 2-A','bihar','CAMERA','Rs. 2,83,990','ak297');
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sign_in`
--

DROP TABLE IF EXISTS `sign_in`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sign_in` (
  `name` varchar(30) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sign_in`
--

LOCK TABLES `sign_in` WRITE;
/*!40000 ALTER TABLE `sign_in` DISABLE KEYS */;
INSERT INTO `sign_in` VALUES ('ashish','ak297','12345','9898163197');
/*!40000 ALTER TABLE `sign_in` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sign_up`
--

DROP TABLE IF EXISTS `sign_up`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sign_up` (
  `user_no` int(10) NOT NULL,
  `first_name` varchar(30) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `usertype` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sign_up`
--

LOCK TABLES `sign_up` WRITE;
/*!40000 ALTER TABLE `sign_up` DISABLE KEYS */;
INSERT INTO `sign_up` VALUES (1,'Ashish','kumar','ak297@gmail.com','12345','Free'),(2,'ashish','kumar','ak297','12345','Premium');
/*!40000 ALTER TABLE `sign_up` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tissue`
--

DROP TABLE IF EXISTS `tissue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tissue` (
  `acc_no` int(5) DEFAULT NULL,
  `memb_no` int(5) DEFAULT NULL,
  `idate` date DEFAULT NULL,
  `rdate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tissue`
--

LOCK TABLES `tissue` WRITE;
/*!40000 ALTER TABLE `tissue` DISABLE KEYS */;
/*!40000 ALTER TABLE `tissue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tissuehkkl`
--

DROP TABLE IF EXISTS `tissuehkkl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tissuehkkl` (
  `acc_no` int(5) DEFAULT NULL,
  `memb_no` int(5) DEFAULT NULL,
  `idate` date DEFAULT NULL,
  `rdate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tissuehkkl`
--

LOCK TABLES `tissuehkkl` WRITE;
/*!40000 ALTER TABLE `tissuehkkl` DISABLE KEYS */;
/*!40000 ALTER TABLE `tissuehkkl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wallet`
--

DROP TABLE IF EXISTS `wallet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wallet` (
  `price` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wallet`
--

LOCK TABLES `wallet` WRITE;
/*!40000 ALTER TABLE `wallet` DISABLE KEYS */;
INSERT INTO `wallet` VALUES (0),(5678);
/*!40000 ALTER TABLE `wallet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `women_wear`
--

DROP TABLE IF EXISTS `women_wear`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `women_wear` (
  `item_code` int(10) NOT NULL,
  `type` varchar(20) DEFAULT NULL,
  `brandname` varchar(30) DEFAULT NULL,
  `item_name` varchar(40) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  PRIMARY KEY (`item_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `women_wear`
--

LOCK TABLES `women_wear` WRITE;
/*!40000 ALTER TABLE `women_wear` DISABLE KEYS */;
/*!40000 ALTER TABLE `women_wear` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-17 15:44:36
