package cn.gov.yrcc.mapper;

import cn.gov.yrcc.model.UserPermission;
import cn.gov.yrcc.model.UserPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPermissionMapper {
    long countByExample(UserPermissionExample example);

    int deleteByExample(UserPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPermission row);

    int insertSelective(UserPermission row);

    List<UserPermission> selectByExample(UserPermissionExample example);

    UserPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UserPermission row, @Param("example") UserPermissionExample example);

    int updateByExample(@Param("row") UserPermission row, @Param("example") UserPermissionExample example);

    int updateByPrimaryKeySelective(UserPermission row);

    int updateByPrimaryKey(UserPermission row);
}