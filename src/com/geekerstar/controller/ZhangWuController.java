package com.geekerstar.controller;

import com.geekerstar.domain.ZhangWu;
import com.geekerstar.service.ZhangWuService;

import java.util.List;

/*
 * 控制器层
 * 接收视图层的数据，数据传递给service层
 * 成员位置，创建Service对象
 *
 * */
public class ZhangWuController {
    private ZhangWuService service = new ZhangWuService();
    /*
    * 定义方法，实现删除功能
    * 视图层调用，传递int类型主键
    * 调用Service层方法，传递int主键
    *
    * */

    public void deleteZhangWu(int zwid){
        service.deleteZhangWu(zwid);
    }

    /*
    * 定义方法，实现编辑账务功能
    * 由视图层调用，传递参数，页数Zhangwu对象
    * 调用Service层的方法，也是ZhangWu对象
    *
    * */
    public void editZhangWu(ZhangWu zw){
        service.editZhangWu(zw);
    }

    /*
    * 定义方法，实现账务添加功能
    * 由视图层调用，传递参数（传递过来的参数不能是5个数据，传递的是一个ZhangWu类型的对象）
    * 本方法调用Service层的方法，传递ZhangWu对象，获取到添加后的结果集（添加成功影响的行数，list)
    * */
    public void addZhangWu(ZhangWu zw){
        service.addZhangWu(zw);
    }

    /*
    * 定义方法，实现条件查询账务
    * 方法由视图层调用，传递两个日期的字符串
    * 调用Service层的方法，传递两个日期字符串，获取结果集
    * 结果集返回给视图
    * */

    public List<ZhangWu> select(String startDate,String endDate){
        return service.select(startDate,endDate);
    }

    /*
    * 控制层类定义方法，实现查询所有的账务数据
    * 方法由书图村调用，方法调用Service层
    * */

    public List<ZhangWu> selectAll(){
        return service.selectALL();
    }



}
