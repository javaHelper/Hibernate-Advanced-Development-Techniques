# Joined Table Strategy


```
mysql> show tables;
+----------------+
| Tables_in_test |
+----------------+
| instructor     |
| student        |
| user           |
+----------------+
3 rows in set (0.00 sec)

mysql> select * from instructor;
+--------+----+
| salary | id |
+--------+----+
|  20000 |  2 |
+--------+----+
1 row in set (0.00 sec)

mysql> select * from student;
+-----------+----+
| course    | id |
+-----------+----+
| Hibernate |  1 |
+-----------+----+
1 row in set (0.00 sec)

mysql> select * from user;
+----+--------------------+------------+-----------+
| id | email              | first_name | last_name |
+----+--------------------+------------+-----------+
|  1 | john.doe@gmail.com | John       | Doe       |
|  2 | jane.doe@gmail.com | Jane       | Doe       |
+----+--------------------+------------+-----------+
2 rows in set (0.00 sec)

mysql>
```