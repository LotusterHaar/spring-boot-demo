DROP TABLE IF EXISTS books;

CREATE TABLE books (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  author VARCHAR(250) NOT NULL,
);

INSERT INTO books (title, author) VALUES
  ('Harry Potter and the Philosopher s Stone', 'J.K. Rowling'),
  ('The Hobbit', 'J.R.R. Tolkien'),
  ('Eragon', 'Christopher Paolini');
