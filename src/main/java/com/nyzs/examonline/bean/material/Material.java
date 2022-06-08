package com.nyzs.examonline.bean.material;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：表单提交实体类
 * @date ：2022/6/6 12:37
 */

public class Material {
    private int id;
    private String num;
    private String name;
    private String unit;
    private String materialType;
    private int materialNum;
    private Date logDate;

    public Material(String num, String name, String unit, String materialType, int materialNum) {
        this.num = num;
        this.name = name;
        this.unit = unit;
        this.materialType = materialType;
        this.materialNum = materialNum;

        this.logDate = new Date();
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
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

    @Override
    public String toString() {
        return "Material{" +
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
