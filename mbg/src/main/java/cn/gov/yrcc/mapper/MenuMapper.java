package cn.gov.yrcc.mapper;

import cn.gov.yrcc.model.Menu;
import cn.gov.yrcc.model.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu row);

    int insertSelective(Menu row);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Menu row, @Param("example") MenuExample example);

    int updateByExample(@Param("row") Menu row, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu row);

    int updateByPrimaryKey(Menu row);
}