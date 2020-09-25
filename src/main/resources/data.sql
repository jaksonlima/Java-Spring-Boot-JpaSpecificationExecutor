DROP TABLE IF EXISTS lm_user;
 
CREATE TABLE lm_user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR,
  idade NUMBER ,
  dhInclusao TIMESTAMP
);
 
INSERT INTO lm_user (nome, idade, dhInclusao) VALUES
  ('Aliko', 21, parsedatetime('17-09-2012 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS')),
  ('Bill', 22, parsedatetime('17-09-2012 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS')),
  ('Folrunsho', 23, parsedatetime('17-09-2012 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'));
