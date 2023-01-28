use alta_online_shop;
select p.*, pt.nama from product p
inner join product_type pt on pt.id=p.product_type_id;
select*from product;
select*from product_type;
