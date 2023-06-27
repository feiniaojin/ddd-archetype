<div align=center><img src="https://s1.ax1x.com/2023/05/22/p9o1OG6.png"/></div>

# 注：本文最后附DDD免费学习资料

**各位朋友clone和fork之前，麻烦顺手帮忙star一下！**

# 1. ddd-archetype介绍

我们在落地DDD应用架构时，通常将项目分为多个Maven Module，如下图。

[![p9TtTHS.png](https://s1.ax1x.com/2023/05/23/p9TtTHS.png)](https://imgse.com/i/p9TtTHS)

如果每个项目都手工创建一次，是比较繁琐的工作，也不利项目结构的统一。Maven
Archetype是一个Maven插件，它允许开发人员通过指定一组参数来创建项目的基础结构，可以帮助开发人员快速创建项目的基础结构，大大减少开发人员在创建项目时所需的时间和精力，并且可以确保项目结构的一致性和可重用性，从而提高代码质量和可维护性。

ddd-archetype是一个Maven Archetype的原型工程，我们将其克隆到本地之后，可以安装为Maven Archetype，帮助我们快速创建DDD项目脚手架。

欢迎star！

# 2. ddd-archetype的安装使用

## 2.1 安装过程

以下将以IDEA为例展示ddd-archetype的安装使用过程，主要过程是：

`克隆项目`-->`archetype:create-from-project`-->`install`-->`archetype:crawl`

### 2.1.1 克隆项目

将项目克隆到本地：

```shell
git clone https://github.com/feiniaojin/ddd-archetype.git
```

直接使用主分支即可，然后使用IDEA打开该项目

[![p9olKXQ.png](https://s1.ax1x.com/2023/05/22/p9olKXQ.png)](https://imgse.com/i/p9olKXQ)

### 2.1.2 archetype:create-from-project

配置打开IDEA的`run/debug configurations`窗口，如下：
[![p9ol17n.png](https://s1.ax1x.com/2023/05/22/p9ol17n.png)](https://imgse.com/i/p9ol17n)

选择`add new configurations`，弹出以下窗口：
[![p9olGt0.png](https://s1.ax1x.com/2023/05/22/p9olGt0.png)](https://imgse.com/i/p9olGt0)

其中，上图中1～4各个标识的值为：

标识`1` - 选择"+"号；

标识`2` - 选择"Maven";

标识`3` - 命令为：

```shell
archetype:create-from-project -Darchetype.properties=archetype.properties
```

> 注意，在IDEA中添加的命令默认不需要加mvn

标识`4` - 选择`ddd-archetype`的根目录

以上配置完成后，点击执行该命令。

### 2.1.3 install

上一步执行完成且无报错之后，配置`install`命令。

[![p9oltpT.png](https://s1.ax1x.com/2023/05/22/p9oltpT.png)](https://imgse.com/i/p9oltpT)

其中，上图中1～2各个标识的值为：

标识`1` - 值为`install`；

标识`2` - 值为上一步运行的结果，路径为：

```
ddd-archetype/target/generated-sources/archetype
```

`install`配置完成之后，点击执行。

### 2.1.4 archetype:crawl

`install`执行完成且无报错，接着配置`archetype:crawl`命令。

[![p9olN1U.png](https://s1.ax1x.com/2023/05/22/p9olN1U.png)](https://imgse.com/i/p9olN1U)

其中，标识1中的值为：

```shell
archetype:crawl
```

配置完成，点击执行即可。

## 2.2 使用ddd-archetype初始化项目

- 创建项目时，点击`manage catalogs`：
[![p9olaX4.png](https://s1.ax1x.com/2023/05/22/p9olaX4.png)](https://imgse.com/i/p9olaX4)

- 将本地的maven私服中的`archetype-catalog.xml`加入到catalogs中：
[![p9ol0B9.png](https://s1.ax1x.com/2023/05/22/p9ol0B9.png)](https://imgse.com/i/p9ol0B9)

添加成功，如下：
[![p9olrA1.png](https://s1.ax1x.com/2023/05/22/p9olrA1.png)](https://imgse.com/i/p9olrA1)

- 创建项目时，选择本地archetype-catalog，并且选择`ddd-archetype`，填入项目信息并创建项目：
[![p9olstx.png](https://s1.ax1x.com/2023/05/22/p9olstx.png)](https://imgse.com/i/p9olstx)

- 项目创建完成后：
  [![p9TtUh9.png](https://s1.ax1x.com/2023/05/23/p9TtUh9.png)](https://imgse.com/i/p9TtUh9)
  
# DDD学习免费电子书

作者将多年领域驱动设计的经验，撰写成《悟道DDD（Thinking in DDD）》这一电子书，力求用最平实、最通俗、最容易理解的方式将DDD分享给各位朋友。

本电子书永久免费阅读，欢迎沟通交流。

![](https://s1.ax1x.com/2023/06/27/pCa5cm6.png)

项目地址：https://github.com/feiniaojin/Thinking-in-DDD 

在线阅读：http://ddd.feiniaojin.com/
