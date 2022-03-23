package com.nyzs.examonline.dao;

import com.nyzs.examonline.bean.EmployeeGrades;
import com.nyzs.examonline.bean.ExamPaper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExamDao {

    String getExamDate() throws Exception;

    EmployeeGrades getExamStatus(String num, String examdate) throws Exception;

    List<ExamPaper> generateExamPaper(String examdate) throws Exception;

    List<ExamPaper> getExamPaperByExamDate(String examdate) throws Exception;
}
