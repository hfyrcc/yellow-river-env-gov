package cn.gov.yrcc.mapper;

import cn.gov.yrcc.model.JobPosition;
import cn.gov.yrcc.model.JobPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobPositionMapper {
    long countByExample(JobPositionExample example);

    int deleteByExample(JobPositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobPosition row);

    int insertSelective(JobPosition row);

    List<JobPosition> selectByExampleWithBLOBs(JobPositionExample example);

    List<JobPosition> selectByExample(JobPositionExample example);

    JobPosition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") JobPosition row, @Param("example") JobPositionExample example);

    int updateByExampleWithBLOBs(@Param("row") JobPosition row, @Param("example") JobPositionExample example);

    int updateByExample(@Param("row") JobPosition row, @Param("example") JobPositionExample example);

    int updateByPrimaryKeySelective(JobPosition row);

    int updateByPrimaryKeyWithBLOBs(JobPosition row);

    int updateByPrimaryKey(JobPosition row);
}