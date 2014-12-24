package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.Servicedata;
import test.model.ServicedataExample;

public interface ServicedataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicedata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int countByExample(ServicedataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicedata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int deleteByExample(ServicedataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicedata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicedata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int insert(Servicedata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicedata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int insertSelective(Servicedata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicedata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    List<Servicedata> selectByExample(ServicedataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicedata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    Servicedata selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicedata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int updateByExampleSelective(@Param("record") Servicedata record, @Param("example") ServicedataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicedata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int updateByExample(@Param("record") Servicedata record, @Param("example") ServicedataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicedata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int updateByPrimaryKeySelective(Servicedata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table servicedata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int updateByPrimaryKey(Servicedata record);
}