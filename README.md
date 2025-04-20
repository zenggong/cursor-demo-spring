# Spring Boot Demo

这是一个简单的Spring Boot演示项目。

## 项目结构

```
demo
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── demo
│   │   │               ├── DemoApplication.java
│   │   │               └── controller
│   │   │                   └── HelloController.java
│   │   └── resources
│   │       └── application.yml
│   └── test
└── pom.xml
```

## 运行项目

1. 确保已安装Java 8或更高版本
2. 确保已安装Maven
3. 在项目根目录执行：
   ```bash
   mvn spring-boot:run
   ```
4. 访问 http://localhost:8080/hello 测试应用

## 技术栈

- Spring Boot 2.7.0
- Java 8
- Maven
- Lombok 