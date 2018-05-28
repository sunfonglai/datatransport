package com.ufgov.data.transport.datatransport.Mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface APDataTransportMapper {
    List getDataBySql(@Param(value="sql")String sql);
}
