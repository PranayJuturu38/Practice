SELECT * FROM Customer;
Select FirstName, City,Country From Customer;
SELECT DISTINCT Country From Customer c ;
SELECT COUNT(DISTINCT Country) From Customer c ;
SELECT FirstName From Customer c WHERE Country ='Brazil';
SELECT * FROM Customer c WHERE CustomerId =1;
SELECT * FROM Customer c WHERE Country ='Brazil' AND Country ='Canada';
SELECT * FROM Customer c WHERE City ='Prague' or City = 'Vancouver';
SELECT * FROM Customer c WHERE Not Country ='Brazil';
SELECT * FROM Customer c WHERE Country ='Canada' AND (City='Vancouver' or City='Edmonton');
SELECT * FROM Customer c WHERE Not Country ='Canada' and not Country ='Brazil';
SELECT * FROM Customer c order By Country;
SELECT * FROM Customer c order By Country DESC ;
SELECT * FROM Customer c order By Country,FirstName ;
SELECT * FROM Customer c order By Country ASC ,FirstName DESC ;



