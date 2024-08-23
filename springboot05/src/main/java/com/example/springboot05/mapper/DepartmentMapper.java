package com.example.springboot05.mapper;

import com.example.springboot05.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@mapper是给mybatis看的，@repository是给spring扫描组件注册到IOC容器里面用的

@Mapper
@Repository   //表示这是dao层，只有需要用到mybatis时才用到
public interface DepartmentMapper {
    List<Department> queryDepartmentList();

    Department departmentById(Integer id);
}
