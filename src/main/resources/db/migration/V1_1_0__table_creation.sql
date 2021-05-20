
CREATE TABLE inventory (
  art_id  VARCHAR(1) PRIMARY KEY,
  name VARCHAR(20) NOT NULL,
  stock VARCHAR(5) NOT NULL
);

INSERT INTO inventory (art_id, name, stock) VALUES
  ('1', 'leg', '12'),
  ('2', 'screw', '17'),
  ('3', 'seat', '2'),
  ('4', 'table top', '1');
  
  CREATE TABLE product (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(1000) NOT NULL
); 
 
 INSERT INTO product (name) VALUES
  ('Dining Chair'),
  ('Dinning Table');
  
  
 CREATE TABLE contain_articles (
 id INT AUTO_INCREMENT  PRIMARY KEY,
  art_id  VARCHAR(1) ,
  amount_of VARCHAR(20) NOT NULL,
  name VARCHAR(1000) NOT NULL,
  foreign key (art_id) references inventory(art_id),
  foreign key (name) references product(name)
);

INSERT INTO contain_articles (art_id, amount_of,name) VALUES
  ('1',  '4','Dining Chair'),
  ('2', '8','Dining Chair'),
  ('4', '1','Dining Chair'),
  ('1',  '4','Dinning Table'),
  ('2', '8','Dinning Table'),
  ('4', '1','Dinning Table');
  
 
  