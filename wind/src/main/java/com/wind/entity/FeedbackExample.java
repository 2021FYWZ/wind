package com.wind.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedbackExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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
            List<java.sql.Date> dateList = new ArrayList<>();
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
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

        public Criteria andFDateIsNull() {
            addCriterion("f_date is null");
            return (Criteria) this;
        }

        public Criteria andFDateIsNotNull() {
            addCriterion("f_date is not null");
            return (Criteria) this;
        }

        public Criteria andFDateEqualTo(Date value) {
            addCriterionForJDBCDate("f_date =", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("f_date <>", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateGreaterThan(Date value) {
            addCriterionForJDBCDate("f_date >", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("f_date >=", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLessThan(Date value) {
            addCriterionForJDBCDate("f_date <", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("f_date <=", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateIn(List<Date> values) {
            addCriterionForJDBCDate("f_date in", values, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("f_date not in", values, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("f_date between", value1, value2, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("f_date not between", value1, value2, "fDate");
            return (Criteria) this;
        }

        public Criteria andFIpIsNull() {
            addCriterion("f_ip is null");
            return (Criteria) this;
        }

        public Criteria andFIpIsNotNull() {
            addCriterion("f_ip is not null");
            return (Criteria) this;
        }

        public Criteria andFIpEqualTo(String value) {
            addCriterion("f_ip =", value, "fIp");
            return (Criteria) this;
        }

        public Criteria andFIpNotEqualTo(String value) {
            addCriterion("f_ip <>", value, "fIp");
            return (Criteria) this;
        }

        public Criteria andFIpGreaterThan(String value) {
            addCriterion("f_ip >", value, "fIp");
            return (Criteria) this;
        }

        public Criteria andFIpGreaterThanOrEqualTo(String value) {
            addCriterion("f_ip >=", value, "fIp");
            return (Criteria) this;
        }

        public Criteria andFIpLessThan(String value) {
            addCriterion("f_ip <", value, "fIp");
            return (Criteria) this;
        }

        public Criteria andFIpLessThanOrEqualTo(String value) {
            addCriterion("f_ip <=", value, "fIp");
            return (Criteria) this;
        }

        public Criteria andFIpLike(String value) {
            addCriterion("f_ip like", value, "fIp");
            return (Criteria) this;
        }

        public Criteria andFIpNotLike(String value) {
            addCriterion("f_ip not like", value, "fIp");
            return (Criteria) this;
        }

        public Criteria andFIpIn(List<String> values) {
            addCriterion("f_ip in", values, "fIp");
            return (Criteria) this;
        }

        public Criteria andFIpNotIn(List<String> values) {
            addCriterion("f_ip not in", values, "fIp");
            return (Criteria) this;
        }

        public Criteria andFIpBetween(String value1, String value2) {
            addCriterion("f_ip between", value1, value2, "fIp");
            return (Criteria) this;
        }

        public Criteria andFIpNotBetween(String value1, String value2) {
            addCriterion("f_ip not between", value1, value2, "fIp");
            return (Criteria) this;
        }

        public Criteria andFContentIsNull() {
            addCriterion("f_content is null");
            return (Criteria) this;
        }

        public Criteria andFContentIsNotNull() {
            addCriterion("f_content is not null");
            return (Criteria) this;
        }

        public Criteria andFContentEqualTo(String value) {
            addCriterion("f_content =", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentNotEqualTo(String value) {
            addCriterion("f_content <>", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentGreaterThan(String value) {
            addCriterion("f_content >", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentGreaterThanOrEqualTo(String value) {
            addCriterion("f_content >=", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentLessThan(String value) {
            addCriterion("f_content <", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentLessThanOrEqualTo(String value) {
            addCriterion("f_content <=", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentLike(String value) {
            addCriterion("f_content like", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentNotLike(String value) {
            addCriterion("f_content not like", value, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentIn(List<String> values) {
            addCriterion("f_content in", values, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentNotIn(List<String> values) {
            addCriterion("f_content not in", values, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentBetween(String value1, String value2) {
            addCriterion("f_content between", value1, value2, "fContent");
            return (Criteria) this;
        }

        public Criteria andFContentNotBetween(String value1, String value2) {
            addCriterion("f_content not between", value1, value2, "fContent");
            return (Criteria) this;
        }

        public Criteria andFInfoIsNull() {
            addCriterion("f_info is null");
            return (Criteria) this;
        }

        public Criteria andFInfoIsNotNull() {
            addCriterion("f_info is not null");
            return (Criteria) this;
        }

        public Criteria andFInfoEqualTo(String value) {
            addCriterion("f_info =", value, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFInfoNotEqualTo(String value) {
            addCriterion("f_info <>", value, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFInfoGreaterThan(String value) {
            addCriterion("f_info >", value, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFInfoGreaterThanOrEqualTo(String value) {
            addCriterion("f_info >=", value, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFInfoLessThan(String value) {
            addCriterion("f_info <", value, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFInfoLessThanOrEqualTo(String value) {
            addCriterion("f_info <=", value, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFInfoLike(String value) {
            addCriterion("f_info like", value, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFInfoNotLike(String value) {
            addCriterion("f_info not like", value, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFInfoIn(List<String> values) {
            addCriterion("f_info in", values, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFInfoNotIn(List<String> values) {
            addCriterion("f_info not in", values, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFInfoBetween(String value1, String value2) {
            addCriterion("f_info between", value1, value2, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFInfoNotBetween(String value1, String value2) {
            addCriterion("f_info not between", value1, value2, "fInfo");
            return (Criteria) this;
        }

        public Criteria andFVersionIsNull() {
            addCriterion("f_version is null");
            return (Criteria) this;
        }

        public Criteria andFVersionIsNotNull() {
            addCriterion("f_version is not null");
            return (Criteria) this;
        }

        public Criteria andFVersionEqualTo(String value) {
            addCriterion("f_version =", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionNotEqualTo(String value) {
            addCriterion("f_version <>", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionGreaterThan(String value) {
            addCriterion("f_version >", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionGreaterThanOrEqualTo(String value) {
            addCriterion("f_version >=", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionLessThan(String value) {
            addCriterion("f_version <", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionLessThanOrEqualTo(String value) {
            addCriterion("f_version <=", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionLike(String value) {
            addCriterion("f_version like", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionNotLike(String value) {
            addCriterion("f_version not like", value, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionIn(List<String> values) {
            addCriterion("f_version in", values, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionNotIn(List<String> values) {
            addCriterion("f_version not in", values, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionBetween(String value1, String value2) {
            addCriterion("f_version between", value1, value2, "fVersion");
            return (Criteria) this;
        }

        public Criteria andFVersionNotBetween(String value1, String value2) {
            addCriterion("f_version not between", value1, value2, "fVersion");
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