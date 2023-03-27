package cn.gov.yrcc.mapper;

import cn.gov.yrcc.model.MenuPermission;
import cn.gov.yrcc.model.MenuPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuPermissionMapper {
    long countByExample(MenuPermissionExample example);

    int deleteByExample(MenuPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MenuPermission row);

    int insertSelective(MenuPermission row);

    List<MenuPermission> selectByExample(MenuPermissionExample example);

    MenuPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") MenuPermission row, @Param("example") MenuPermissionExample example);

    int updateByExample(@Param("row") MenuPermission row, @Param("example") MenuPermissionExample example);

    int updateByPrimaryKeySelective(MenuPermission row);

    int updateByPrimaryKey(MenuPermission row);
}