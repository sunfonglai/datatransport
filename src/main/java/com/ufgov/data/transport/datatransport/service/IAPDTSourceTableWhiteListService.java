package com.ufgov.data.transport.datatransport.service;

import java.util.List;

public interface IAPDTSourceTableWhiteListService {

    List getTableNamesBySourceId(String sourceId);
}
