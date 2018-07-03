drop database if exists books_loan;
create database books_loan;
use books_loan;

drop table if exists books;
create table books (
	ISBN INT(9) not NULL AUTO_INCREMENT,
	title VARCHAR(40),
	publish_year INT(4),
	author_id INT(9),
	publisher_id INT(9),
	PRIMARY KEY (ISBN)
);

drop table if exists users;
create table users (
	id INT(9) not NULL AUTO_INCREMENT,
	name VARCHAR(40) not NULL,
	address VARCHAR(40) not NULL,
	PRIMARY KEY (id)
);


drop table if exists publishers;
create table publishers (
	id INT(9) AUTO_INCREMENT,
	name VARCHAR(40) not NULL,
	PRIMARY KEY (id)
);

drop table if exists authors;
create table authors (
	id INT(9) AUTO_INCREMENT,
	name VARCHAR(40) not NULL,
	PRIMARY KEY (id)
);

ALTER TABLE books ADD FOREIGN KEY (author_id) REFERENCES authors(id);
ALTER TABLE books ADD FOREIGN KEY (publisher_id) REFERENCES publishers(id);

drop table if exists loans;
create table loans (
	id INT(9) not NULL AUTO_INCREMENT,
	date DATE,
	user_id INT(9),
	book_id INT(9),
	is_out BIT,
	PRIMARY KEY (id),
	FOREIGN KEY (user_id) REFERENCES users(id),
	FOREIGN KEY (book_id) REFERENCES books(ISBN)
);

INSERT INTO authors VALUES
(1,'Lev Tolstoy'),
(2,'José Maria de Eça de Queiroz'),
(3,'PornHub'),
(4,'Janet Valade');

INSERT INTO publishers VALUES
(1,'The Contemporary'),
(2,'Serrano'),
(3,'Pornhub'),
(4,'Wiley Publishing, Inc');

INSERT INTO users VALUES
(NULL,'Francisco', 'Praia da Vitória'),
(NULL,'Duarte', 'Porto Judeu'),
(NULL,'Pedrinho', 'Santa Barbara');

INSERT INTO books VALUES
(1, 'Childhood', 1852, 1, 1),
(2, 'Pornhub For dummies',2018, 3,3),
(3, 'O Primo Basílio',1878, 2, 2),
(4, 'PHP & Mysql for Dummies', 2002,4,4);

INSERT into loans VALUES
(NULL, '2018-01-01', 1, 1, 1),
(NULL, '2017-03-04', 2, 3, 1),
(NULL, '2017-07-14', 3, 2, 1),
(NULL, '2017-12-30', 1, 2, 1),
(NULL, '2018-01-22', 1, 2, 0),
(NULL, '2018-02-04', 1, 2, 0);

select loans.id, loans.date, users.name, books.title from ((loans INNER JOIN users on loans.user_id = users.id) INNER JOIN books on loans.book_id = books.isbn);
