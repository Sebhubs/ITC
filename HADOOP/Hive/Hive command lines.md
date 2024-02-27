## Let's create examples of each type of table in Hive using the provided content:

- **Managed**: CRUD transactional

```
CREATE TABLE managed_crud_transactional (
  ID INT,
  Name STRING,
  Age INT,
  Country STRING
)
STORED AS ORC
TBLPROPERTIES ("transactional"="true");
```
Then 
```
INSERT INTO TABLE managed_crud_transactional 
VALUES 
(1, 'John Doe', 28, 'USA'),
(2, 'Jane Smith', 32, 'Canada'),
(3, 'Alex Johnson', 45, 'UK'),
(4, 'Maria Garcia', 25, 'Spain'),
(5, 'Chen Wei', 30, 'China');
```

- **Insert operation**
```
INSERT INTO managed_crud_transactional (ID, Name, Age, Country)
VALUES (6, 'Emma Wilson', 35, 'Australia');
```

- **Update operation**
```
UPDATE managed_crud_transactional SET Age = 30 WHERE ID = 3;
```

- **Delete operation**
```
- DELETE FROM managed_crud_transactional WHERE ID = 4;
```


- **Managed**: Insert-only transactional
```
CREATE TABLE managed_insert_only_transactional (
  ID INT,
  Name STRING,
  Age INT,
  Country STRING
)
STORED AS ORC
TBLPROPERTIES ("transactional"="true", "insert.only"="true");
```
Then,
```
INSERT INTO TABLE managed_insert_only_transactional 
VALUES 
(1, 'John Doe', 28, 'USA'),
(2, 'Jane Smith', 32, 'Canada'),
(3, 'Alex Johnson', 45, 'UK'),
(4, 'Maria Garcia', 25, 'Spain'),
(5, 'Chen Wei', 30, 'China');
```

- **Managed** Temporary
```
CREATE TEMPORARY TABLE managed_temporary (
  ID INT,
  Name STRING,
  Age INT,
  Country STRING
);
```
Then,
```
INSERT INTO TABLE managed_temporary 
VALUES 
(1, 'John Doe', 28, 'USA'),
(2, 'Jane Smith', 32, 'Canada'),
(3, 'Alex Johnson', 45, 'UK'),
(4, 'Maria Garcia', 25, 'Spain'),
(5, 'Chen Wei', 30, 'China');
```


### We can also perform some example operations on each type of table
```
SELECT * FROM managed_crud_transactional;
```

- **Update operation**

```
UPDATE managed_crud_transactional SET Age = 29 WHERE ID = 1;
```

- **Delete operation**
```
DELETE FROM managed_crud_transactional WHERE ID = 5;
```


Managed: Insert-only transactional:

- **Select** operation

```
SELECT * FROM managed_insert_only_transactional;
```
Since it's an insert-only table, we can't perform update or delete operations on it.


Managed: Temporary:

- **Select** operation
```
SELECT * FROM managed_temporary;
```
Since it's a temporary table, it will be automatically dropped when the session ends. Therefore, we won't perform update or delete operations on it.






# A little summary of what is Hive 
Hive is a data warehouse infrastructure built on top of Hadoop for providing data summarization, query, and analysis. It enables easy data summarization, ad-hoc querying, and analysis of large datasets stored in various storage systems such as Hadoop Distributed File System (HDFS), Amazon S3, Azure Data Lake Storage, and others. Here's how Hive works at a high level:

**HiveQL**: Hive provides a SQL-like language called HiveQL (Hive Query Language), which allows users to query and manage data using familiar SQL syntax. HiveQL queries are translated into MapReduce jobs or Apache Tez tasks by the Hive engine for execution on the Hadoop cluster.

**Metastore**: Hive uses a metastore to store metadata information about tables, partitions, columns, data types, and other schema-related details. The metastore is typically backed by a relational database such as MySQL, PostgreSQL, or Derby. It stores metadata information independently of the underlying data storage system, enabling Hive to work with different storage systems seamlessly.

**Execution Engine**: Hive supports multiple execution engines, including MapReduce, Apache Tez, and Spark. The execution engine is responsible for processing HiveQL queries, generating execution plans, and orchestrating the execution of tasks on the Hadoop cluster. Apache Tez and Spark are more efficient than MapReduce and are commonly used for faster query execution.

**Data Storage**: Hive supports various data formats such as text, ORC (Optimized Row Columnar), Parquet, Avro, and others. These formats provide efficient storage and retrieval of data, optimized for different types of queries and workloads. Users can choose the appropriate storage format based on factors like query performance, compression, and compatibility with other tools and systems.

**Partitioning** and Bucketing: Hive allows users to partition data based on one or more columns, enabling faster query processing by restricting the amount of data that needs to be scanned. Additionally, users can organize data into buckets based on a hash function applied to one or more columns, which can improve query performance for certain types of queries.

**Integration with Ecosystem Tools*: Hive integrates with other Hadoop ecosystem tools such as HBase, Spark, Pig, and Mahout. This integration allows users to leverage the capabilities of these tools alongside Hive for various data processing and analytics tasks.

Overall, Hive provides a high-level abstraction for working with big data, allowing users to perform complex data analysis tasks using familiar SQL-like queries, while leveraging the scalability and fault-tolerance provided by the Hadoop ecosystem