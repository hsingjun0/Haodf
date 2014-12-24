package test.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentdataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    public PaymentdataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andActioncodeIsNull() {
            addCriterion("actioncode is null");
            return (Criteria) this;
        }

        public Criteria andActioncodeIsNotNull() {
            addCriterion("actioncode is not null");
            return (Criteria) this;
        }

        public Criteria andActioncodeEqualTo(String value) {
            addCriterion("actioncode =", value, "actioncode");
            return (Criteria) this;
        }

        public Criteria andActioncodeNotEqualTo(String value) {
            addCriterion("actioncode <>", value, "actioncode");
            return (Criteria) this;
        }

        public Criteria andActioncodeGreaterThan(String value) {
            addCriterion("actioncode >", value, "actioncode");
            return (Criteria) this;
        }

        public Criteria andActioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("actioncode >=", value, "actioncode");
            return (Criteria) this;
        }

        public Criteria andActioncodeLessThan(String value) {
            addCriterion("actioncode <", value, "actioncode");
            return (Criteria) this;
        }

        public Criteria andActioncodeLessThanOrEqualTo(String value) {
            addCriterion("actioncode <=", value, "actioncode");
            return (Criteria) this;
        }

        public Criteria andActioncodeLike(String value) {
            addCriterion("actioncode like", value, "actioncode");
            return (Criteria) this;
        }

        public Criteria andActioncodeNotLike(String value) {
            addCriterion("actioncode not like", value, "actioncode");
            return (Criteria) this;
        }

        public Criteria andActioncodeIn(List<String> values) {
            addCriterion("actioncode in", values, "actioncode");
            return (Criteria) this;
        }

        public Criteria andActioncodeNotIn(List<String> values) {
            addCriterion("actioncode not in", values, "actioncode");
            return (Criteria) this;
        }

        public Criteria andActioncodeBetween(String value1, String value2) {
            addCriterion("actioncode between", value1, value2, "actioncode");
            return (Criteria) this;
        }

        public Criteria andActioncodeNotBetween(String value1, String value2) {
            addCriterion("actioncode not between", value1, value2, "actioncode");
            return (Criteria) this;
        }

        public Criteria andPaymentsIsNull() {
            addCriterion("payments is null");
            return (Criteria) this;
        }

        public Criteria andPaymentsIsNotNull() {
            addCriterion("payments is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentsEqualTo(String value) {
            addCriterion("payments =", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsNotEqualTo(String value) {
            addCriterion("payments <>", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsGreaterThan(String value) {
            addCriterion("payments >", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsGreaterThanOrEqualTo(String value) {
            addCriterion("payments >=", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsLessThan(String value) {
            addCriterion("payments <", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsLessThanOrEqualTo(String value) {
            addCriterion("payments <=", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsLike(String value) {
            addCriterion("payments like", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsNotLike(String value) {
            addCriterion("payments not like", value, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsIn(List<String> values) {
            addCriterion("payments in", values, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsNotIn(List<String> values) {
            addCriterion("payments not in", values, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsBetween(String value1, String value2) {
            addCriterion("payments between", value1, value2, "payments");
            return (Criteria) this;
        }

        public Criteria andPaymentsNotBetween(String value1, String value2) {
            addCriterion("payments not between", value1, value2, "payments");
            return (Criteria) this;
        }

        public Criteria andGroupnumIsNull() {
            addCriterion("groupnum is null");
            return (Criteria) this;
        }

        public Criteria andGroupnumIsNotNull() {
            addCriterion("groupnum is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnumEqualTo(String value) {
            addCriterion("groupnum =", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotEqualTo(String value) {
            addCriterion("groupnum <>", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumGreaterThan(String value) {
            addCriterion("groupnum >", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumGreaterThanOrEqualTo(String value) {
            addCriterion("groupnum >=", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumLessThan(String value) {
            addCriterion("groupnum <", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumLessThanOrEqualTo(String value) {
            addCriterion("groupnum <=", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumLike(String value) {
            addCriterion("groupnum like", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotLike(String value) {
            addCriterion("groupnum not like", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumIn(List<String> values) {
            addCriterion("groupnum in", values, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotIn(List<String> values) {
            addCriterion("groupnum not in", values, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumBetween(String value1, String value2) {
            addCriterion("groupnum between", value1, value2, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotBetween(String value1, String value2) {
            addCriterion("groupnum not between", value1, value2, "groupnum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumIsNull() {
            addCriterion("peoplenum is null");
            return (Criteria) this;
        }

        public Criteria andPeoplenumIsNotNull() {
            addCriterion("peoplenum is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplenumEqualTo(String value) {
            addCriterion("peoplenum =", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumNotEqualTo(String value) {
            addCriterion("peoplenum <>", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumGreaterThan(String value) {
            addCriterion("peoplenum >", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumGreaterThanOrEqualTo(String value) {
            addCriterion("peoplenum >=", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumLessThan(String value) {
            addCriterion("peoplenum <", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumLessThanOrEqualTo(String value) {
            addCriterion("peoplenum <=", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumLike(String value) {
            addCriterion("peoplenum like", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumNotLike(String value) {
            addCriterion("peoplenum not like", value, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumIn(List<String> values) {
            addCriterion("peoplenum in", values, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumNotIn(List<String> values) {
            addCriterion("peoplenum not in", values, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumBetween(String value1, String value2) {
            addCriterion("peoplenum between", value1, value2, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andPeoplenumNotBetween(String value1, String value2) {
            addCriterion("peoplenum not between", value1, value2, "peoplenum");
            return (Criteria) this;
        }

        public Criteria andTopicnumIsNull() {
            addCriterion("topicnum is null");
            return (Criteria) this;
        }

        public Criteria andTopicnumIsNotNull() {
            addCriterion("topicnum is not null");
            return (Criteria) this;
        }

        public Criteria andTopicnumEqualTo(String value) {
            addCriterion("topicnum =", value, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTopicnumNotEqualTo(String value) {
            addCriterion("topicnum <>", value, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTopicnumGreaterThan(String value) {
            addCriterion("topicnum >", value, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTopicnumGreaterThanOrEqualTo(String value) {
            addCriterion("topicnum >=", value, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTopicnumLessThan(String value) {
            addCriterion("topicnum <", value, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTopicnumLessThanOrEqualTo(String value) {
            addCriterion("topicnum <=", value, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTopicnumLike(String value) {
            addCriterion("topicnum like", value, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTopicnumNotLike(String value) {
            addCriterion("topicnum not like", value, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTopicnumIn(List<String> values) {
            addCriterion("topicnum in", values, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTopicnumNotIn(List<String> values) {
            addCriterion("topicnum not in", values, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTopicnumBetween(String value1, String value2) {
            addCriterion("topicnum between", value1, value2, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTopicnumNotBetween(String value1, String value2) {
            addCriterion("topicnum not between", value1, value2, "topicnum");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table paymentdata
     *
     * @mbggenerated do_not_delete_during_merge Wed Dec 24 15:59:00 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table paymentdata
     *
     * @mbggenerated Wed Dec 24 15:59:00 CST 2014
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}