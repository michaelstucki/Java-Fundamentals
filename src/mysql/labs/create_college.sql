CREATE DATABASE  IF NOT EXISTS `college`;
USE `college`;
--
-- Table structure for table `courses`
--
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `units` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
--
-- Dumping data for table `courses`
--
LOCK TABLES `courses` WRITE;
INSERT INTO `courses` VALUES (1,'computer science',3),(2,'literature',3),(3,'design',3);
UNLOCK TABLES;
--
-- Table structure for table `students`
--
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
--
-- Dumping data for table `students`
--
LOCK TABLES `students` WRITE;
INSERT INTO `students` VALUES (1,'example1','user1','user1@user1email.com'),
(2,'example2','user2','user2@user2email.com'),
(3,'example3','user3','user3@user3email.com'),
(4,'example4','user4','user4@user4email.com');
UNLOCK TABLES;
--
-- Table structure for table `students_courses`
--
DROP TABLE IF EXISTS `students_courses`;
CREATE TABLE `students_courses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `student_id_idx` (`student_id`),
  KEY `course_id_idx` (`course_id`),
  CONSTRAINT `course_id` FOREIGN KEY (`course_id`) REFERENCES `courses` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `student_id` FOREIGN KEY (`student_id`) REFERENCES `students` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
--
-- Dumping data for table `students_courses`
--
LOCK TABLES `students_courses` WRITE;
INSERT INTO `students_courses` VALUES (1,1,1),(2,1,3),(3,2,3),(4,3,1),(5,3,2),(6,3,3),(7,4,1),(8,2,3);
UNLOCK TABLES;
