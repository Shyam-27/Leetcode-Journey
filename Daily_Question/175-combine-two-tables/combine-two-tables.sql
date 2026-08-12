# Write your MySQL query statement below
Select firstName,lastName, city, state from Person
Left Join Address
ON Person.personID=Address.personID