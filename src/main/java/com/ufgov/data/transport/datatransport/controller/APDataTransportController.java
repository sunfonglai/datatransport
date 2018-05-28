package com.ufgov.data.transport.datatransport.controller;

import com.ufgov.data.transport.datatransport.service.IAPDataTransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/data")
public class APDataTransportController {

    @Autowired
    IAPDataTransportService iapDataTransportService;

    @RequestMapping(value = "getDataBySql",method = RequestMethod.POST)
    public Object getData(String sql){
        System.out.println("接收到请求");
        if ("".equals(sql)){
            System.out.println("请求内容为空");
            return null;}
        return iapDataTransportService.getDataBySql(sql);
    }
}
