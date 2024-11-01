CREATE SEQUENCE tech_sequence;

CREATE TABLE tech (
  id BIGINT PRIMARY KEY DEFAULT nextval('tech_sequence'),
  tech VARCHAR(50) NOT NULL UNIQUE
);

INSERT INTO tech (tech) VALUES 
('Blockchain'),
('Java'),
('Springboot'),
('Angular');

ALTER TABLE alien 
ADD tech_id BIGINT;

ALTER TABLE alien 
ADD CONSTRAINT fk_tech_id FOREIGN KEY (tech_id) REFERENCES tech(id);

UPDATE alien
SET tech_id=2
WHERE username='Peter Griffin';

UPDATE alien
SET tech_id=1
WHERE username='Brain Grifin';

UPDATE alien
SET tech_id=3
WHERE username='Glane Quagmire';

UPDATE alien
SET tech_id=1
WHERE username='Joe Swanson';
