package com.nyzs.examonline.bean.material;

/**
 * @author ：RukiHuang
 * @description：领用查询
 * @date ：2022/6/7 13:28
 */
public class LogDTO {
    private int id;
    private String num;
    private String name;
    private String unit;
    private String materialType;
    private int materialNum;
    private String logDate;

    public LogDTO(String num, String name) {
        this.num = num;
        this.name = name;
    }

    public LogDTO(int id, String num, String name, String unit, String materialType, int materialNum, String logDate) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.unit = unit;
        this.materialType = materialType;
        this.materialNum = materialNum;
        this.logDate = logDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public int getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(int materialNum) {
        this.materialNum = materialNum;
    }

    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    @Override
    public String toString() {
        return "LogDTO{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", materialType='" + materialType + '\'' +
                ", materialNum=" + materialNum +
                ", logDate='" + logDate + '\'' +
                '}';
    }
}
