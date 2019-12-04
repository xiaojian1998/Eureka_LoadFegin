package com.company.cloud.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProviderOneController {
    @RequestMapping("list")
    public String getList(){
        return "测试负载One  成功";
    }
}
