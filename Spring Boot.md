## Spring Boot

#### 命令行指令

```shell
$ mvn spring-boot:run                           ##运行spring-boot项目
$ jar tvf target/myproject-0.0.1-SNAPSHOT.jar	 ##解压jar包
```

#### 设置JAVA编译级别

```xml
<properties>
  <java.version>1.8</java.version>
</properties>
```

#### 用BootMaven插件(打包)

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```

