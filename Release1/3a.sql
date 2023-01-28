use alta_online_shop;
select*from product;
update product
set nama = 'product dummy', updated_at=now()
where id=1;