*Bucketing*
Now, you already have a table named employees_internal that is populated with data. and has the following columns :
```
  ID INT,
  Name STRING,
  Age INT,
  DepartmentID INT
```

And you want to do some bucketing:
You can first create a table named "employees_internal_bucketed"
```
CREATE TABLE employees_internal_bucketed (
  ID INT,
  Name STRING,
  Age INT,
  DepartmentID INT
)
CLUSTERED BY (ID) INTO 4 BUCKETS
STORED AS ORC;
```

Then, populate the Bucketed Table:
```
SET hive.enforce.bucketing = true;

INSERT INTO TABLE employees_in_bucketed
SELECT ID, Name, Age, DepartmentID FROM employees_in;
```