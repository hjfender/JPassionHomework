DROP PROCEDURE IF EXISTS my_stored_procedure;

DELIMITER $$

CREATE PROCEDURE my_stored_procedure(IN length_threshold INT)
BEGIN
	DECLARE n VARCHAR(45);
	
	DECLARE name_reader CURSOR FOR
	SELECT last_name FROM mydb.person;
	
	DECLARE EXIT HANDLER FOR 1329
	BEGIN
		SELECT long_name.name AS 'Long Names', short_name.name AS 'Short Names' FROM long_name, short_name;
		SELECT 'Ending procedure' AS Message;
	END;

	SELECT 'Beginning procedure for threshold of ' AS Message, length_threshold;

	DROP TABLE IF EXISTS long_name;
	DROP TABLE IF EXISTS short_name;
	
	CREATE TABLE long_name (name VARCHAR(45));
	CREATE TABLE short_name (name VARCHAR(45));
	
	OPEN name_reader;
	
	read_name: LOOP
		FETCH name_reader INTO n;
		IF LENGTH(n) > length_threshold THEN
			INSERT INTO long_name (name) VALUES (n);
		ELSE
			INSERT INTO short_name (name) VALUES (n);
		END IF;
	END LOOP read_name; 
	
	CLOSE name_reader;
END $$

DELIMITER ;

CALL my_stored_procedure(4);

