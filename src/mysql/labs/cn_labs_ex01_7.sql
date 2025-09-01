-- Ex. 01.7

USE college;

-- a. select all students
SELECT * FROM students;

-- b. select all teachers who teach math
SELECT * FROM teachers
WHERE subject LIKE "Math%";

-- c. use a join query to select all students with a certain teacher
SELECT s.first_name, s.last_name, t.first_name, t.last_name, t.id
FROM students s
JOIN teachers_students ts
ON s.id = ts.student_id
JOIN teachers t
ON t.id = ts.teacher_id
WHERE t.first_name = "Lionel" AND t.last_name = "Potter";

-- d. use a join query to select all students taking a certain subject
SELECT s.first_name, s.last_name, t.first_name, t.last_name, t.subject
FROM students s
JOIN teachers_students ts
ON s.id = ts.student_id
JOIN teachers t 
ON t.id = ts.teacher_id
WHERE t.subject = "Latin";

-- e. update a record in the student table
UPDATE students
SET age = 20
WHERE id = 1;

-- f. add a record to the teacher table
INSERT INTO teachers (first_name, last_name, subject) VALUES ("Desiderius", "Erasmus", "Ancient Greek");
