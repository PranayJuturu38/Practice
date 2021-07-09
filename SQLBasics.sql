SELECT * FROM Customer;
Select FirstName, City,Country From Customer; --Customers details
/*SELECT DISTINCT Country From Customer c ;*/
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
select FirstName from Customer c inner Join Employee e on Customer.Country = Employee .Country ;
SELECT Customers.FirstName, Orders.OrderID FROM Customers FULL OUTER JOIN Orders ON Customers.CustomerID=Orders.CustomerID ORDER BY Customers.FirstName;
SELECT Customers.FirstName, Orders.OrderID FROM Customers LEFT JOIN Orders ON Customers.CustomerID=Orders.CustomerID ORDER BY Customers.FirstName;
SELECT Customers.FirstName, Orders.OrderID FROM Customers Right JOIN Orders ON Customers.CustomerID=Orders.CustomerID ORDER BY Customers.FirstName;
SELECT Customers.FirstName, Orders.OrderID FROM Customers FULL OUTER JOIN Orders ON Customers.CustomerID=Orders.CustomerID ORDER BY Customers.FirstName;
select c1.FirstName as CustomerName1, c2.FirstName as CustomerName2 ,c1.City from Customer c1 ,Customer c2 where c1.CustomerId <> c2.CustomerId and c1.City = c2.city ORDER BY c1.City ;
select AlbumId from Album a UNION Select AlbumId from Artist a2 order by AlbumId ;
Select City from Customer c UNION ALL select city from SUppliers Order by city;
SELECT city,Country from Customer c where Country='Canada' UNION SELECT City,Country from Suppliers where Country ='Brazil' ORDER by City;
SELECT city,Country from Customer c where Country='Canada' UNION ALL SELECT City,Country from Suppliers where Country ='Brazil' ORDER by City;
Select COUNT(CustomerID),Country From Customer c Group by Country ;
SELECT Count(CustomerID),Country From Customer c Group BY Country ORDER BY Count(CustomerID) DESC;
SELECT Shipers.ShipperName,Count(orders.orderID) as NUmberofOrders from orders LEFT JOIN SHippers on ORders.shipperId= SHippers.ShipperID Group BY ShipperNAme; 
select COUNT(customerId),COuntry from Customer c Group BY COuntry HAving COunt(CustomerId)>5
select COUNT(customerId),Country from Customer c Group BY Country HAving Count(CustomerId)>5 ORDER by Count(CustomerId) DESC;
select Title from Album a where EXISTS (SELECT name from Track where Track.AlbumId=Album.AlbumId);
select ProductName from PRoducts where ProductID = Any (SELECT PRoductID From OrderDetails where Quantity = 10);
SELECT all FirstName from Customer c where True; 
SELECT * into Newtable from Customer c ;
SELECT FirstName,LastName into newtable from Customer c ;
SELECT * into CanadaCustomers from Customer c where COuntry ='Canada';
insert into Customer (customerName,City,Country) select SupportRepId from Suppliers;
SELECT CustomerID,FirstName case 
                                when age > 30 then 'The age is above 30'
                                when age=30 then 'the age is 30'
                                else 'The quantity is under 30'
end as CustomerText
from Customer c ;

CREATE Procedure SelectAllCustomers as SELECT * from Customers Go;
EXEC SelectAllCustomers;

CREATE Procedure SelectAllCustomers @Country nvarchar(30) as SELECT * from Customers where City = @City Go;
EXEC  SelectAllCustomers @Country = 'Brazil';

CREATE DATABASE NewDB;
DROP database NewDB;

Create table NEWTABLE(
 SingerID int NOT NULL UNIQUE,
 FirstName varchar(255),
 LastName Varchar(255),
 Address varchar(255),
 City varchar(255)
);
Drop table NEWTABLE;
alter table NEWTABLE add AlbumName varchar(255);
ALTER table NEWTABLE drop column Address;



