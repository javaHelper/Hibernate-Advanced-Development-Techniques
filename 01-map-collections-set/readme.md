# Mapping Sets

````
cd /usr/local/mysql/bin
./mysql -u root -p
use test;
````


```
mysql> show tables;
+----------------+
| Tables_in_test |
+----------------+
| images         |
| student        |
+----------------+
2 rows in set (0.00 sec)


mysql> select * from images;
+------------+------------+
| student_id | file_name  |
+------------+------------+
|          1 | photo1.jpg |
|          1 | photo4.jpg |
|          1 | photo2.jpg |
|          1 | photo3.jpg |
|          1 | photo5.jpg |
|          2 | photo1.jpg |
|          2 | photo2.jpg |
|          2 | photo3.jpg |
+------------+------------+
8 rows in set (0.01 sec)

mysql> select * from student;
+----+-----------------------+------------+-----------+
| id | email                 | first_name | last_name |
+----+-----------------------+------------+-----------+
|  1 | matt.wixson@gmail.com | Matt       | Wixon     |
|  2 | jane.doe@gmail.com    | Jane       | Doe       |
+----+-----------------------+------------+-----------+
2 rows in set (0.00 sec)

mysql>
```