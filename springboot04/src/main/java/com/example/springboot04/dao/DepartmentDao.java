package com.example.springboot04.dao;

import com.example.springboot04.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//部门dao
@Repository //被spring托管
public class DepartmentDao {

    //模拟数据库中的数据
    private static Map<Integer, Department> departments=null;
    static {
        departments=new HashMap<Integer,Department>();//模拟一个部门创建表
        departments.put(101,new Department(101,"开发部"));
        departments.put(102,new Department(102,"设计部"));
        departments.put(103,new Department(103,"销售部"));
        departments.put(104,new Department(104,"组织部"));
    }

    //获得所有部门信息
    public Collection<Department> getDepartment(){
        return departments.values();
    }

    //通过id得到部门
    public Department getDepartmentById(Integer id){
        return departments.get(id);
    }
}
