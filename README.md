# HomePayM
java写的家庭收支管理系统，控制台输入输出，适合java初学者的练习项目

## 功能介绍
* 查询账务
* 多条件组合查询账务
* 添加账务
* 编辑账务
* 删除账务

## 项目分层
* view层作用: 视图层,即项目中的界面
* controller层作用: 控制层, 获取界面上的数据,为界面设置数据; 将要实现的功能交给业务层处理
* service层作用: 业务层, 功能的实现, 与controller控制层和数据访问层DAO交互, 将对数据库的操作交给DAO数据访问层来处理
* dao层作用: 数据访问层, 用来操作数据库表的数据
* db数据库: 这里指MySQL
* domain 实体包: 存放JavaBean
* tools工具包:存放项目中使用到的工具类
* test 测试包: 存放项目功能测试的代码

> 添加账务

![添加账务](https://github.com/geekerstar/HomePayM/blob/master/img/addzhangwu.jpg)

> 编辑账务

![编辑账务](https://github.com/geekerstar/HomePayM/blob/master/img/editzhangwu.jpg)

>查看账务

![查看账务](https://github.com/geekerstar/HomePayM/blob/master/img/selectzhangwu.jpg)

