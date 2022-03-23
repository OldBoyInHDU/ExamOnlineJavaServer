package com.nyzs.examonline.controller;


import com.nyzs.examonline.bean.Employee;
import com.nyzs.examonline.bean.dto.ResponseResult;
import com.nyzs.examonline.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;



    /**
     * 获取所有要考试的员工
     * @return
     */
    @RequestMapping("/employee")
    public ResponseResult getEmployee() {
        try {
            return ResponseResult.ok(employeeService.getAllEmployee());
        } catch (Exception e) {
            e.printStackTrace();

        }
        return ResponseResult.failed("获取所有员工失败");
    }


    /**
     * 根据工号，查员工
     * @param num
     * @return
     */
    @RequestMapping(value = "/getEmployeeByNum", method = RequestMethod.GET)
    public ResponseResult getEmployeeByNum(int num) {
        try {
            return ResponseResult.ok(employeeService.getEmployeeByNum(num));
        } catch (Exception e) {
            e.printStackTrace();

        }
        return ResponseResult.failed("通过工号获取员工失败");

    }


}
