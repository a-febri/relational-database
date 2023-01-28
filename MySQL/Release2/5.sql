use alta_online_shop;
select t.*, p.nama as 'Nama Produk', u.nama as 'Nama User' from transaction t
left join user u on t.user_id=u.id
left join transaction_detail td on td.transaction_id=t.id
left join product p on td.product_id=p.id;
select*from transaction;
select*from transaction_detail;
select*from product;
select*from user;
