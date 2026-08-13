# Write your MySQL query statement below
SELECT e2.name as Employee
From employee e1
inner join employee e2 on e1.id=e2.managerId 

where e1.salary<e2.salary