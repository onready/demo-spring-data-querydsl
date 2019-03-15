CREATE TABLE person (
  id        BIGINT PRIMARY KEY IDENTITY,
  firstname VARCHAR(50),
  lastname  VARCHAR(50),
  age       INTEGER
);

INSERT INTO person
(firstname, lastname, age)
VALUES
  ('jorge', 'rodriguez', 64),
  ('richard', 'cuan', 41),
  ('beatriz', 'perez', 64),
  ('sergio', 'chimuelo', 20);