package cn.gov.yrcc.mapper;

import cn.gov.yrcc.model.RolePermission;
import cn.gov.yrcc.model.RolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePermissionMapper {
    long countByExample(RolePermissionExample example);

    int deleteByExample(RolePermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolePermission row);

    int insertSelective(RolePermission row);

    List<RolePermission> selectByExample(RolePermissionExample example);

    RolePermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") RolePermission row, @Param("example") RolePermissionExample example);

    int updateByExample(@Param("row") RolePermission row, @Param("example") RolePermissionExample example);

    int updateByPrimaryKeySelective(RolePermission row);

    int updateByPrimaryKey(RolePermission row);
}