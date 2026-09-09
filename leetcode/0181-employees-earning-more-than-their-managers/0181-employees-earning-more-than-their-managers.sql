# Write your MySQL query statement below


select e.name As Employee 
from Employee e
where 
e.salary>(
    select m.salary
    from Employee m
    where e.managerId=m.id
);