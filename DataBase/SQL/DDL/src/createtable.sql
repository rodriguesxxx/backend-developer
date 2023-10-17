-- DDL - CREATE
CREATE TABLE People(
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    username VARCHAR(50) NOT NULL UNIQUE,
    age int(3)
);