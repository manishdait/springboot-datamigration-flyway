CREATE SEQUENCE alien_sequence;

CREATE TABLE alien (
  id BIGINT PRIMARY KEY DEFAULT nextval('alien_sequence'),
  username VARCHAR(255) UNIQUE NOT NULL
);

INSERT INTO alien (username) 
VALUES ('Peter Griffin'),
('Brain Grfiin'),
('Glane Quagmire');
