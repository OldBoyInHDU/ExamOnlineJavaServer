package com.nyzs.examonline.dao;


import com.nyzs.examonline.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeDao {

    List<Employee> getAllEmployee() throws Exception;

    Employee getEmployeeByNum(int empNum) throws Exception;



}
