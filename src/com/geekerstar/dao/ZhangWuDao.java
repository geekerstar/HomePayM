package com.geekerstar.dao;

import com.geekerstar.domain.ZhangWu;
import com.geekerstar.tools.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ZhangWuDao {
    private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
    /*
    * 定义方法，实现删除业务
    * 业务层调用，传递主键id
    * */
    public void deleteZhangWu(int zwid){
        //拼写删除数据SQL
        try {
            String sql = "DELETE FROM hpm_zhangwu WHERE zwid=?";
            qr.update(sql,zwid);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("删除账务失败");
        }
    }

    /*
    * 定义方法。实现编辑功能
    * 由业务层调用，传递ZhangWu对象
    * 将对象中的数据，更新到数据表
    * */

    public void editZhangWu(ZhangWu zw){
        try {
            //更新数据的SQL
            String sql = "UPDATE hpm_zhangwu SET flname=?,money=?,zhanghu=?,createtime=?,description=? WHERE zwid=?";
            //定义对象数组，封装所有数据
            Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription(),zw.getZwid()};
            //调用qr对象方法update执行更新
            qr.update(sql,params);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("编辑账务失败");
        }

    }

    /*
    * 定义方法，实习账务添加功能
    * 由业务层调用，传递zhangwu对象
    * 将账务对象中的数据添加到数据库
    * */

    public void addZhangWu(ZhangWu zw){
        try {
            //拼接添加数据的SQL
            String sql = "INSERT INTO hpm_zhangwu (flname,money,zhanghu,createtime,description) VALUES(?,?,?,?,?)";
            //创建对象数组，存储五个占位符的实际参数
            //实际参数来源是传递过来的对象zhangwu
            Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription()};
            //调用qr对象中的方法update执行添加
            qr.update(sql,params);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("账务添加失败");
        }
    }

    /*
    * 定义方法，查询数据库，带有条件去查询账务表
    * 由业务层调用，查询结果集存储到Bean对象，存储到List集合
    * 调用者传递2个日期字符串
    * */

    public List<ZhangWu> select(String starDate,String endDate){
        try {
            //拼写条件查询的SQL语句
            String sql = "SELECT * FROM hpm_zhangwu WHERE createtime BETWEEN ? AND ?";
            //定义对象数组，存储？占位符
            Object[] params = {starDate,endDate};
            //调用qr对象的方法query查询数据表，获取结果集
            return qr.query(sql,new BeanListHandler<>(ZhangWu.class),params);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("条件查询失败");
        }
    }

    /*
    * 定义方法，查询数据库，获取所有的账务数据
    * 方法由业务层调用
    * 结果集，将所有的账务数据存储到Bean对象中，存储到集合中
    * */

    public List<ZhangWu> selectAll(){
        try {
            //查询账务数据的SQL语句
            String sql = "SELECT * FROM hpm_zhangwu";
            //调用qr对象的方法query方法，结果集BeanLIstHandler
            List<ZhangWu> list = qr.query(sql,new BeanListHandler<>(ZhangWu.class));
            return list;
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("查询所有账务失败");
        }
    }

}
