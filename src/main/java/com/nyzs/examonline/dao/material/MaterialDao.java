package com.nyzs.examonline.dao.material;

import com.nyzs.examonline.bean.material.LogDTO;
import com.nyzs.examonline.bean.material.Material;
import com.nyzs.examonline.bean.material.StockDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MaterialDao {
    void saveFormLog(Material material) throws Exception;

    void updateStockInfo(StockDTO stockDTO) throws Exception;

    int getStockInfoByMaterialType(String materialType) throws Exception;

    List<StockDTO> getStockInfo(String materialTypeSearch) throws Exception;

    List<LogDTO> getLogInfo(String name, String unit) throws Exception;

    List<String> getLatestMaterialTypes() throws Exception;

    void addNewMaterialType(StockDTO stockDTO) throws Exception;
}
