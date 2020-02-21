package com.check.mapperInterface;

import com.check.entities.CheckFlow;
import com.check.entities.CheckFlowExample;
import com.check.entities.CheckFlowWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckFlowMapper {
    int countByExample(CheckFlowExample example);

    int deleteByExample(CheckFlowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CheckFlowWithBLOBs record);

    int insertSelective(CheckFlowWithBLOBs record);

    List<CheckFlowWithBLOBs> selectByExampleWithBLOBs(CheckFlowExample example);

    List<CheckFlow> selectByExample(CheckFlowExample example);

    CheckFlowWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CheckFlowWithBLOBs record, @Param("example") CheckFlowExample example);

    int updateByExampleWithBLOBs(@Param("record") CheckFlowWithBLOBs record, @Param("example") CheckFlowExample example);

    int updateByExample(@Param("record") CheckFlow record, @Param("example") CheckFlowExample example);

    int updateByPrimaryKeySelective(CheckFlowWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CheckFlowWithBLOBs record);

    int updateByPrimaryKey(CheckFlow record);
}