--liquibase formatted sql
--changeset tomkqwe:2
INSERT INTO actor(date_of_birth,id,name,surname) VALUES
('1969-11-04',1,'Matthew David','McConaughey'),
('1943-08-17',2,'Robert','De Niro'),
('1956-07-09',3,'Thomas Jeffrey','Hanks');

INSERT INTO director(date_of_birth,id,name,surname) VALUES
('1942-11-17',1,'Martin','Scorsese'),
('1963-03-21',2,'Quentin','Tarantino'),
('1946-12-18',3,'Steven','Spielberg');

INSERT INTO film(id,release_date,country,name,genres) VALUES
(1,'2002-12-16','United States','Catch Me If You Can','{COMEDY,DRAMA,THRILLER}' );

INSERT INTO reviews (id,description,grade) VALUES
(1,'very good film yeeah!','NINE');

INSERT INTO user_info (date_of_birth,id,email,login,name,surname) VALUES
('1999-01-01',1,'test@test.com','test','Tom','Tomkin');



