#!/bin/bash

# Check if at least the required arguments are provided
if [ -z "$1" ] || [ -z "$2" ]; then
  echo "Usage: $0 <user> <table_name> [database]"
  exit 1
fi

# Assign arguments to variables for clearer reference
USER="$1"
TABLE="$2"
DATABASE="${3:-default}" # Use the 3rd argument if provided, otherwise default to default

# Import the table from postgres, as a text file
sqoop import \
    --connect jdbc:postgresql://ec2-3-9-191-104.eu-west-2.compute.amazonaws.com:5432/testdb \
    --username consultants \
    --password WelcomeItc@2022 \
    --table "${TABLE}" \
    --m 1 \
    --target-dir "/tmp/USUK30/${USER}/hive/${DATABASE}/${TABLE}" \
    --as-textfile

# Create an external table from the previously imported file
beeline -u "jdbc:hive2://ip-172-31-3-80.eu-west-2.compute.internal:10000/${DATABASE};" --silent=true -e "
CREATE EXTERNAL TABLE if not exists ${TABLE} (
  ID INT,
  Name STRING,
  Age INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/tmp/USUK30/${USER}/hive/${DATABASE}/${TABLE}/';
"



