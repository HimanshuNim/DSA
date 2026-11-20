# Write your MySQL query statement below
select distinct a.num as ConsecutiveNums from Logs a 
join Logs b on b.id=a.id+1 and b.num=a.num
join Logs c on c.id=a.id+2 and c.num=a.num;