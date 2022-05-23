package com.wind.entity;

import java.util.ArrayList;
import java.util.List;

public class HelperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HelperExample() {
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(Integer value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(Integer value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(Integer value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(Integer value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(Integer value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<Integer> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<Integer> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(Integer value1, Integer value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHContentIsNull() {
            addCriterion("h_content is null");
            return (Criteria) this;
        }

        public Criteria andHContentIsNotNull() {
            addCriterion("h_content is not null");
            return (Criteria) this;
        }

        public Criteria andHContentEqualTo(String value) {
            addCriterion("h_content =", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotEqualTo(String value) {
            addCriterion("h_content <>", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentGreaterThan(String value) {
            addCriterion("h_content >", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentGreaterThanOrEqualTo(String value) {
            addCriterion("h_content >=", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLessThan(String value) {
            addCriterion("h_content <", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLessThanOrEqualTo(String value) {
            addCriterion("h_content <=", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentLike(String value) {
            addCriterion("h_content like", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotLike(String value) {
            addCriterion("h_content not like", value, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentIn(List<String> values) {
            addCriterion("h_content in", values, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotIn(List<String> values) {
            addCriterion("h_content not in", values, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentBetween(String value1, String value2) {
            addCriterion("h_content between", value1, value2, "hContent");
            return (Criteria) this;
        }

        public Criteria andHContentNotBetween(String value1, String value2) {
            addCriterion("h_content not between", value1, value2, "hContent");
            return (Criteria) this;
        }

        public Criteria andHMethodIsNull() {
            addCriterion("h_method is null");
            return (Criteria) this;
        }

        public Criteria andHMethodIsNotNull() {
            addCriterion("h_method is not null");
            return (Criteria) this;
        }

        public Criteria andHMethodEqualTo(String value) {
            addCriterion("h_method =", value, "hMethod");
            return (Criteria) this;
        }

        public Criteria andHMethodNotEqualTo(String value) {
            addCriterion("h_method <>", value, "hMethod");
            return (Criteria) this;
        }

        public Criteria andHMethodGreaterThan(String value) {
            addCriterion("h_method >", value, "hMethod");
            return (Criteria) this;
        }

        public Criteria andHMethodGreaterThanOrEqualTo(String value) {
            addCriterion("h_method >=", value, "hMethod");
            return (Criteria) this;
        }

        public Criteria andHMethodLessThan(String value) {
            addCriterion("h_method <", value, "hMethod");
            return (Criteria) this;
        }

        public Criteria andHMethodLessThanOrEqualTo(String value) {
            addCriterion("h_method <=", value, "hMethod");
            return (Criteria) this;
        }

        public Criteria andHMethodLike(String value) {
            addCriterion("h_method like", value, "hMethod");
            return (Criteria) this;
        }

        public Criteria andHMethodNotLike(String value) {
            addCriterion("h_method not like", value, "hMethod");
            return (Criteria) this;
        }

        public Criteria andHMethodIn(List<String> values) {
            addCriterion("h_method in", values, "hMethod");
            return (Criteria) this;
        }

        public Criteria andHMethodNotIn(List<String> values) {
            addCriterion("h_method not in", values, "hMethod");
            return (Criteria) this;
        }

        public Criteria andHMethodBetween(String value1, String value2) {
            addCriterion("h_method between", value1, value2, "hMethod");
            return (Criteria) this;
        }

        public Criteria andHMethodNotBetween(String value1, String value2) {
            addCriterion("h_method not between", value1, value2, "hMethod");
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