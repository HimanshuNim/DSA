# Write your MySQL query statement below
select round(sum(order_date=customer_pref_delivery_date)*100.0/count(*),2)as immediate_percentage
from Delivery
where (customer_id,order_date)in (
    select customer_id,Min(order_date)
    from Delivery
    group by customer_id
);