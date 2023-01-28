use alta_online_shop;
select t.user_id, sum(td.qty*td.price) as 'Jumlah Harga Transaksi' from transaction t
left join transaction_detail td on t.id=td.transaction_id where t.user_id=1;
select*from transaction;
