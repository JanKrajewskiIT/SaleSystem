# WAS04 Department

### [2013-03-18] @milczu
run maven build with profile 'dev' and ('invoicing' or 'warehouse')



###  [2013-03-19] @milczu
W pliku database/init_was04db.sql znajduje się plik, który utworzy potrzebne bazy danych i użytkowników.   
Na systemach debianowych można odpalić go tak:  
`sudo su;  
su postgres;  
psql < init_was04db.sql`

### [2013-04-13] @milczu
Komenda dla was04 headoffice liquibase:  
`mvn -pl was04-db liquibase:update -DwithTestData=true -P dev`
