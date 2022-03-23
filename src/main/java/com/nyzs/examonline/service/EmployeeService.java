package com.nyzs.examonline.service;

import com.nyzs.examonline.bean.Employee;
import com.nyzs.examonline.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> getAllEmployee() throws Exception {
        return employeeDao.getAllEmployee();
    }

    public Employee getEmployeeByNum(int empNum) throws Exception {
        return employeeDao.getEmployeeByNum(empNum);
    }


}
