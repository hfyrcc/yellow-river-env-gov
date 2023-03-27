package cn.gov.yrcc.mapper;

import cn.gov.yrcc.model.UserRole;
import cn.gov.yrcc.model.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    long countByExample(UserRoleExample example);

    int deleteByExample(UserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRole row);

    int insertSelective(UserRole row);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") UserRole row, @Param("example") UserRoleExample example);

    int updateByExample(@Param("row") UserRole row, @Param("example") UserRoleExample example);

    int updateByPrimaryKeySelective(UserRole row);

    int updateByPrimaryKey(UserRole row);
}