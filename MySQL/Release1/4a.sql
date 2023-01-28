use alta_online_shop;
select*from product;
-- tambah data product tanpa relasi
insert into product(nama, price, product_type_id, operator_id)
values('Paket Nelpon 1 hari',1000,3,2),('Paket Nelpon 1 hari',1000,4,2);
-- delete product dengan id 9 (soal id=1, tapi tidak bisa delete)
delete from product where id=9;
select*from product;


