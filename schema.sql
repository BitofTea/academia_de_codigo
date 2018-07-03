DROP DATABASE IF EXISTS library;
CREATE DATABASE library;
USE library;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
     id INTEGER(9) NOT NULL AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(40) NOT NULL,
     phone INTEGER(9) NOT NULL,
     age INTEGER(3) NOT NULL
);

DROP TABLE IF EXISTS publishers;
CREATE TABLE publishers (
     publisher_id INTEGER PRIMARY KEY AUTO_INCREMENT,
     name VARCHAR(60) NOT NULL
);

DROP TABLE IF EXISTS authors;
CREATE TABLE authors (
     author_id INTEGER NOT NULL AUTO_INCREMENT,
     name VARCHAR(40) NOT NULL,
     publisher_id INTEGER NOT NULL,

PRIMARY KEY (author_id),
FOREIGN KEY (publisher_id) REFERENCES publishers(publisher_id)
);

DROP TABLE IF EXISTS books;
CREATE TABLE books (
     isbn INTEGER(9),
     title VARCHAR(60) NOT NULL,
     author_id INTEGER NOT NULL,
     publisher_id INTEGER NOT NULL,
     data DATE NOT NULL,

PRIMARY KEY (isbn),
FOREIGN KEY (author_id) REFERENCES authors(author_id)
);

DROP TABLE IF EXISTS loans;
CREATE TABLE loans (
     id INTEGER AUTO_INCREMENT,
     user_id INTEGER(9) NOT NULL,
     isbn INTEGER NOT NULL,
     start_day DATE NOT NULL,
     end_day DATE NOT NULL,

PRIMARY KEY (id),
FOREIGN KEY (user_id) REFERENCES users(id),
FOREIGN KEY (isbn) REFERENCES books(isbn)
);
