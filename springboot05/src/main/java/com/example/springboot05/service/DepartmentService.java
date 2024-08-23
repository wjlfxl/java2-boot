package com.example.springboot05.service;

import com.example.springboot05.pojo.Department;


import java.util.List;

public interface DepartmentService {
    //获得全部部门
    List<Department> queryDepartmentList();

    //通过id获得部门
    Department departmentById(Integer id);
}
