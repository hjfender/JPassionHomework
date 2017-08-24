DROP DATABASE IF EXISTS myowndb;

CREATE DATABASE myowndb;

CREATE TABLE myown_animals(
	animal_id SMALLINT PRIMARY KEY,
	name VARCHAR(40),
	age INT
);

INSERT INTO myown_animals (animal_id, name, age)
VALUES
(1, 'dog', 5),
(2, 'cat', 12),
(3, 'pig', 2),
(4, 'cow', 3),
(5, 'horse', 15);

UPDATE myown_animals SET name = UPPER(name);

SELECT AVG(age), MAX(age), MIN(age) FROM myown_animals;

DELETE FROM myown_animals WHERE age < 10;