CREATE DATABASE IF NOT EXISTS `TEST_DB`;
USE `TEST_DB`;

CREATE TABLE IF NOT EXISTS `ARTICLES` (
	`ARTICLE_ID` int(5) NOT NULL AUTO_INCREMENT,
    `TITLE` varchar(200) NOT NULL,
    `CATEGORY` varchar(100) NOT NULL,
    PRIMARY KEY (`ARTICLE_ID`)
) ENGINE=InnoDB auto_increment=10 default charset=utf8;

CREATE TABLE `USERS` (
	`ID` int(5) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `EMAIL` varchar(100),
    `NAME` varchar(100));
    
INSERT INTO `ARTICLES` (`ARTICLE_ID`, `TITLE`, `CATEGORY`) VALUES
(1, 'Java Concurrency', 'Java'),
(2, 'Hibernate HQL', 'Hibernate'),
(3, 'Spring MVC with Hibernate', 'Spring');
    
INSERT INTO `USERS` (`EMAIL`, `NAME`) VALUES
('tony.smith@hotmail.com', 'Tony Smith'),
('ann.whiter@whiter.com', 'Ann Whiter');
