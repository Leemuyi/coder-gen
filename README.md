# Jasypt 加解密工具
![License](https://img.shields.io/badge/license-MIT-yellow)
![Java](https://img.shields.io/badge/Java-OpenJdk11+-<yellow>)
![Maven](https://img.shields.io/badge/Maven-3.x-<yellow>)

![Language](https://img.shields.io/badge/Language-Java-<yellow>) 
[![项目地址](https://img.shields.io/badge/项目地址-GitHub-<yellow>)](https://github.com/Leemuyi/coder-gen.git)

## 1. 项目介绍
Jasypt是一个Java库，用于简化加密和解密敏感信息，如密码和其他文本。它提供了一种易于使用的API，可以在应用程序中轻松地实现加密和解密。
本项目是基于Jasypt Java库，提供通过GUI界面进行加解密操作。简化了加解密的操作。

目前仅支持`PBEWITHHMACSHA512ANDAES_256`和`PBEWithMD5AndDES`两种加密算法。后续会根据需求添加更多的加密算法。

## 2. 项目结构
```
├─src
│  ├─main
│  │  ├─java
│  │  │  └─cn
│  │  │      └─com
│  │  │          └─mooyea
│  │  │              └─codergen
│  │  │                  ├─hanlder
│  │  │                  │   ├─listener
│  │  │                  │   │     └─EncryptListener.java
│  │  │                  │   └─EncodeHandler.java
│  │  │                  ├─point
│  │  │                  │   └─CoderGen.java
│  │  │                  └─window
│  │  │                      └─PasswordGenGui
│  │  │                              ├─PasswordGenGui.java
│  │  │                              └─PasswordGenGui.form
│  │  └─resources
│  │      ├─i18n
│  │      │  ├─context_zh_CN.properties
│  │      │  └─context_en_US.properties
│  │      └─icon
│  │          └─jasypt.ico
```

## 3. 使用说明
### 3.1. IDE运行
#### 3.1.1. 环境要求
- JDK 11+
- Maven 3.x
- IDEA 2020.2.3
#### 3.1.2. 运行步骤
1. 克隆项目到本地
2. 使用IDEA打开项目
3. 运行CoderGen.java

### 3.2. 安装运行
下载 tag 1.1.1 版本的install.exe运行即可

## 4. 项目截图
![运行截图](https://drawing-bot.oss-cn-beijing.aliyuncs.com/bot-images/202304170959325.png)


