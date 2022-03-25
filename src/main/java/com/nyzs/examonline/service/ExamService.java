package com.nyzs.examonline.service;

import com.nyzs.examonline.bean.EmployeeGrades;
import com.nyzs.examonline.bean.ExamPaper;
import com.nyzs.examonline.dao.ExamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/3/20 16:46
 */

@Service
public class ExamService {

    @Autowired
    ExamDao examDao;


    public String getExamDate() throws Exception {
        return examDao.getExamDate();
    }

    public EmployeeGrades getExamStatus(String num, String examdate) throws Exception {
        return examDao.getExamStatus(num, examdate);
    }

    public void generateExamPaper(String examdate) throws Exception {
        examDao.generateExamPaper(examdate);
    }

    public List<ExamPaper> getExamPaperByExamDate(String examdate) throws Exception {
        return examDao.getExamPaperByExamDate(examdate);
    }

    public void updateExamDate(String examdate) throws Exception {
        examDao.updateExamDate(examdate);
    }

    public void recordGrades(EmployeeGrades employeeGrades) throws Exception {
        examDao.recordGrades(employeeGrades);
    }

    public List<EmployeeGrades> getAllGrades() throws Exception {
        return examDao.getAllGrades();
    }

    public List<EmployeeGrades> getGradesByName(String name) throws Exception {
        return examDao.getGradesByName(name);
    }
}
