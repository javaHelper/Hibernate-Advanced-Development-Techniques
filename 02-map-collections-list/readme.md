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
+------------+------------+--------------+
| student_id | file_name  | images_order |
+------------+------------+--------------+
|          1 | photo1.jpg |            0 |
|          1 | photo2.jpg |            1 |
|          1 | photo3.jpg |            2 |
|          1 | photo4.jpg |            3 |
|          1 | photo4.jpg |            4 |
+------------+------------+--------------+
5 rows in set (0.01 sec)

mysql> select * from student;
+----+-----------------------+------------+-----------+
| id | email                 | first_name | last_name |
+----+-----------------------+------------+-----------+
|  1 | matt.wixson@gmail.com | Matt       | Wixon     |
+----+-----------------------+------------+-----------+
1 row in set (0.00 sec)
mysql>
```