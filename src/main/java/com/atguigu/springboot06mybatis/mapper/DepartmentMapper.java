package com.atguigu.springboot06mybatis.mapper;

import com.atguigu.springboot06mybatis.bean.Department;
import org.apache.ibatis.annotations.*;

//说明这个数据库的mapper的映射
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values (#{departmentName})")
    public int insertDept(Department departement);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department departmentName);




}
