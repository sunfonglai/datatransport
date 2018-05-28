package com.ufgov.data.transport.datatransport.controller;

import com.ufgov.data.transport.datatransport.entity.APUser;
import com.ufgov.data.transport.datatransport.service.IAPUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
@RequestMapping(value = "/user")
public class APUserController {

    @Autowired
    private IAPUserService iapUserService;

//    @ResponseBody
    @RequestMapping(value = "/getUser", method=RequestMethod.GET)
    public String getUser(){
        System.out.println("进入Controller");
        APUser apUser = iapUserService.getUserById("1");
        return apUser.toString();
    }
}
