package com.ufgov.data.transport.datatransport.serviceimpl;

import com.ufgov.data.transport.datatransport.Mapper.APDataTransportMapper;
import com.ufgov.data.transport.datatransport.service.IAPDataTransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APDataTransportServiceImpl implements IAPDataTransportService {

    @Autowired
    APDataTransportMapper apDataTransportMapper ;

    @Override
    public List getDataBySql(String sql) {
        System.out.println(sql);
        return apDataTransportMapper.getDataBySql(sql);
    }
}
