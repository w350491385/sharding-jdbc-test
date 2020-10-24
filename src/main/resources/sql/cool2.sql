/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.6.25 : Database - cool2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cool2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cool2`;

/*Table structure for table `user_0` */

DROP TABLE IF EXISTS `user_0`;

CREATE TABLE `user_0` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=utf8;

/*Table structure for table `user_1` */

DROP TABLE IF EXISTS `user_1`;

CREATE TABLE `user_1` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=150 DEFAULT CHARSET=utf8;

/*Table structure for table `user_2` */

DROP TABLE IF EXISTS `user_2`;

CREATE TABLE `user_2` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8;

/*Table structure for table `user_3` */

DROP TABLE IF EXISTS `user_3`;

CREATE TABLE `user_3` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=148 DEFAULT CHARSET=utf8;

/*Table structure for table `user_4` */

DROP TABLE IF EXISTS `user_4`;

CREATE TABLE `user_4` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `username` varchar(12) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx-username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=148 DEFAULT CHARSET=utf8;

/*Table structure for table `user_info_0` */

DROP TABLE IF EXISTS `user_info_0`;

CREATE TABLE `user_info_0` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(12) NOT NULL COMMENT '用户主见',
  `address` varchar(100) DEFAULT NULL,
  `mobile` char(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=353121856896630806 DEFAULT CHARSET=utf8;

/*Table structure for table `user_info_1` */

DROP TABLE IF EXISTS `user_info_1`;

CREATE TABLE `user_info_1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(12) NOT NULL COMMENT '用户主见',
  `address` varchar(100) DEFAULT NULL,
  `mobile` char(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=353121854963056662 DEFAULT CHARSET=utf8;

/*Table structure for table `user_info_2` */

DROP TABLE IF EXISTS `user_info_2`;

CREATE TABLE `user_info_2` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(12) NOT NULL COMMENT '用户主见',
  `address` varchar(100) DEFAULT NULL,
  `mobile` char(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=353121851813134358 DEFAULT CHARSET=utf8;

/*Table structure for table `user_info_3` */

DROP TABLE IF EXISTS `user_info_3`;

CREATE TABLE `user_info_3` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(12) NOT NULL COMMENT '用户主见',
  `address` varchar(100) DEFAULT NULL,
  `mobile` char(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=353121858666627094 DEFAULT CHARSET=utf8;

/*Table structure for table `user_info_4` */

DROP TABLE IF EXISTS `user_info_4`;

CREATE TABLE `user_info_4` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(12) NOT NULL COMMENT '用户主见',
  `address` varchar(100) DEFAULT NULL,
  `mobile` char(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=353121858138144790 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
