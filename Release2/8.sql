use alta_online_shop;
select*from transaction_detail;
select*from product where id not in (select product_id from transaction_detail);








