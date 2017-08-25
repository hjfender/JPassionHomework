DROP DATABASE IF EXISTS mydb;

CREATE DATABASE mydb;

USE mydb;

DROP TABLE IF EXISTS student;

CREATE TABLE student (
	id INT NOT NULL AUTO_INCREMENT,
	name varchar(255) NOT NULL,
	PRIMARY KEY (id)
) ENGINE = InnoDB;

DROP TABLE IF EXISTS teacher;

CREATE TABLE teacher (
	id INT NOT NULL AUTO_INCREMENT,
	name varchar(255) NOT NULL,
	PRIMARY KEY (id)
) ENGINE = InnoDB;

DROP TABLE IF EXISTS student_teacher_relation;

CREATE TABLE student_teacher_relation (
	student_id INT NOT NULL,
	teacher_id INT NOT NULL,
	PRIMARY KEY (student_id, teacher_id),
	FOREIGN KEY (student_id) REFERENCES student (id),
	FOREIGN KEY (teacher_id) REFERENCES teacher (id)
) ENGINE = InnoDB;

INSERT INTO student (name)
VALUES
('Joe'),
('Danny'),
('Haley'),
('Lena'),
('Ian'),
('Christine');

INSERT INTO teacher (name)
VALUES
('Marcos'),
('Mary'),
('Daniel');

INSERT INTO student_teacher_relation (student_id, teacher_id)
VALUES
(1,1),
(1,2),
(2,1),
(2,2),
(3,3),
(4,1),
(4,2),
(4,3),
(5,1),
(5,2),
(6,1),
(6,2);

SELECT student.name AS 'students taught by Marcos'
FROM student, student_teacher_relation
WHERE student.id = student_teacher_relation.student_id
AND student_teacher_relation.teacher_id = 1;

SELECT teacher.name AS 'teachers teaching Joe'
FROM teacher, student_teacher_relation
WHERE teacher.id = student_teacher_relation.teacher_id
AND student_teacher_relation.student_id = 1;

SELECT teacher.name AS 'teacher', COUNT(student.name) AS 'number of students'
FROM student, teacher, student_teacher_relation
WHERE student.id = student_teacher_relation.student_id
AND teacher.id = student_teacher_relation.teacher_id
GROUP BY teacher.name;

SELECT student.name AS 'student', COUNT(teacher.name) AS 'number of teachers'
FROM student, teacher, student_teacher_relation
WHERE teacher.id = student_teacher_relation.teacher_id
AND student.id = student_teacher_relation.student_id
GROUP BY student.name;