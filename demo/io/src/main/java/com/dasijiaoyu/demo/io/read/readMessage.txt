maven:hadoop-core hadoop-common
报错: Server IPC version 9 cannot communicate with client version 4

原因:Java初始化hdfs client时出现的，原因是maven依赖的版本和hdfs的版本不一致

解决方案:maven仓库中的hadoop-core最高只有1.2.1版本， 不能加这个配置， 使用hadoop-common + hadoop-hdfs + hadoop-client的2.7.1版本即可