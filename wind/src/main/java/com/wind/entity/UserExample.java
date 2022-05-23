package com.wind.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNull() {
            addCriterion("u_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNotNull() {
            addCriterion("u_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUPwdEqualTo(String value) {
            addCriterion("u_pwd =", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotEqualTo(String value) {
            addCriterion("u_pwd <>", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThan(String value) {
            addCriterion("u_pwd >", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThanOrEqualTo(String value) {
            addCriterion("u_pwd >=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThan(String value) {
            addCriterion("u_pwd <", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThanOrEqualTo(String value) {
            addCriterion("u_pwd <=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLike(String value) {
            addCriterion("u_pwd like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotLike(String value) {
            addCriterion("u_pwd not like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdIn(List<String> values) {
            addCriterion("u_pwd in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotIn(List<String> values) {
            addCriterion("u_pwd not in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdBetween(String value1, String value2) {
            addCriterion("u_pwd between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotBetween(String value1, String value2) {
            addCriterion("u_pwd not between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNull() {
            addCriterion("u_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNotNull() {
            addCriterion("u_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUNicknameEqualTo(String value) {
            addCriterion("u_nickname =", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotEqualTo(String value) {
            addCriterion("u_nickname <>", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThan(String value) {
            addCriterion("u_nickname >", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("u_nickname >=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThan(String value) {
            addCriterion("u_nickname <", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThanOrEqualTo(String value) {
            addCriterion("u_nickname <=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLike(String value) {
            addCriterion("u_nickname like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotLike(String value) {
            addCriterion("u_nickname not like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameIn(List<String> values) {
            addCriterion("u_nickname in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotIn(List<String> values) {
            addCriterion("u_nickname not in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameBetween(String value1, String value2) {
            addCriterion("u_nickname between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotBetween(String value1, String value2) {
            addCriterion("u_nickname not between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUImgIsNull() {
            addCriterion("u_img is null");
            return (Criteria) this;
        }

        public Criteria andUImgIsNotNull() {
            addCriterion("u_img is not null");
            return (Criteria) this;
        }

        public Criteria andUImgEqualTo(String value) {
            addCriterion("u_img =", value, "uImg");
            return (Criteria) this;
        }

        public Criteria andUImgNotEqualTo(String value) {
            addCriterion("u_img <>", value, "uImg");
            return (Criteria) this;
        }

        public Criteria andUImgGreaterThan(String value) {
            addCriterion("u_img >", value, "uImg");
            return (Criteria) this;
        }

        public Criteria andUImgGreaterThanOrEqualTo(String value) {
            addCriterion("u_img >=", value, "uImg");
            return (Criteria) this;
        }

        public Criteria andUImgLessThan(String value) {
            addCriterion("u_img <", value, "uImg");
            return (Criteria) this;
        }

        public Criteria andUImgLessThanOrEqualTo(String value) {
            addCriterion("u_img <=", value, "uImg");
            return (Criteria) this;
        }

        public Criteria andUImgLike(String value) {
            addCriterion("u_img like", value, "uImg");
            return (Criteria) this;
        }

        public Criteria andUImgNotLike(String value) {
            addCriterion("u_img not like", value, "uImg");
            return (Criteria) this;
        }

        public Criteria andUImgIn(List<String> values) {
            addCriterion("u_img in", values, "uImg");
            return (Criteria) this;
        }

        public Criteria andUImgNotIn(List<String> values) {
            addCriterion("u_img not in", values, "uImg");
            return (Criteria) this;
        }

        public Criteria andUImgBetween(String value1, String value2) {
            addCriterion("u_img between", value1, value2, "uImg");
            return (Criteria) this;
        }

        public Criteria andUImgNotBetween(String value1, String value2) {
            addCriterion("u_img not between", value1, value2, "uImg");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("u_phone =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("u_phone <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("u_phone like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("u_phone not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("u_phone in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("u_email is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("u_email is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("u_email =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("u_email <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("u_email >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("u_email >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("u_email <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("u_email <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("u_email like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("u_email not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("u_email in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("u_email not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("u_email between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("u_email not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUStateIsNull() {
            addCriterion("u_state is null");
            return (Criteria) this;
        }

        public Criteria andUStateIsNotNull() {
            addCriterion("u_state is not null");
            return (Criteria) this;
        }

        public Criteria andUStateEqualTo(String value) {
            addCriterion("u_state =", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotEqualTo(String value) {
            addCriterion("u_state <>", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateGreaterThan(String value) {
            addCriterion("u_state >", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateGreaterThanOrEqualTo(String value) {
            addCriterion("u_state >=", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLessThan(String value) {
            addCriterion("u_state <", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLessThanOrEqualTo(String value) {
            addCriterion("u_state <=", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLike(String value) {
            addCriterion("u_state like", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotLike(String value) {
            addCriterion("u_state not like", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateIn(List<String> values) {
            addCriterion("u_state in", values, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotIn(List<String> values) {
            addCriterion("u_state not in", values, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateBetween(String value1, String value2) {
            addCriterion("u_state between", value1, value2, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotBetween(String value1, String value2) {
            addCriterion("u_state not between", value1, value2, "uState");
            return (Criteria) this;
        }

        public Criteria andUOpenidIsNull() {
            addCriterion("u_openid is null");
            return (Criteria) this;
        }

        public Criteria andUOpenidIsNotNull() {
            addCriterion("u_openid is not null");
            return (Criteria) this;
        }

        public Criteria andUOpenidEqualTo(String value) {
            addCriterion("u_openid =", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotEqualTo(String value) {
            addCriterion("u_openid <>", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidGreaterThan(String value) {
            addCriterion("u_openid >", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("u_openid >=", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLessThan(String value) {
            addCriterion("u_openid <", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLessThanOrEqualTo(String value) {
            addCriterion("u_openid <=", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLike(String value) {
            addCriterion("u_openid like", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotLike(String value) {
            addCriterion("u_openid not like", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidIn(List<String> values) {
            addCriterion("u_openid in", values, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotIn(List<String> values) {
            addCriterion("u_openid not in", values, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidBetween(String value1, String value2) {
            addCriterion("u_openid between", value1, value2, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotBetween(String value1, String value2) {
            addCriterion("u_openid not between", value1, value2, "uOpenid");
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