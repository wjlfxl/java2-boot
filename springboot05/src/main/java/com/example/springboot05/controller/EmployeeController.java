package com.example.springboot05.controller;

import com.example.springboot05.pojo.Department;
import com.example.springboot05.pojo.Employee;
import com.example.springboot05.service.DepartmentService;
import com.example.springboot05.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    DepartmentService departmentService;
    @Autowired
    EmployeeService employeeService;

    //得到全部的员工
    @RequestMapping("/emps")
    public String list(Model model){
        List<Employee> employees =employeeService.queryEmployeeList();
        model.addAttribute("emps",employees);
        return "emp/list";
    }


    //添加
    @PostMapping("/toAdd")
    public String toAddEmp(){
        return "emp/add";
    }
    //添加员工
    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //添加的操作
        employeeService.addEmployee(employee);   //调用底层业务方法保存员工的信息
        return "redirect:/emps";
    }

    //去员工的修改页面
    @GetMapping("/update/{id}")
    public String toUpDate(@PathVariable("id") int id, Model model){
        //添加的操作
        Employee employee=employeeService.employeeById(id);
        model.addAttribute("emp",employee);

        //查出所有部门信息
        List<Department> departments=departmentService.queryDepartmentList();
        model.addAttribute("deps",departments);
        return "emp/update";
    }

    //修改完成
    @PostMapping("/updateEmp")
    public String upDateEmp(Employee employee){
        //修改的操作
        employeeService.upDateEmployee(employee);   //调用底层业务方法保存员工的信息
        return "/emps";
    }

    //删除
    @GetMapping("/del/{id}")
    public String del(@PathVariable("id") int id){
        //删除的操作
        employeeService.deleteEmployee(id);

        return "redirect:/emps";
    }
}
