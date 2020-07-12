DROP TABLE IF EXISTS JOB;
 
CREATE TABLE JOB (
  id LONG AUTO_INCREMENT  PRIMARY KEY,
  module VARCHAR(250) NOT NULL,
  status VARCHAR(250) NOT NULL,
  business_date DATE NOT NULL
);

--insert into JOB (module, status, business_date) values
--('PUBLISHER','COMPLETED', TO_DATE('31-12-2019', 'DD-MM-YYYY'));