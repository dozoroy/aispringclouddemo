# orderingsystem
简单分布式微服务的外卖订单系统


## 环境说明
 * 建议使用IDEA 2018.3+
 * 确保已经安装 Lombok Plugin
 * JDK    1.8+
 * MySQL  5.7.8+
 * Maven  3.6+



## 一、项目下载：
 * git@github.com:dozoroy/orderingsystem.git



## 二、初始化数据库
 * 进入 db/orderingsystem.sql     
 * 默认字符集: utf8mb4
 * 默认排序规则: utf8mb4_general_ci      

  
## 三、配置修改
*  数据库源信息配置
*  进入  configserver/src/main/resources/shared/
*  修改  account-dev.yml  menu-dev.yml  order-dev.yml  user-dev.yml
```
 datasource:
    name: orderingsystem
    url: jdbc:mysql://localhost:3306/orderingsystem?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8
    username: root
    password: root
```
  

## 四、启动顺序
*  EurekaServerApplication   http://localhost:8761/ 
*  ConfigServerApplication   
*  UserApplication 
*  AccountApplication  
*  MenuApplication
*  OrderApplication
*  ClientApplication
  
*  使用链路追踪时再启动以下项目
*  ZipkinApplication  
*  ZipkinClientApplication  http://localhost:9090/zipkin/
  

## 五、登录前端
*  http://localhost:8030/login.html   
*  分别使用管理员和用户进入不同界面
*  username:zhangsan  password:123123   type:用户
*  username:admin1    password:123123   type:管理员













