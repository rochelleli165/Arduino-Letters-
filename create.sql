/*  create.sql 
    Rochelle Li 
    MissionEats database */
    
USE missioneats;

/* drop the table */

DROP TABLE IF EXISTS  student;



/* Query 1 */

CREATE TABLE student(
    student_id INT AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    age INT,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    driver_status INT,
    CONSTRAINT student_pk PRIMARY KEY (student_id),
    CONSTRAINT student_email_uk UNIQUE (email)

);


/* Query 2 */

INSERT INTO student (first_name, last_name, age, email, password) VALUES('jack','smith', 14,'jsmith@school.edu', '123xyz');
INSERT INTO student (first_name, last_name, age, email, password) VALUES('noah', 'audry', 15,'naudry@school.edu', '123xyz');
INSERT INTO student (first_name, last_name, age, email, password, driver_status) VALUES('rhonda','taylor', 16,'rtaylor@school.edu', '123xyz', 1);
INSERT INTO student (first_name, last_name, age, email, password, driver_status) VALUES('robert','ben', 17,'rben@school.edu', '123xyz', 1);
INSERT INTO student (first_name, last_name, age, email, password) VALUES('jeanne','ben', 18,'jben@school.edu', '123xyz');
INSERT INTO student (first_name, last_name, age, email, password) VALUES('mills','carmen', 15,'mcarmen@school.edu', '123xyz');


/* Query 3 */

DESCRIBE student;

/* Query 4 */

SELECT * FROM student;
