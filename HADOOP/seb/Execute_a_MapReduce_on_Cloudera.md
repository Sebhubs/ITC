# HDFS Command Line Cheat Sheet, to execute a MapReduce job

- **Create** a ```file1.txt```, in the local folder, fill it with some content.
- **Write** 2 python scripts :
```
mapper.py
reducer.py
```
- **Transfer** the 3 files to the folder in USUK30/seb by the command :
```
hdfs dfs -put file1.txt mapper.py reducer.py /tmp/USUK30/seb/
```
- **Execute** the job by the command :
```
hadoop jar /opt/cloudera/parcels/CDH/lib/hadoop-mapreduce/hadoop-streaming.jar     -D mapreduce.job.reduces=1     -files mapper.py,reducer.py     -mapper "/usr/bin/python mapper.py"     -reducer "/usr/bin/python reducer.py"     -input /tmp/USUK30/seb/file1.txt     -output /tmp/USUK30/seb/output
```

- And to **visualize** the output file(s):
```
hdfs dfs -cat /tmp/USUK30/seb/output/part-00000
```

- To **copy** the files from (cloud local folder) to personal laptop:
```
scp -i test_key.pem -r ec2-user@ec2-18-133-73-36.eu-west-2.compute.amazonaws.com:/home/ec2-user/BD_USUK_30012024/sebou C:/Users/sebou/Downloads
```
