package cn.gov.yrcc.mapper;

import cn.gov.yrcc.model.RoleMenu;
import cn.gov.yrcc.model.RoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuMapper {
    long countByExample(RoleMenuExample example);

    int deleteByExample(RoleMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenu row);

    int insertSelective(RoleMenu row);

    List<RoleMenu> selectByExample(RoleMenuExample example);

    RoleMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") RoleMenu row, @Param("example") RoleMenuExample example);

    int updateByExample(@Param("row") RoleMenu row, @Param("example") RoleMenuExample example);

    int updateByPrimaryKeySelective(RoleMenu row);

    int updateByPrimaryKey(RoleMenu row);
}