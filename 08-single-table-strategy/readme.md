# Single Table Strategy


```
mysql> select * from user;
+------------+----+--------------------+------------+-----------+--------+-----------+
| user_type  | id | email              | first_name | last_name | salary | course    |
+------------+----+--------------------+------------+-----------+--------+-----------+
| STUDENT    |  1 | john.doe@gmail.com | John       | Doe       |   NULL | Hibernate |
| INSTRUCTOR |  2 | jane.doe@gmail.com | Jane       | Doe       |  20000 | NULL      |
+------------+----+--------------------+------------+-----------+--------+-----------+
2 rows in set (0.00 sec)

mysql>
```