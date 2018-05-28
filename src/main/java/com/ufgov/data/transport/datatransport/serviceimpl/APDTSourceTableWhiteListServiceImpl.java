package com.ufgov.data.transport.datatransport.serviceimpl;

import com.ufgov.data.transport.datatransport.Mapper.APDTSourceTableWhiteListMapper;
import com.ufgov.data.transport.datatransport.service.IAPDTSourceTableWhiteListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class APDTSourceTableWhiteListServiceImpl implements IAPDTSourceTableWhiteListService {

    @Autowired
    APDTSourceTableWhiteListMapper apdtSourceTableWhiteListMapper;

    @Override
    public List getTableNamesBySourceId(String sourceId) {
        return apdtSourceTableWhiteListMapper.getTableNamesBySourceId(sourceId);
    }
}
