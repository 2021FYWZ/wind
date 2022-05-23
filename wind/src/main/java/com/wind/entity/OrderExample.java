package com.wind.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andOContatctsIsNull() {
            addCriterion("o_contatcts is null");
            return (Criteria) this;
        }

        public Criteria andOContatctsIsNotNull() {
            addCriterion("o_contatcts is not null");
            return (Criteria) this;
        }

        public Criteria andOContatctsEqualTo(String value) {
            addCriterion("o_contatcts =", value, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOContatctsNotEqualTo(String value) {
            addCriterion("o_contatcts <>", value, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOContatctsGreaterThan(String value) {
            addCriterion("o_contatcts >", value, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOContatctsGreaterThanOrEqualTo(String value) {
            addCriterion("o_contatcts >=", value, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOContatctsLessThan(String value) {
            addCriterion("o_contatcts <", value, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOContatctsLessThanOrEqualTo(String value) {
            addCriterion("o_contatcts <=", value, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOContatctsLike(String value) {
            addCriterion("o_contatcts like", value, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOContatctsNotLike(String value) {
            addCriterion("o_contatcts not like", value, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOContatctsIn(List<String> values) {
            addCriterion("o_contatcts in", values, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOContatctsNotIn(List<String> values) {
            addCriterion("o_contatcts not in", values, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOContatctsBetween(String value1, String value2) {
            addCriterion("o_contatcts between", value1, value2, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOContatctsNotBetween(String value1, String value2) {
            addCriterion("o_contatcts not between", value1, value2, "oContatcts");
            return (Criteria) this;
        }

        public Criteria andOPhoneIsNull() {
            addCriterion("o_phone is null");
            return (Criteria) this;
        }

        public Criteria andOPhoneIsNotNull() {
            addCriterion("o_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOPhoneEqualTo(String value) {
            addCriterion("o_phone =", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneNotEqualTo(String value) {
            addCriterion("o_phone <>", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneGreaterThan(String value) {
            addCriterion("o_phone >", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("o_phone >=", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneLessThan(String value) {
            addCriterion("o_phone <", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneLessThanOrEqualTo(String value) {
            addCriterion("o_phone <=", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneLike(String value) {
            addCriterion("o_phone like", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneNotLike(String value) {
            addCriterion("o_phone not like", value, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneIn(List<String> values) {
            addCriterion("o_phone in", values, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneNotIn(List<String> values) {
            addCriterion("o_phone not in", values, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneBetween(String value1, String value2) {
            addCriterion("o_phone between", value1, value2, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOPhoneNotBetween(String value1, String value2) {
            addCriterion("o_phone not between", value1, value2, "oPhone");
            return (Criteria) this;
        }

        public Criteria andOAddressIsNull() {
            addCriterion("o_address is null");
            return (Criteria) this;
        }

        public Criteria andOAddressIsNotNull() {
            addCriterion("o_address is not null");
            return (Criteria) this;
        }

        public Criteria andOAddressEqualTo(String value) {
            addCriterion("o_address =", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotEqualTo(String value) {
            addCriterion("o_address <>", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressGreaterThan(String value) {
            addCriterion("o_address >", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressGreaterThanOrEqualTo(String value) {
            addCriterion("o_address >=", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLessThan(String value) {
            addCriterion("o_address <", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLessThanOrEqualTo(String value) {
            addCriterion("o_address <=", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressLike(String value) {
            addCriterion("o_address like", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotLike(String value) {
            addCriterion("o_address not like", value, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressIn(List<String> values) {
            addCriterion("o_address in", values, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotIn(List<String> values) {
            addCriterion("o_address not in", values, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressBetween(String value1, String value2) {
            addCriterion("o_address between", value1, value2, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOAddressNotBetween(String value1, String value2) {
            addCriterion("o_address not between", value1, value2, "oAddress");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNull() {
            addCriterion("o_price is null");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNotNull() {
            addCriterion("o_price is not null");
            return (Criteria) this;
        }

        public Criteria andOPriceEqualTo(BigDecimal value) {
            addCriterion("o_price =", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotEqualTo(BigDecimal value) {
            addCriterion("o_price <>", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThan(BigDecimal value) {
            addCriterion("o_price >", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("o_price >=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThan(BigDecimal value) {
            addCriterion("o_price <", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("o_price <=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceIn(List<BigDecimal> values) {
            addCriterion("o_price in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotIn(List<BigDecimal> values) {
            addCriterion("o_price not in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("o_price between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("o_price not between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPacksgeIsNull() {
            addCriterion("o_packsge is null");
            return (Criteria) this;
        }

        public Criteria andOPacksgeIsNotNull() {
            addCriterion("o_packsge is not null");
            return (Criteria) this;
        }

        public Criteria andOPacksgeEqualTo(String value) {
            addCriterion("o_packsge =", value, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andOPacksgeNotEqualTo(String value) {
            addCriterion("o_packsge <>", value, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andOPacksgeGreaterThan(String value) {
            addCriterion("o_packsge >", value, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andOPacksgeGreaterThanOrEqualTo(String value) {
            addCriterion("o_packsge >=", value, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andOPacksgeLessThan(String value) {
            addCriterion("o_packsge <", value, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andOPacksgeLessThanOrEqualTo(String value) {
            addCriterion("o_packsge <=", value, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andOPacksgeLike(String value) {
            addCriterion("o_packsge like", value, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andOPacksgeNotLike(String value) {
            addCriterion("o_packsge not like", value, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andOPacksgeIn(List<String> values) {
            addCriterion("o_packsge in", values, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andOPacksgeNotIn(List<String> values) {
            addCriterion("o_packsge not in", values, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andOPacksgeBetween(String value1, String value2) {
            addCriterion("o_packsge between", value1, value2, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andOPacksgeNotBetween(String value1, String value2) {
            addCriterion("o_packsge not between", value1, value2, "oPacksge");
            return (Criteria) this;
        }

        public Criteria andODateIsNull() {
            addCriterion("o_date is null");
            return (Criteria) this;
        }

        public Criteria andODateIsNotNull() {
            addCriterion("o_date is not null");
            return (Criteria) this;
        }

        public Criteria andODateEqualTo(Date value) {
            addCriterionForJDBCDate("o_date =", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotEqualTo(Date value) {
            addCriterionForJDBCDate("o_date <>", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThan(Date value) {
            addCriterionForJDBCDate("o_date >", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_date >=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThan(Date value) {
            addCriterionForJDBCDate("o_date <", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_date <=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateIn(List<Date> values) {
            addCriterionForJDBCDate("o_date in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotIn(List<Date> values) {
            addCriterionForJDBCDate("o_date not in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_date between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_date not between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andOStateIsNull() {
            addCriterion("o_state is null");
            return (Criteria) this;
        }

        public Criteria andOStateIsNotNull() {
            addCriterion("o_state is not null");
            return (Criteria) this;
        }

        public Criteria andOStateEqualTo(Integer value) {
            addCriterion("o_state =", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotEqualTo(Integer value) {
            addCriterion("o_state <>", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThan(Integer value) {
            addCriterion("o_state >", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_state >=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThan(Integer value) {
            addCriterion("o_state <", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThanOrEqualTo(Integer value) {
            addCriterion("o_state <=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateIn(List<Integer> values) {
            addCriterion("o_state in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotIn(List<Integer> values) {
            addCriterion("o_state not in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateBetween(Integer value1, Integer value2) {
            addCriterion("o_state between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotBetween(Integer value1, Integer value2) {
            addCriterion("o_state not between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andORemarkIsNull() {
            addCriterion("o_remark is null");
            return (Criteria) this;
        }

        public Criteria andORemarkIsNotNull() {
            addCriterion("o_remark is not null");
            return (Criteria) this;
        }

        public Criteria andORemarkEqualTo(String value) {
            addCriterion("o_remark =", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotEqualTo(String value) {
            addCriterion("o_remark <>", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkGreaterThan(String value) {
            addCriterion("o_remark >", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkGreaterThanOrEqualTo(String value) {
            addCriterion("o_remark >=", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkLessThan(String value) {
            addCriterion("o_remark <", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkLessThanOrEqualTo(String value) {
            addCriterion("o_remark <=", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkLike(String value) {
            addCriterion("o_remark like", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotLike(String value) {
            addCriterion("o_remark not like", value, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkIn(List<String> values) {
            addCriterion("o_remark in", values, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotIn(List<String> values) {
            addCriterion("o_remark not in", values, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkBetween(String value1, String value2) {
            addCriterion("o_remark between", value1, value2, "oRemark");
            return (Criteria) this;
        }

        public Criteria andORemarkNotBetween(String value1, String value2) {
            addCriterion("o_remark not between", value1, value2, "oRemark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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