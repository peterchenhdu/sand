# sand
Sand Framework, focus on code reuse, enhance develop-efficiency.
[![Build Status][travis-image]][travis-url]
[travis-image]: https://travis-ci.org/peterchenhdu/sand.svg?branch=master
[travis-url]: https://travis-ci.org/peterchenhdu/sand
## 模块组成
- [x] sand-base
- [x] sand-biz-log
- [ ] sand-csv
- [x] sand-datasource
- [ ] sand-ehcache
- [ ] sand-exception
- [x] sand-kaptcha
- [x] sand-oss
- [ ] sand-poi
- [x] sand-quartz
- [x] sand-redis
- [x] sand-shiro
- [ ] sand-sys-log
- [x] sand-validator
- [ ] sand-websocket
## 技术选型
技术  | 版本 | 描述
------------- | ------------- | -------------
Spring Boot	  | 2.2.4.RELEASE | 简化Spring应用的搭建和开发过程
Spring Framework	  | 5.2.3.RELEASE | Spring
Oracle JDK	  | 1.8 | JDK
MyBatis-Plus	  | 3.3.1 | MyBatis-Plus
Apache Shiro	  | 1.5.2 | Apache Shiro
Kaptcha	  | 0.0.9 | Kaptcha
Druid	  | 1.1.13 | Druid
## 模块介绍
### sand-base
基础模块：包含公共基类，常用工具类等
### sand-biz-log
业务日志模块：处理业务日志
### sand-csv
CSV模块：CSV文件导入导出等功能封装
### sand-datasource
数据源模块：数据源封装，支持多数据源
### sand-ehcache
ehcache缓存模块：ehcache封装
### sand-exception
异常模块：异常处理封装
### sand-kaptcha
验证码模块：封装验证码相关代码逻辑
### sand-oss
对象存储模块：阿里云、七牛云、腾讯云对象存储封装
### sand-poi
poi模块：poi操作封装
### sand-quartz
定时任务模块：定时任务封装
### sand-redis
redis缓存模块：redis缓存封装
### sand-shiro
shiro模块：shiro封装
### sand-sys-log
系统 日志模块：系统日志模块封装
### sand-validator
校验模块：参数校验相关封装
### sand-websocket
websocket通信模块：websocket封装
