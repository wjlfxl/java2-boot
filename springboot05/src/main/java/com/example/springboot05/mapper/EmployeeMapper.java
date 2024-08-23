package com.example.springboot05.mapper;

import com.example.springboot05.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个mybatis的mapper类;   dao层
@Mapper
@Repository    //表示这是dao层，只有需要用到mybatis时才用到
public interface EmployeeMapper {

    List<Employee> queryEmployeeList();

    Employee employeeById(Integer id);

    int addEmployee(Employee employee);

    int deleteEmployee(Integer id);

    int upDateEmployee(Employee employee);

}
