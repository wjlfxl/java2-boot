package com.example.springboot04.controller;

import com.example.springboot04.dao.DepartmentDao;
import com.example.springboot04.dao.EmployeeDao;
import com.example.springboot04.pojo.Department;
import com.example.springboot04.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("/emps")
    public String list(Model model){
        Collection<Employee> employee =employeeDao.getEmployee();
        model.addAttribute("emps",employee);
        return "emp/list";
    }

    @GetMapping ("/emp")
    public String toAddPage(Model model){
        //查出所有部门信息
        Collection<Department> departments=departmentDao.getDepartment();
        model.addAttribute("deps",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //添加的操作
        employeeDao.save(employee);   //调用底层业务方法保存员工的信息
        return "redirect:/emps";
    }

    //去员工的修改页面
    @GetMapping("/update/{id}")
    public String toUpDate(@PathVariable("id") int id, Model model){
        //添加的操作
        Employee employee=employeeDao.getEmployeeById(id);
        model.addAttribute("emp",employee);

        //查出所有部门信息
        Collection<Department> departments=departmentDao.getDepartment();
        model.addAttribute("deps",departments);
        return "emp/update";
    }

    //修改完成
    @PostMapping("/updateEmp")
    public String upDateEmp(Employee employee){
        //添加的操作
        employeeDao.save(employee);   //调用底层业务方法保存员工的信息
        return "redirect:/emps";
    }

    //删除
    @GetMapping("/del/{id}")
    public String del(@PathVariable("id") int id){
        //添加的操作
        employeeDao.delete(id);

        return "redirect:/emps";
    }
}
