package com.company.cloud.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provider-server")
public interface FeginService {
    @RequestMapping("list")
    public String getList();
}
