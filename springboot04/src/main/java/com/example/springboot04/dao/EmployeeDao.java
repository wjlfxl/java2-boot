package com.example.springboot04.dao;

import com.example.springboot04.pojo.Department;
import com.example.springboot04.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//员工DAO
//@Repository、@Service、@Controller，它们分别对应存储层Bean，业务层Bean，和展示层Bean。
@Repository //被spring托管
public class EmployeeDao {
    //模拟数据库中的数据
    private static Map<Integer, Employee> employees = null;
    //员工所属部门
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();//模拟一个部门创建表
        employees.put(1001, new Employee(1001, "张三", "11111@qq.com", 0, new Department(101, "开发部"), new Date()));
        employees.put(1002, new Employee(1002, "李斯", "11121@qq.com", 1, new Department(101, "开发部"), new Date()));
        employees.put(1003, new Employee(1003, "王五", "11151@qq.com", 0, new Department(101, "开发部"), new Date()));
        employees.put(1004, new Employee(1004, "张柳", "11181@qq.com", 1, new Department(101, "开发部"), new Date()));
        employees.put(1005, new Employee(1005, "姚琪", "11191@qq.com", 0, new Department(101, "开发部"), new Date()));
    }


    //主键自增!
    private static Integer initId = 1006;

    //增加一个员工
    public void save(Employee employee){
        if (employee.getId()==null) {
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }

    //获得所有员工信息
    public Collection<Employee> getEmployee(){
        return employees.values();
    }

    //通过id得到员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    //通过id得到员工
    public Employee delete(Integer id){
        return employees.remove(id);
    }

}