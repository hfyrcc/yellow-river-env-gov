package cn.gov.yrcc.mapper;

import cn.gov.yrcc.model.Dictionary;
import cn.gov.yrcc.model.DictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryMapper {
    long countByExample(DictionaryExample example);

    int deleteByExample(DictionaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dictionary row);

    int insertSelective(Dictionary row);

    List<Dictionary> selectByExample(DictionaryExample example);

    Dictionary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Dictionary row, @Param("example") DictionaryExample example);

    int updateByExample(@Param("row") Dictionary row, @Param("example") DictionaryExample example);

    int updateByPrimaryKeySelective(Dictionary row);

    int updateByPrimaryKey(Dictionary row);
}