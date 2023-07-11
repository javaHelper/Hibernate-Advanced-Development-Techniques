# Hibernate-Advanced-Development-Techniques


# Single Table
Advantages

- Simple and straight-forward implementation
- Since data is in a single table, results in the best query performance  Disadvantages

Disadvantanges:

- Each row only uses a subset of fields and sets others to null
- Since fields are nullable, this may present issues with data integrity

----------

# Table per Class
Advantages:

- Simple and straight-forward implementation
- Queries on concrete sub-classes perform generally well  Disadvantages

Disadvantages:

- Slow performance for queries on superclasses (results in many joins)
- Query performance slows down for very deep inheritance trees
- ID generation with sequence tables in a high-volume multi-threaded environment is slow

----------------

# Joined Tables
Advantages

- Normalized database model
- No duplicate mapping of inherited fields  Disadvantages

Disadvantages

- Slow performance for queries on subclasses (results in many joins)
- Query performance slows down for very deep inheritance trees

------------------

# Mapped Superclass
Advantages

- Simple and straight-forward implementation
- Queries on concrete subclasses perform well (no need for joins)  Disadvantages

Disavantages:

- For polymorphic queries, need to manually code HQL joins
- For example, to query for all Users, need to join across Student, Instructor etc ...
   - Requires manual HQL coding
   - May result in slower performance (results in many joins)

-----------





