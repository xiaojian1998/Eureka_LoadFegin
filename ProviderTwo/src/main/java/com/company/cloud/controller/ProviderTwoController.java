package com.company.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderTwoController {

    @RequestMapping("list")
    public String getList(){
        return "测试负载Two  成功";
    }
}
