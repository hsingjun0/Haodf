package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.Doctordata;
import test.model.DoctordataExample;

public interface DoctordataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctordata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int countByExample(DoctordataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctordata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int deleteByExample(DoctordataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctordata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctordata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int insert(Doctordata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctordata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int insertSelective(Doctordata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctordata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    List<Doctordata> selectByExample(DoctordataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctordata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    Doctordata selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctordata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int updateByExampleSelective(@Param("record") Doctordata record, @Param("example") DoctordataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctordata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int updateByExample(@Param("record") Doctordata record, @Param("example") DoctordataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctordata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int updateByPrimaryKeySelective(Doctordata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctordata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    int updateByPrimaryKey(Doctordata record);
}