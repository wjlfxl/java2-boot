package com.example.springboot05.service;

import com.example.springboot05.mapper.EmployeeMapper;
import com.example.springboot05.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EmployeeService")
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryEmployeeList() {
        return employeeMapper.queryEmployeeList();
    }

    @Override
    public Employee employeeById(Integer id) {
        return employeeMapper.employeeById(id);
    }

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public int upDateEmployee(Employee employee) {
        return employeeMapper.upDateEmployee(employee);
    }

    @Override
    public int deleteEmployee(Integer id) {
        return employeeMapper.deleteEmployee(id);
    }
}
