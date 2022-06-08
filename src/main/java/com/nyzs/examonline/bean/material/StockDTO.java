package com.nyzs.examonline.bean.material;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：RukiHuang
 * @description：库存
 * @date ：2022/6/7 10:08
 */
public class StockDTO {
    private int id;
    private String materialType;
    private int materialStockNum;
    private String lastUpdateDate;

    public StockDTO(String materialType, int materialStockNum) {
        this.materialType = materialType;
        this.materialStockNum = materialStockNum;
    }

    public StockDTO(int id, String materialType, int materialStockNum, String lastUpdateDate) {
        this.id = id;
        this.materialType = materialType;
        this.materialStockNum = materialStockNum;
        this.lastUpdateDate = lastUpdateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public int getMaterialStockNum() {
        return materialStockNum;
    }

    public void setMaterialStockNum(int materialStockNum) {
        this.materialStockNum = materialStockNum;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "StockDTO{" +
                "id=" + id +
                ", materialType='" + materialType + '\'' +
                ", materialStockNum=" + materialStockNum +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
