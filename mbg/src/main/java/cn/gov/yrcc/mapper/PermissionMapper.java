package cn.gov.yrcc.mapper;

import cn.gov.yrcc.model.Permission;
import cn.gov.yrcc.model.PermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper {
    long countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Permission row);

    int insertSelective(Permission row);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Permission row, @Param("example") PermissionExample example);

    int updateByExample(@Param("row") Permission row, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission row);

    int updateByPrimaryKey(Permission row);
}