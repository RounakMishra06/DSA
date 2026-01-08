select product_id,(case when product_id not in (select product_id from Products where change_date<='2019-08-16') then 10 else new_price end) as price
from Products
where product_id not in(select product_id from Products where change_date<='2019-08-16')
union
select product_id, new_price as price
from (select product_id, new_price, change_date, rank()over (partition by product_id order by change_date desc) as rnk
from Products
where change_date<='2019-08-16') t
where rnk=1