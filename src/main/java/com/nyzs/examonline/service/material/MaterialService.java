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
    }

    public void updateStockInfo(String materialType, int stockNum) throws Exception {
        int lastNum = materialDao.getStockInfoByMaterialType(materialType);
        StockDTO stockDTO = new StockDTO(materialType, lastNum + stockNum);
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
