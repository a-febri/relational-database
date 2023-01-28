use alta_online_shop;
Select*from user where created_at > date_sub(now() , interval 7 day) and nama like '%a%';