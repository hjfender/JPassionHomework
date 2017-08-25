DROP DATABASE IF EXISTS myowndb;

CREATE DATABASE myowndb;

DROP TABLE IF EXISTS myown_students;

CREATE TABLE myown_students (
	student_id SMALLINT AUTO_INCREMENT,
	name VARCHAR(40) UNIQUE,
	school VARCHAR(40),
	age INT,
	PRIMARY KEY (student_id),
	INDEX (school)
) ENGINE = InnoDB;

INSERT INTO myown_students (name, school, age)
VALUES
('Raghu', 'Macalester College', 22),
('Spencer', 'Macalester College', 22),
('Kaitlin', 'University of Minnesota', 21),
('Sophia', 'St. Olaf College', 22),
('Max', 'University of Wisconsin, Milwaukee', 23),
('Ada', 'Merrill Middle Schooe', 13),
('Olin', 'Bates College', 22);

SELECT AVG(age), MIN(age), MAX(age) FROM myown_students INTO @average_age, @min_age, @max_age;

SELECT @average_age, @min_age, @max_age;

SELECT school, COUNT(student_id) AS number_of_students FROM myown_students WHERE age > 17 GROUP BY school HAVING school LIKE '%College%';