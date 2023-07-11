# Mapped Superclass


```
mysql> show tables;
+----------------+
| Tables_in_test |
+----------------+
| instructor     |
| student        |
+----------------+
2 rows in set (0.00 sec)

mysql> select * from instructor;
+----+-------------------+------------+-----------+--------+
| id | email             | first_name | last_name | salary |
+----+-------------------+------------+-----------+--------+
|  1 | john@luv2code.com | John       | Doe       |  20000 |
+----+-------------------+------------+-----------+--------+
1 row in set (0.00 sec)

mysql> select * from student;
+----+-------------------+------------+-----------+-----------+
| id | email             | first_name | last_name | course    |
+----+-------------------+------------+-----------+-----------+
|  1 | mary@luv2code.com | Mary       | Public    | Hibernate |
+----+-------------------+------------+-----------+-----------+
1 row in set (0.00 sec)

mysql> 
```