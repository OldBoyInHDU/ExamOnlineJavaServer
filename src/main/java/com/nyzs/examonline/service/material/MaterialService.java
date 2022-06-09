package com.nyzs.examonline.service.material;

import com.nyzs.examonline.bean.material.LogDTO;
import com.nyzs.examonline.bean.material.Material;
import com.nyzs.examonline.bean.material.StockDTO;
import com.nyzs.examonline.dao.material.MaterialDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：RukiHuang
 * @description：
 * @date ：2022/6/6 14:23
 */
@Service
public class MaterialService {

    @Autowired
    MaterialDao materialDao;

    public void saveFormLog(Material material) throws Exception {
        materialDao.saveFormLog(material);
        //最新的库存数量
        int latestNum = materialDao.getStockInfoByMaterialType(material.getMaterialType());
        //更新库存数量
        StockDTO stockDTO = new StockDTO(material.getMaterialType(), latestNum - material.getMaterialNum());
        materialDao.updateStockInfo(stockDTO);
    }

    public void updateStockInfo(String materialType, int stockNum) throws Exception {
        int latestNum = materialDao.getStockInfoByMaterialType(materialType);
        StockDTO stockDTO = new StockDTO(materialType, latestNum + stockNum);
        materialDao.updateStockInfo(stockDTO);
    }

    public List<StockDTO> getStockInfo(String materialTypeSearch) throws Exception {
        return materialDao.getStockInfo(materialTypeSearch);
    }

    public List<LogDTO> getLogInfo(String name, String unit) throws Exception {
        return materialDao.getLogInfo(name, unit);
    }

    public List<String> getLatestMaterialTypes() throws Exception {
        return materialDao.getLatestMaterialTypes();
    }


    public void addNewMaterialType(String newMaterialType, int newMaterialTypeNum) throws Exception {
        StockDTO stockDTO = new StockDTO(newMaterialType, newMaterialTypeNum);
        materialDao.addNewMaterialType(stockDTO);
    }
}
