# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.1/maven-plugin/reference/html/#build-image)

1、netty初始化服务端，解析二进制报文
2、newtty通过socket进行实现，检测socket健康状况需要心跳机制：（定时发送固定报文得结构体，确保连接有效）
3、tcp协议层的Keeplive机制里面，本身存在有心跳包得机制，系统默认得是2小时心跳频率，但是它检查不到机器断电、网线拔出、防火墙这些断线。而且逻辑层处理断线可能也不是那么好处理
4、定时任务去刷新map存储得设备心跳时间。