use alta_online_shop;
select count(*) as 'jumlah transaksi' from transaction t
left join transaction_detail td on t.id=td.transaction_id where td.product_id=2;
select*from transaction_detail;
