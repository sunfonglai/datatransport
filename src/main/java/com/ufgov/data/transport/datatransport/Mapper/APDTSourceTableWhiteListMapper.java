package com.ufgov.data.transport.datatransport.Mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface APDTSourceTableWhiteListMapper {

    List getTableNamesBySourceId(@Param(value = "sourceId") String sourceId);
}
