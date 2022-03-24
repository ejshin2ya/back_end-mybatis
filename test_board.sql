CREATE DATABASE test_board DEFAULT CHARACTER SET utf8mb4;

USE test_board;

CREATE TABLE board (
	id INT AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    age int not null,
    deptno int not null,
    deptname varchar(30) not null,
    location varchar(30) not null,
    PRIMARY KEY (id)
);

INSERT INTO board (name, age, deptno, deptname, location)
VALUES ('신은정', 31, 1,'ssafy', '서울'),
('가나다', 25, 3,'ssafit', '대전'),
('라마바', 28, 5,'ssaedu', '부울경');

 
SELECT * FROM board;