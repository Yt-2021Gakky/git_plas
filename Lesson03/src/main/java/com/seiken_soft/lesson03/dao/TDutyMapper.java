package com.seiken_soft.lesson03.dao;

import com.seiken_soft.lesson03.entity.TDuty;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDutyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    int deleteByPrimaryKey(@Param("employeeId") String employeeId, @Param("dutyMonth") String dutyMonth, @Param("dutyWorkTimeFrom") Date dutyWorkTimeFrom);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    int insert(TDuty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    TDuty selectByPrimaryKey(@Param("employeeId") String employeeId, @Param("dutyMonth") String dutyMonth, @Param("dutyWorkTimeFrom") Date dutyWorkTimeFrom);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    List<TDuty> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_duty
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    int updateByPrimaryKey(TDuty record);
}