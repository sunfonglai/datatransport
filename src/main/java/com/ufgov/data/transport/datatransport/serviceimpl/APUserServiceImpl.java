package com.ufgov.data.transport.datatransport.serviceimpl;

import com.ufgov.data.transport.datatransport.Mapper.APUserMapper;
import com.ufgov.data.transport.datatransport.entity.APUser;
import com.ufgov.data.transport.datatransport.service.IAPUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class APUserServiceImpl implements IAPUserService {

    @Autowired
    APUserMapper userMapperDao ;

    @Override
    public APUser getUserById(String userId){
        System.out.println("进入service");
        return userMapperDao.getAPUserById(userId);
    }
}
