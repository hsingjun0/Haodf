package test.model;

public class Hospitalinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospitalinfo.id
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospitalinfo.hospitalName
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    private String hospitalname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospitalinfo.level
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    private String level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospitalinfo.address
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospitalinfo.city
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    private String city;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospitalinfo.id
     *
     * @return the value of hospitalinfo.id
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospitalinfo.id
     *
     * @param id the value for hospitalinfo.id
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospitalinfo.hospitalName
     *
     * @return the value of hospitalinfo.hospitalName
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    public String getHospitalname() {
        return hospitalname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospitalinfo.hospitalName
     *
     * @param hospitalname the value for hospitalinfo.hospitalName
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname == null ? null : hospitalname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospitalinfo.level
     *
     * @return the value of hospitalinfo.level
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospitalinfo.level
     *
     * @param level the value for hospitalinfo.level
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospitalinfo.address
     *
     * @return the value of hospitalinfo.address
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospitalinfo.address
     *
     * @param address the value for hospitalinfo.address
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospitalinfo.city
     *
     * @return the value of hospitalinfo.city
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospitalinfo.city
     *
     * @param city the value for hospitalinfo.city
     *
     * @mbggenerated Wed Dec 24 14:15:35 CST 2014
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }
}