package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.Doctor;
import test.model.DoctorExample;

public interface DoctorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Thu Dec 18 15:38:40 CST 2014
     */
    int countByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Thu Dec 18 15:38:40 CST 2014
     */
    int deleteByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Thu Dec 18 15:38:40 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Thu Dec 18 15:38:40 CST 2014
     */
    int insert(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Thu Dec 18 15:38:40 CST 2014
     */
    int insertSelective(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Thu Dec 18 15:38:40 CST 2014
     */
    List<Doctor> selectByExample(DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Thu Dec 18 15:38:40 CST 2014
     */
    Doctor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Thu Dec 18 15:38:40 CST 2014
     */
    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Thu Dec 18 15:38:40 CST 2014
     */
    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Thu Dec 18 15:38:40 CST 2014
     */
    int updateByPrimaryKeySelective(Doctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor
     *
     * @mbggenerated Thu Dec 18 15:38:40 CST 2014
     */
    int updateByPrimaryKey(Doctor record);
}