CREATE TABLE IF NOT EXISTS `TB_USER`
(
  `US_ID` INT AUTO_INCREMENT,
  `US_USERNAME` VARCHAR(25) NOT NULL,
  `US_PASSWORD` VARCHAR(25) NOT NULL,
  PRIMARY KEY(`US_ID`)
);