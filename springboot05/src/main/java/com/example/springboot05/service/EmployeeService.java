package com.example.springboot05.service;

import com.example.springboot05.pojo.Employee;

import java.util.List;


public interface EmployeeService {
    //得到全部员工列表
    List<Employee> queryEmployeeList();

    //通过id获得员工
    Employee employeeById(Integer id);

    //添加员工
    int addEmployee(Employee employee);

    //修改员工
    int upDateEmployee(Employee employee);

    //删除员工
    int deleteEmployee(Integer id);

}
