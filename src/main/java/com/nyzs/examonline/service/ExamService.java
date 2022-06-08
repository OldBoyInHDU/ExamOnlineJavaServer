package com.nyzs.examonline.service;

import com.nyzs.examonline.bean.EmployeeGrades;
import com.nyzs.examonline.bean.ExamPaper;
import com.nyzs.examonline.controller.ExamController;
import com.nyzs.examonline.dao.ExamDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：
 * @date ：2022/3/20 16:46
 */

@Service
public class ExamService {

    private static Logger logger = LoggerFactory.getLogger(ExamService.class);

    @Autowired
    ExamDao examDao;

    @Autowired
    RedisTemplate redisTemplate;


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

        /*String key = "paper:" + examdate;
        System.out.println("key:" + key);
        Object paperObject = redisTemplate.opsForValue().get(key);
        System.out.println("paperObject:" + paperObject);
        if(paperObject ==null) {
            System.out.println("进入redis");
            synchronized (this.getClass()) {
                paperObject = redisTemplate.opsForValue().get(key);
                if(paperObject == null) {
                    logger.info("---------查询数据库--------");
                    List<ExamPaper> paper = examDao.getExamPaperByExamDate(examdate);
                    redisTemplate.opsForValue().set(key, paper);
                    return paper;
                } else {
                    logger.info("---------查询缓存，同步代码块--------");
                }
            }
        } else {
            System.out.println("没进缓存");
            logger.info("---------没进缓存--------");
        }
        return (List<ExamPaper>)paperObject;*/

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

    public List<EmployeeGrades> getGradesByNameOrExamDate(String name, String examDate) throws Exception {
        return examDao.getGradesByNameOrExamDate(name, examDate);
    }
}
