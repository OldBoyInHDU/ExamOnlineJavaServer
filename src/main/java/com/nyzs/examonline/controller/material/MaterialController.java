package com.nyzs.examonline.controller.material;

import com.nyzs.examonline.bean.dto.ResponseResult;
import com.nyzs.examonline.bean.material.LogDTO;
import com.nyzs.examonline.bean.material.Material;
import com.nyzs.examonline.bean.material.StockDTO;
import com.nyzs.examonline.service.material.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.MediaSize;
import java.util.List;

/**
 * @author ：RukiHuang
 * @description：物料登记的controller
 * @date ：2022/6/6 12:34
 */
@RestController
public class MaterialController {

    @Autowired
    MaterialService materialService;

    @RequestMapping(value = "/getLatestMaterialTypes", method = RequestMethod.GET)
    public ResponseResult getLatestMaterialTypes() {
        try {
            List<String> materialTypes = materialService.getLatestMaterialTypes();
            return ResponseResult.ok(materialTypes, "物料品类查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.failed(e.getMessage());
        }
    }

    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    public ResponseResult submitForm(String num, String name, String unit, String materialType, int materialNum) {
        Material material = new Material(num, name, unit, materialType, materialNum);
        try {
            materialService.saveFormLog(material);
            return ResponseResult.ok("表单提交成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.failed(e.getMessage());
        }

    }

    @RequestMapping(value = "/addNewMaterialType", method = RequestMethod.POST)
    public ResponseResult addNewMaterialType(String newMaterialType, int newMaterialTypeNum) {
        try {
            materialService.addNewMaterialType(newMaterialType, newMaterialTypeNum);
            return ResponseResult.ok("品类新增成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.failed(e.getMessage());
        }
    }

    @RequestMapping(value = "/updateStockInfo", method = RequestMethod.POST)
    public ResponseResult updateStockInfo(String materialType, int stockNum) {
        try {
            materialService.updateStockInfo(materialType, stockNum);
            return ResponseResult.ok("库存更新成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.failed(e.getMessage());
        }

    }

    @RequestMapping(value = "/getStockInfo", method = RequestMethod.GET)
    public ResponseResult getStockInfo(String materialTypeSearch) {
        try {
            List<StockDTO> stockDTOList = materialService.getStockInfo(materialTypeSearch);
            return ResponseResult.ok(stockDTOList, "库存查询成功");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.failed(e.getMessage());
        }
    }

    @RequestMapping(value = "/getLogInfo", method = RequestMethod.GET)
    public ResponseResult getLogInfo(String name, String unit) {
        try {
            List<LogDTO> logDTOList = materialService.getLogInfo(name, unit);
            return ResponseResult.ok(logDTOList, "领用查询完成");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.failed(e.getMessage());
        }
    }
}
