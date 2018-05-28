package com.ufgov.data.transport.datatransport.controller;

import com.ufgov.data.transport.datatransport.service.IAPDTSourceTableWhiteListService;
import com.ufgov.data.transport.datatransport.service.IAPDataTransportClientService;
import com.ufgov.data.transport.datatransport.service.IAPRestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class APTestController {

    @Autowired
    IAPDTSourceTableWhiteListService iapdtSourceTableWhiteListService;

    @Autowired
    IAPRestClientService iapRestClientService;

    @Autowired
    IAPDataTransportClientService dataTransportClientService;

    @RequestMapping(value = "/test1")
    public Object test1(){
        System.out.println("进入客户端获取白名单表");
        String tableColSql = dataTransportClientService.getWhiteListTableColsSqlBySourceId("1");
//        iapRestClientService
//        发送sql查询表结构
        iapRestClientService.sendMessage(tableColSql);
        return null;
    }
}
