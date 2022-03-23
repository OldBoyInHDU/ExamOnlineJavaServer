package com.nyzs.examonline.bean;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/3/23 15:41
 */
public class ExamPaper {
    private int questionIdx;
    private String questionContent;
    private String answer;
    private String examDate;

    @Override
    public String toString() {
        return "ExamPaper{" +
                "questionIdx=" + questionIdx +
                ", questionContent='" + questionContent + '\'' +
                ", answer='" + answer + '\'' +
                ", examDate='" + examDate + '\'' +
                '}';
    }

    public int getQuestionIdx() {
        return questionIdx;
    }

    public void setQuestionIdx(int questionIdx) {
        this.questionIdx = questionIdx;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }
}
