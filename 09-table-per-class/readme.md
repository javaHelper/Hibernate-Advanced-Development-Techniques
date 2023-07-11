# Table Per class


```
mysql> show tables;
+---------------------+
| Tables_in_test      |
+---------------------+
| hibernate_sequences |
| instructor          |
| student             |
+---------------------+
3 rows in set (0.00 sec)

mysql> select * from instructor;
+----+-------------------+------------+-----------+--------+
| id | email             | first_name | last_name | salary |
+----+-------------------+------------+-----------+--------+
|  2 | john@luv2code.com | John       | Doe       |  20000 |
+----+-------------------+------------+-----------+--------+
1 row in set (0.00 sec)

mysql> select * from student;
+----+-------------------+------------+-----------+-----------+
| id | email             | first_name | last_name | course    |
+----+-------------------+------------+-----------+-----------+
|  1 | mary@luv2code.com | Mary       | Public    | Hibernate |
+----+-------------------+------------+-----------+-----------+
1 row in set (0.00 sec)

mysql> select * from hibernate_sequences;
+---------------+----------+
| sequence_name | next_val |
+---------------+----------+
| default       |        2 |
+---------------+----------+
1 row in set (0.00 sec)

mysql>
```