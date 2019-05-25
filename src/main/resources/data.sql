/*DROP DATABASE IF EXISTS book;

CREATE DATABASE book;

USE book;
*/

DROP TABLE IF EXISTS book;

CREATE TABLE book (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  author VARCHAR(250) NOT NULL
);

INSERT INTO book (title, author) VALUES
  ('Harry Potter and the Philosopher s Stone', 'J.K. Rowling'),
  ('The Hobbit', 'J.R.R. Tolkien'),
  ('Eragon', 'Christopher Paolini')
