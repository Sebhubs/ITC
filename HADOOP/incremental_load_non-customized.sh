#!/bin/bash

# Variables
HOSTNAME='ec2-3-9-191-104.eu-west-2.compute.amazonaws.com'
DBNAME='testdb'
USERNAME='consultants'
PASSWORD='WelcomeItc@2022'

TABLE='zz_seb_table_1'
TARGET_DIR='/tmp/USUK30/seb/hive/zz_seb_table_1/'

# Fetch the maximum id value from Hive
LAST_VALUE=$(beeline -u 'jdbc:hive2://ip-172-31-3-80.eu-west-2.compute.internal:10000/default;' --silent=true -e "SELECT MAX(id) FROM zz_seb_table_1;" | grep -o $

echo "Last recorded ID: $LAST_VALUE"
echo "Starting new import from ID greater than $LAST_VALUE"

# Perform the incremental Sqoop import
sqoop import \
    --connect jdbc:postgresql://${HOSTNAME}:5432/${DBNAME} \
    --username ${USERNAME} \
    --password ${PASSWORD} \
    --table ${TABLE} \
    --incremental append \
    --check-column id \
    --last-value ${LAST_VALUE} \
    --target-dir ${TARGET_DIR} \
    --m 1 \
    --as-textfile



