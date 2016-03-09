/*
SQLyog - Free MySQL GUI v5.17
Host - 5.5.1-m2-community : Database - test
*********************************************************************
Server version : 5.5.1-m2-community
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `test`;

USE `test`;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `bookslist` */

DROP TABLE IF EXISTS `bookslist`;

CREATE TABLE `bookslist` (
  `Book_Code` varchar(50) NOT NULL,
  `Book_Name` varchar(50) DEFAULT NULL,
  `Author` varchar(50) DEFAULT NULL,
  `Description` varchar(50) DEFAULT NULL,
  `Stock` int(5) DEFAULT NULL,
  `Branch` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Book_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bookslist` */

insert into `bookslist` (`Book_Code`,`Book_Name`,`Author`,`Description`,`Stock`,`Branch`) values ('101','DBMS','Korth','For data base',100,'C.S');
insert into `bookslist` (`Book_Code`,`Book_Name`,`Author`,`Description`,`Stock`,`Branch`) values ('102','Knowlege of Life','Akash Bindal','google',99,'E.C');
insert into `bookslist` (`Book_Code`,`Book_Name`,`Author`,`Description`,`Stock`,`Branch`) values ('103','CGMM','Baker','For graphics',999,'C.S');
insert into `bookslist` (`Book_Code`,`Book_Name`,`Author`,`Description`,`Stock`,`Branch`) values ('104','ADC','dfsdfvssdvs','Analog and digital communication',1228,'M.B.A');
insert into `bookslist` (`Book_Code`,`Book_Name`,`Author`,`Description`,`Stock`,`Branch`) values ('105','dsfsdfsd','fsdf','sdvsdfv',123,'M.E');
insert into `bookslist` (`Book_Code`,`Book_Name`,`Author`,`Description`,`Stock`,`Branch`) values ('106','vsvsv','sdvsdvs','dsvsdvs',1234,'I.T');
insert into `bookslist` (`Book_Code`,`Book_Name`,`Author`,`Description`,`Stock`,`Branch`) values ('107','fadsf','asfasf','afasf',10,'M.Tech');
insert into `bookslist` (`Book_Code`,`Book_Name`,`Author`,`Description`,`Stock`,`Branch`) values ('108','Tales Of Pirates','Mayank','Gamming Guide',1000,'C.S');
insert into `bookslist` (`Book_Code`,`Book_Name`,`Author`,`Description`,`Stock`,`Branch`) values ('109','XXX','Bindal','XXX',10,'M.Tech');
insert into `bookslist` (`Book_Code`,`Book_Name`,`Author`,`Description`,`Stock`,`Branch`) values ('110','The AUDACITY of Hope','donno','w.e',100,'B.Pharma');

/*Table structure for table `issued` */

DROP TABLE IF EXISTS `issued`;

CREATE TABLE `issued` (
  `Book_Code` varchar(50) DEFAULT NULL,
  `Book_Name` varchar(50) DEFAULT NULL,
  `Stud_ID` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `issued` */

/*Table structure for table `ontest` */

DROP TABLE IF EXISTS `ontest`;

CREATE TABLE `ontest` (
  `srno` int(5) NOT NULL,
  `oues` varchar(1000) DEFAULT NULL,
  `1optn` varchar(10) DEFAULT NULL,
  `2optn` varchar(10) DEFAULT NULL,
  `3optn` varchar(10) DEFAULT NULL,
  `4optn` varchar(10) DEFAULT NULL,
  `ans` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`srno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ontest` */

insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (1,'int z,x=5,y=-10,a=4,b=2; What number will z in the sample code above contain? ','5','6','10','11','10');
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (2,'With every use of a memory allocation function, what function should be used to release allocated memory which is no longer needed?','unalloc()','dropmem() ','dealloc()','free()','free()');
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (3,'Code:void *ptr; myStruct myArray[10]; ptr = myArray; Which of the following is the correct way to increment the variable \"ptr\"?  ','ptr = ptr ','++(int*)pt','ptr = ptr ','increment(','ptr = ptr ');
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (4,'Code: char* myFunc (char *ptr){ ptr += 3; return (ptr); }int main(){char *x, *y; x = \"HELLO\"; y = myFunc (x); printf (\"y = %s \\n\", y); return 0;} What will print when the sample code above is executed?','y = HELLO','y = ELLO','y = LLO','y = LO [An','y = LO [An');
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (5,'\"My salary was increased by 15%!\" Select the statement which will EXACTLY reproduce the line of text above.','printf(\"\\\"','printf(\"My','printf(\"My','printf(\"\\\"','printf(\"\\\"');
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (6,'What is a difference between a declaration and a definition of a variable?','Both can o','There is n','A definiti','A declarat','A declarat');
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (7,'int testarray[3][2][2] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; \r\nWhat value does testarray[2][1][0] in the sample code above contain? ','3','5','7','11','11');
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (8,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (9,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (10,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (11,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (12,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (13,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (14,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (15,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (16,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (17,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (18,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (19,NULL,NULL,NULL,NULL,NULL,NULL);
insert into `ontest` (`srno`,`oues`,`1optn`,`2optn`,`3optn`,`4optn`,`ans`) values (20,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `ques1` */

DROP TABLE IF EXISTS `ques1`;

CREATE TABLE `ques1` (
  `que` tinytext,
  `1` varchar(20) DEFAULT NULL,
  `2` varchar(20) DEFAULT NULL,
  `3` varchar(20) DEFAULT NULL,
  `4` varchar(20) DEFAULT NULL,
  `ans` int(5) DEFAULT NULL,
  `quesno` int(2) NOT NULL,
  PRIMARY KEY (`quesno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ques1` */

insert into `ques1` (`que`,`1`,`2`,`3`,`4`,`ans`,`quesno`) values ('What motto is inscribed in Devanagari script on State Emblem of India?',' Mera Bharat Mahan','Vanede Mataram','Satyamev Jayate',' Sare Jahan Se Sccha',3,1);
insert into `ques1` (`que`,`1`,`2`,`3`,`4`,`ans`,`quesno`) values ('Which of these words is used for a person under the control of another?','joker','Madari','kathputli','CHaplloos',3,2);
insert into `ques1` (`que`,`1`,`2`,`3`,`4`,`ans`,`quesno`) values ('According to beliefs, which of these Gods reside on Mount Kailash?',' Indra',' Shiva',' Vishnu',' Brahma',2,3);
insert into `ques1` (`que`,`1`,`2`,`3`,`4`,`ans`,`quesno`) values ('Which of these sporting events was held in \r\n Beijing in 2008 and will be held in London in 2012?',' T20 World Cup','Commonwealth Games','Summer Olympic Games','FIFA World Cup',3,4);
insert into `ques1` (`que`,`1`,`2`,`3`,`4`,`ans`,`quesno`) values (' According to the song from ‘Housefull 2\', \r\nwhere is Anarkali going after leaving “Salim Ki Gali”?','Casino','Shopping','Cinema','Disco',4,5);
insert into `ques1` (`que`,`1`,`2`,`3`,`4`,`ans`,`quesno`) values ('Which of these hindi idioms means ‘falling in love’','Aankh Pherna','Aankh Tarerna',' Aankh Lagana','Aankh Churan',3,6);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `roll` varchar(20) NOT NULL,
  `pwd` varchar(50) DEFAULT NULL,
  `nm` varchar(100) DEFAULT NULL,
  `class` varchar(20) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `token` int(5) DEFAULT NULL,
  PRIMARY KEY (`roll`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student` */

insert into `student` (`roll`,`pwd`,`nm`,`class`,`status`,`token`) values ('0830cs101001','evil','Ami','3yr',0,4);
insert into `student` (`roll`,`pwd`,`nm`,`class`,`status`,`token`) values ('0830cs101002','evil','Avinash','3yr',1,0);
insert into `student` (`roll`,`pwd`,`nm`,`class`,`status`,`token`) values ('0830cs101003','evil','Mayank','3yr',0,4);
insert into `student` (`roll`,`pwd`,`nm`,`class`,`status`,`token`) values ('0830cs101004','evil','Ankit','3yr',0,4);
insert into `student` (`roll`,`pwd`,`nm`,`class`,`status`,`token`) values ('0830cs101005','evil','Shivam','3yr',1,4);
insert into `student` (`roll`,`pwd`,`nm`,`class`,`status`,`token`) values ('0830cs101006','evil','Akash','3yr',0,4);
insert into `student` (`roll`,`pwd`,`nm`,`class`,`status`,`token`) values ('0830cs101053','123','lovekesh','3rd',1,4);
insert into `student` (`roll`,`pwd`,`nm`,`class`,`status`,`token`) values ('0830cs101057','123456789','love','3rd',0,4);
insert into `student` (`roll`,`pwd`,`nm`,`class`,`status`,`token`) values ('0830xxx','Nayan>>>','Nayan','1Yr',0,4);
insert into `student` (`roll`,`pwd`,`nm`,`class`,`status`,`token`) values ('555','','','',0,4);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uid` varchar(20) NOT NULL,
  `upass` varchar(20) DEFAULT NULL,
  `post` varchar(20) DEFAULT NULL,
  `adrs` tinytext,
  `sex` varchar(6) DEFAULT NULL,
  `unm` varchar(15) DEFAULT NULL,
  `mark` int(3) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert into `user` (`uid`,`upass`,`post`,`adrs`,`sex`,`unm`,`mark`) values ('13','123','admin','indore','male','aman',NULL);
insert into `user` (`uid`,`upass`,`post`,`adrs`,`sex`,`unm`,`mark`) values ('29','123','student','mhow','male','chetan',5);
insert into `user` (`uid`,`upass`,`post`,`adrs`,`sex`,`unm`,`mark`) values ('3','123','student','mhow','male','abhinandra',NULL);
insert into `user` (`uid`,`upass`,`post`,`adrs`,`sex`,`unm`,`mark`) values ('5','123','student','indore	','male','manoj',5);
insert into `user` (`uid`,`upass`,`post`,`adrs`,`sex`,`unm`,`mark`) values ('53','123','admin','289 indore','male','lovekesh',NULL);
insert into `user` (`uid`,`upass`,`post`,`adrs`,`sex`,`unm`,`mark`) values ('58','123','student','harda','male','MAYUR',5);
insert into `user` (`uid`,`upass`,`post`,`adrs`,`sex`,`unm`,`mark`) values ('6','123','student','indore','male','alpesh',6);
insert into `user` (`uid`,`upass`,`post`,`adrs`,`sex`,`unm`,`mark`) values ('ayush','ayush','admin','h','male','ayush',NULL);

/*Table structure for table `usertable` */

DROP TABLE IF EXISTS `usertable`;

CREATE TABLE `usertable` (
  `Uid` varchar(15) NOT NULL,
  `Uname` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `post` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Uid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usertable` */

insert into `usertable` (`Uid`,`Uname`,`password`,`post`) values ('0830cs101001','Aman','evil','student');
insert into `usertable` (`Uid`,`Uname`,`password`,`post`) values ('0830cs101002','Avinash','evil','student');
insert into `usertable` (`Uid`,`Uname`,`password`,`post`) values ('0830cs101003','Mayank','evil','student');
insert into `usertable` (`Uid`,`Uname`,`password`,`post`) values ('0830cs101004','Ankit','evil','student');
insert into `usertable` (`Uid`,`Uname`,`password`,`post`) values ('0830cs101005','Shivam','evil','student');
insert into `usertable` (`Uid`,`Uname`,`password`,`post`) values ('0830cs101006','Akash','evil','student');
insert into `usertable` (`Uid`,`Uname`,`password`,`post`) values ('0830cs101053','lovekesh','123','student');
insert into `usertable` (`Uid`,`Uname`,`password`,`post`) values ('0830cs101057','Mayank','evil','Admin');
insert into `usertable` (`Uid`,`Uname`,`password`,`post`) values ('0830xxx','Nayan','Nayan>>>','student');
insert into `usertable` (`Uid`,`Uname`,`password`,`post`) values ('555','','','student');
insert into `usertable` (`Uid`,`Uname`,`password`,`post`) values ('aman123','Aman','abc','admin');

/*Table structure for table `ut` */

DROP TABLE IF EXISTS `ut`;

CREATE TABLE `ut` (
  `uid` varchar(50) NOT NULL,
  `upass` varchar(50) DEFAULT NULL,
  `post` varchar(10) DEFAULT NULL,
  `unm` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ut` */

insert into `ut` (`uid`,`upass`,`post`,`unm`) values ('aman123','evil','User','Aman');
insert into `ut` (`uid`,`upass`,`post`,`unm`) values ('avinash123','evil','Operator','Avinash');
insert into `ut` (`uid`,`upass`,`post`,`unm`) values ('evilxxx','evil','Admin','Mayank');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
