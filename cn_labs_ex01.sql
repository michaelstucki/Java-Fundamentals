CREATE DATABASE college;
USE college;

CREATE TABLE students (
	id INT AUTO_INCREMENT,
    first_name VARCHAR(40),
    last_name VARCHAR(40),
    age INT,
    PRIMARY KEY (id)
);

CREATE TABLE teachers (
	id INT AUTO_INCREMENT,
    first_name VARCHAR(40),
    last_name VARCHAR(40),
    subject VARCHAR(40),
    PRIMARY KEY (id)
);

CREATE TABLE teachers_students (
	id INT AUTO_INCREMENT,
    student_id INT,
    teacher_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (student_id) REFERENCES students (id),
    FOREIGN KEY (teacher_id) REFERENCES teachers (id)
);

INSERT INTO students (first_name, last_name, age) VALUES ("George", "Bailey", 18);
INSERT INTO students (first_name, last_name, age) VALUES ("Gomer", "Pyle", 22);
INSERT INTO students (first_name, last_name, age) VALUES ("Lois", "Lane", 20);
INSERT INTO students (first_name, last_name, age) VALUES ("Kate", "Shrew", 19);
INSERT INTO students (first_name, last_name, age) VALUES ("Johnny", "Law", 16);

INSERT INTO teachers (first_name, last_name, subject) VALUES ("Ms.", "Crabtree", "Latin");
INSERT INTO teachers (first_name, last_name, subject) VALUES ("CS", "Lewis", "Literature");
INSERT INTO teachers (first_name, last_name, subject) VALUES ("Ned", "Brainard", "Mathematics");
INSERT INTO teachers (first_name, last_name, subject) VALUES ("Lionel", "Potter", "Economics");
INSERT INTO teachers (first_name, last_name, subject) VALUES ("Horatio", "Alder", "History");

INSERT INTO teachers_students (student_id, teacher_id) VALUES (1, 2);
INSERT INTO teachers_students (student_id, teacher_id) VALUES (1, 4);
INSERT INTO teachers_students (student_id, teacher_id) VALUES (1, 1);
INSERT INTO teachers_students (student_id, teacher_id) VALUES (2, 3);
INSERT INTO teachers_students (student_id, teacher_id) VALUES (2, 1);
INSERT INTO teachers_students (student_id, teacher_id) VALUES (2, 4);
INSERT INTO teachers_students (student_id, teacher_id) VALUES (3, 1);
INSERT INTO teachers_students (student_id, teacher_id) VALUES (3, 2);
INSERT INTO teachers_students (student_id, teacher_id) VALUES (3, 3);
INSERT INTO teachers_students (student_id, teacher_id) VALUES (4, 3);
INSERT INTO teachers_students (student_id, teacher_id) VALUES (4, 2);
INSERT INTO teachers_students (student_id, teacher_id) VALUES (5, 1);
