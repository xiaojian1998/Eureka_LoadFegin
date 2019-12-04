package com.company.cloud.controller;

import com.company.cloud.fegin.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginController {
    @Autowired
    private FeginService feginService;
    @RequestMapping("list")
    public String getList(){
        return feginService.getList();
    }

}
