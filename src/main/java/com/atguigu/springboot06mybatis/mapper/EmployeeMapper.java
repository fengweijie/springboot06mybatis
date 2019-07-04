package com.atguigu.springboot06mybatis.mapper;

import com.atguigu.springboot06mybatis.bean.Employee;

public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);


}
