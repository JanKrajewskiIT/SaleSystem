DROP ROLE IF EXISTS admin;
CREATE ROLE admin WITH ENCRYPTED PASSWORD 'admin';
ALTER USER admin LOGIN;
ALTER USER admin CREATEDB; 
ALTER USER admin CREATEUSER;

DROP DATABASE IF EXISTS was04_headoffice;
CREATE DATABASE was04_headoffice WITH ENCODING 'UTF8';
GRANT ALL PRIVILEGES ON DATABASE was04_headoffice TO admin;
ALTER DATABASE was04_headoffice OWNER TO admin;

DROP DATABASE IF EXISTS was04_headoffice_test;
CREATE DATABASE was04_headoffice_test WITH ENCODING 'UTF8';
GRANT ALL PRIVILEGES ON DATABASE was04_headoffice_test TO admin;
ALTER DATABASE was04_headoffice_test OWNER TO admin;




DROP DATABASE IF EXISTS was04_department_wh;
CREATE DATABASE was04_department_wh WITH ENCODING 'UTF8';
GRANT ALL PRIVILEGES ON DATABASE was04_department_wh TO admin;
ALTER DATABASE was04_department_wh OWNER TO admin;

DROP DATABASE IF EXISTS was04_department_wh_test;
CREATE DATABASE was04_department_wh_test WITH ENCODING 'UTF8';
GRANT ALL PRIVILEGES ON DATABASE was04_department_wh_test TO admin;
ALTER DATABASE was04_department_wh_test OWNER TO admin;




DROP DATABASE IF EXISTS was04_department_inv;
CREATE DATABASE was04_department_inv WITH ENCODING 'UTF8';
GRANT ALL PRIVILEGES ON DATABASE was04_department_inv TO admin;
ALTER DATABASE was04_department_inv OWNER TO admin;

DROP DATABASE IF EXISTS was04_department_inv_test;
CREATE DATABASE was04_department_inv_test WITH ENCODING 'UTF8';
GRANT ALL PRIVILEGES ON DATABASE was04_department_inv_test TO admin;
ALTER DATABASE was04_department_inv_test OWNER TO admin;
