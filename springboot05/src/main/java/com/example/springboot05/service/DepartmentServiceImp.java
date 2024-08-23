package com.example.springboot05.service;

import com.example.springboot05.mapper.DepartmentMapper;
import com.example.springboot05.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DepartmentService")
public class DepartmentServiceImp implements DepartmentService{
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> queryDepartmentList() {
        return departmentMapper.queryDepartmentList();
    }

    @Override
    public Department departmentById(Integer id) {
        return departmentMapper.departmentById(id);
    }
}
