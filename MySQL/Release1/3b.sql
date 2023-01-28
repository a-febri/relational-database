use alta_online_shop;
select*from transaction_detail;
update transaction_detail
set qty = 3, updated_at=now() 
where product_id=1;