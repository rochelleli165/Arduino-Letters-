/*  create.sql 
    Rochelle Li 
    MissionEats database */
    
USE missioneats;

DROP TABLE IF EXISTS driver;

create table driver(
	student_id INT,
    full_name VARCHAR(50) NOT NULL,
    slots_open INT,
    location VARCHAR(50),
    commission DECIMAL(10, 2) NOT NULL,
    rating DECIMAL(10, 1),
    CONSTRAINT fk_student_id FOREIGN KEY (student_id) 
    REFERENCES student(student_id)
);

INSERT INTO driver VALUES(1, 'jack smith', 2, 'T4', 5.00, 2.5);
INSERT INTO driver VALUES(2, 'noah audry', 2, 'Starbucks', 2.00, 4.5);

select * from driver;