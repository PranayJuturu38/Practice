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
INSERT into Customer (FirstName,LastName,Company,City,Email) values ('Pranay','Juturu','KPI','Hyderabad','pranayreddy38@gmail.com');
SELECT FirstName from Customer c WHERE Company is NULL 
SELECT LastName from Customer c WHERE Company is NOT NULL ;
UPDATE Customer set FirstName = 'PranayJ',City ='BLr' WHERE CustomerId ='1';
UPDATE Customer set FirstName ='PranayJuturu' WHERE Country ='Brazil';
DELETE FROM Customer WHERE FirstName ='PranayJ';
SELECT MAX(CustomerID) from Customer c where Country ='Canada';
SELECT MIN(CustomerID) from Customer c where Country ='Canada';
SELECT COUNT(CustomerID) from Customer c where Country ='Canada';
SELECT AVG(CustomerID) from Customer c where Country ='Canada';
SELECT SUM(CustomerID) from Customer c where Country ='Canada';
SELECT FirstName,Country from Customer c WHERE Country LIKE 'a%';
SELECT FirstName,Country from Customer c WHERE FirstName LIKE '%a';
SELECT FirstName from Customer c where Country IN ('Brazil', 'Canada','Argentina')
SELECT * from Customer c2 WHERE CustomerId BETWEEN 10 and 30;
SELECT FirstName as Name from Customer c ;
select FirstName,FirstName from Customer c inner Join Employee e on Customer.Country = Employee .Country ;
SELECT Customers.CustomerName, Orders.OrderID FROM Customers FULL OUTER JOIN Orders ON Customers.CustomerID=Orders.CustomerID ORDER BY Customers.CustomerName;


