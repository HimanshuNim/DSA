# Write your MySQL query statement below


select e.name As Employee 
from Employee e 
join Employee m On e.managerId = m.id 
where e.salary>m.salary;