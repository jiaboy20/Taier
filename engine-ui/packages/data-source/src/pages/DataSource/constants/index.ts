/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

export const HDFSCONG = `{
  "dfs.nameservices": "defaultDfs", 
  "dfs.ha.namenodes.defaultDfs": "namenode1", 
  "dfs.namenode.rpc-address.defaultDfs.namenode1": "", 
  "dfs.client.failover.proxy.provider.defaultDfs": "org.apache.hadoop.hdfs.server.namenode.ha.ConfiguredFailoverProxyProvider" 
  }`;

export const DATA_SOURCE = {
  MYSQL: 1,
  ORACLE: 2,
  SQLSERVER: 3,
  POSTGRESQL: 4,
  HDFS: 6,
  HIVE: 7,
  HBASE: 8,
  FTP: 9,
  MAXCOMPUTE: 10,
  ES: 11,
  ES6: 33,
  ES7: 46,
  REDIS: 12,
  MONGODB: 13,
  ADS: 15,
  BEATS: 16,
  KAFKA: 26,
  KAFKA_2X: 37,
  KAFKA_09: 18,
  KAFKA_10: 17,
  KAFKA_11: 14, // KAFKA_11
  KAFKA_NEW: 55,
  DB2: 19,
  KUDU: 24,
  POLAR_DB: 28,
  IMPALA: 29,
  EMQ: 34,
  SQLSERVER2017: 32,
  TIDB: 31,
  CLICKHOUSE: 25,
  KINGBASEES8: 40,
  S3: 41,
  WEBSOCKET: 42,
  SOCKET: 44,
  RESTFULAPI: 47,
  Hive_1X: 43,
  Hive_2X: 45,
  HBase_1X: 48,
  HBase_2X: 49,
  CARBONDATA: 50,
  GREENPLUM: 51,
  GBASE_8A: 52,
  KYLINURL: 53,
  ELASTICSEARCH: 54,
  PHOENIX: 56,
  PRESTO: 57,
  VERTICA: 58,
  ADB_POSTGRESQL: 59,
  SOLR: 60,
  INFLUXDB: 61,
  INCEPTOR: 62,
  AWSS3: 63,
  SPARKTHRIFT: 64,
  GAUSSDB: 65,
  OPENTSDB: 66,
  DORIS: 67,
  KYLINJDBC: 68,
  SQLSERVERJDBC: 69,
};

export const DATA_SOURCE_TEXT: any = {
  1: 'MySQL',
  2: 'Oracle',
  3: 'SQLServer',
  4: 'PostgreSQL',
  6: 'HDFS',
  7: 'Hive',
  8: 'HBase',
  9: 'FTP',
  10: 'Maxcompute',
  11: 'ElasticSearch5',
  12: 'Redis',
  13: 'MongoDB',
  15: 'ADS',
  16: 'BEATS',
  26: 'Kafka1.x',
  37: 'Kafka2.x',
  18: 'Kafka0.9',
  17: 'Kafka0.10',
  14: 'Kafka0.11',
  55: 'Kafka',
  19: 'DB2',
  24: 'Kudu',
  28: 'PolarDB for MySQL8',
  29: 'Impala',
  34: 'EMQ',
  33: 'ElasticSearch6',
  32: 'SQLServer_2017_later',
  40: 'KingbaseES8',
  41: 'S3',
  42: 'WebSocket',
  44: 'Socket',
  //add
  43: 'Hive1.x',
  45: 'Hive2.x',
  48: 'HBase1.x',
  49: 'HBase2.x',
  50: 'CarbonData',
  25: 'ClickHouse',
  51: 'Greenplum',
  31: 'TiDB',
  52: 'GBase_8a',
  53: 'Kylin URL',
  54: 'Elasticsearch',
  56: 'Phoenix',
  57: 'Presto',
  58: 'Vertica',
  59: 'ADB_PostgreSQL',
  60: 'Solr',
  61: 'InfluxDB',
  62: 'Inceptor',
  63: 'AWS S3',
  64: 'SparkThrift',
  65: 'GaussDB',
  66: 'OpenTSDB',
  67: 'Doris',
  68: 'Kylin JDBC',
  69: 'SQLServer JDBC',
};

export const PROJECT_TYPE: any = {
  COMMON: 0, // 普通
  TEST: 1, // 测试
  PRO: 2, // 生产
};
