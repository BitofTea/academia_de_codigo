INSERT INTO users(id,name,phone,age ) VALUES (1,'João',91000001,25);
INSERT INTO users(id,name,phone,age ) VALUES (2,'Maria',91000020,31);
INSERT INTO users(id,name,phone,age ) VALUES (3,'Bárbara',91000030,26);

INSERT INTO publishers(publisher_id,name) VALUES (1,'Cotovia');
INSERT INTO publishers(publisher_id,name) VALUES (2,'Verbo');
INSERT INTO publishers(publisher_id,name) VALUES (3,'Circulo de Leitores');

INSERT INTO authors(author_id,name,publisher_id) VALUES (1,'Saramago',1);
INSERT INTO authors(author_id,name,publisher_id) VALUES (2,'Camões',2);
INSERT INTO authors(author_id,name,publisher_id) VALUES (3,'Miguel Torga',3);

INSERT INTO books(isbn,title,author_id,publisher_id,data) VALUES (102030,'Memorial do Convento',1,1,'1985-01-01');
INSERT INTO books(isbn,title,author_id,publisher_id,data) VALUES (201030,'Lusíadas',2,2,'1542-10-20');
INSERT INTO books(isbn,title,author_id,publisher_id,data) VALUES (103020,'Os Bichos',3,3,'1963-1-3');

INSERT INTO loans(id,user_id,isbn,start_day,end_day) VALUES (1,1,102030,'2018-7-2','2018-7-22');
INSERT INTO loans(id,user_id,isbn,start_day,end_day) VALUES (2,2,201030,'2018-8-10','2018-8-20');
INSERT INTO loans(id,user_id,isbn,start_day,end_day) VALUES (3,3,103020,'2018-7-12','2018-7-22');
