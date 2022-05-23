/*创建用户表*/
create table WUSER(
		u_id	   int PRIMARY KEY NOT NULL,
		u_name     varchar(64) NOT NULL,
		u_pwd      varchar(64) NOT NULL,
		u_nickname varchar(64),
		u_img      varchar(50),
		u_phone    varchar(20),
		u_email    varchar(64),
		u_state    varchar(64),
		u_openid   varchar(64)
)

/*创建管理员表*/
create table WMANAGER(
		m_id	   int PRIMARY KEY NOT NULL,
		m_account  varchar(64) NOT NULL,
		m_name     varchar(64) NOT NULL
)

/*创建订单表*/
create table WORDER(
		o_id	    int PRIMARY KEY NOT NULL,
		u_id	    int NOT NULL,
		o_contatcts varchar(64) NOT NULL,
		o_phone     varchar(20) NOT NULL,
		o_address   varchar(64) NOT NULL,
		o_price     numeric(4,2)NOT NULL,
		o_packsge   varchar(64) NOT NULL,
		o_date      date NOT NULL,
		o_state     int NOT NULL,
		o_remark    varchar(225) 
)

/*建立订单表与用户表的外键*/
ALTER TABLE WORDER ADD CONSTRAINT fk_WUSER_u_id FOREIGN KEY(u_id) REFERENCES WUSER(u_id);

/*创建反馈表*/
create table WFEEDBACK(
		f_id	  int PRIMARY KEY NOT NULL,
		u_id	  int NOT NULL,
		f_date    date NOT NULL,
		f_ip      varchar(50),
		f_content varchar(64) NOT NULL,
		f_info    varchar(64),
		f_version varchar(64)
)

/*建立反馈表与用户表的外键*/
ALTER TABLE WFEEDBACK ADD CONSTRAINT fk_WFEEDBACK_u_id FOREIGN KEY(u_id) REFERENCES WUSER(u_id);

/*创建帮助表*/
create table WHELP(
		h_id	  int PRIMARY KEY NOT NULL,
		h_content varchar(64) NOT NULL,
		h_method  varchar(225) NOT NULL
)





alter table WORDER Drop CONSTRAINT fk_WUSER_u_id;
drop table WUSER
drop table WMANAGER
drop table WORDER
drop table WFEEDBACK
drop table WHELP