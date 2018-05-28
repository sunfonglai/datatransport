package com.ufgov.data.transport.datatransport.serviceimpl;

import com.ufgov.data.transport.datatransport.service.IAPDTSourceTableWhiteListService;
import com.ufgov.data.transport.datatransport.service.IAPDataTransportClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class APDataTransClientServiceImpl implements IAPDataTransportClientService {

    @Autowired
    IAPDTSourceTableWhiteListService whiteListService;


    @Override
    public String getWhiteListTableColsSqlBySourceId(String sourceId) {
        List tableList = whiteListService.getTableNamesBySourceId(sourceId);
        StringBuffer sb = new StringBuffer("SELECT T.TABLE_NAME ,T.COLUMN_NAME ,T.DATA_TYPE FROM USER_TAB_COLUMNS T WHERE T.TABLE_NAME IN ( ");
        for (int i = 0; i <tableList.size() ; i++) {
            Map <String,String> table = (Map<String, String>) tableList.get(i);
            sb.append("'"+table.get("TABLE_NAME").toString()+"',");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        return sb.toString();
    }


}
