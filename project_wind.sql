/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80027
Source Host           : localhost:3306
Source Database       : project_wind

Target Server Type    : MYSQL
Target Server Version : 80027
File Encoding         : 65001

Date: 2022-05-29 01:52:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wfeedback
-- ----------------------------
DROP TABLE IF EXISTS `wfeedback`;
CREATE TABLE `wfeedback` (
  `f_id` int NOT NULL AUTO_INCREMENT,
  `u_id` int NOT NULL,
  `f_date` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `f_ip` varchar(50) DEFAULT NULL,
  `f_content` varchar(64) NOT NULL,
  `f_info` varchar(64) DEFAULT NULL,
  `f_version` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`f_id`),
  KEY `fk_u` (`u_id`),
  CONSTRAINT `fk_u` FOREIGN KEY (`u_id`) REFERENCES `wuser` (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of wfeedback
-- ----------------------------
INSERT INTO `wfeedback` VALUES ('7', '1', '', '', '哈哈哈的撒旦撒旦啊', '', '');
INSERT INTO `wfeedback` VALUES ('8', '2', '2022-05-28 20:14:08', '', '测试反馈', '', '');
INSERT INTO `wfeedback` VALUES ('9', '2', '2022-05-28 20:16:37', '', '测试反馈', '', '');

-- ----------------------------
-- Table structure for whelp
-- ----------------------------
DROP TABLE IF EXISTS `whelp`;
CREATE TABLE `whelp` (
  `h_id` int NOT NULL,
  `h_content` varchar(64) NOT NULL,
  `h_method` varchar(225) NOT NULL,
  PRIMARY KEY (`h_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of whelp
-- ----------------------------

-- ----------------------------
-- Table structure for wmanager
-- ----------------------------
DROP TABLE IF EXISTS `wmanager`;
CREATE TABLE `wmanager` (
  `m_id` int NOT NULL AUTO_INCREMENT,
  `m_account` varchar(64) NOT NULL,
  `m_pwd` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of wmanager
-- ----------------------------
INSERT INTO `wmanager` VALUES ('1', '123456', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `wmanager` VALUES ('2', '121122', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `wmanager` VALUES ('3', '12345688', 'e10adc3949ba59abbe56e057f20f883e');

-- ----------------------------
-- Table structure for worder
-- ----------------------------
DROP TABLE IF EXISTS `worder`;
CREATE TABLE `worder` (
  `o_id` int NOT NULL AUTO_INCREMENT,
  `u_id` int NOT NULL,
  `a_id` int DEFAULT NULL,
  `o_contatcts` varchar(64) NOT NULL,
  `o_phone` varchar(20) NOT NULL,
  `o_address` varchar(64) NOT NULL,
  `o_price` decimal(4,2) NOT NULL,
  `o_package` int NOT NULL,
  `o_date` varchar(64) NOT NULL,
  `o_state` int NOT NULL,
  `o_remark` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`o_id`),
  KEY `fk_WUSER_u_id` (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of worder
-- ----------------------------
INSERT INTO `worder` VALUES ('1', '2', '1', 'xiaoming', '13012345677', '小白的收货地址', '99.00', '0', '2022-05-26', '1', 'hello');
INSERT INTO `worder` VALUES ('10', '2', '1', '123', '12312313212', '小白的收货地址', '22.00', '1', '2000-20-20 24:26', '0', '小明的包裹');
INSERT INTO `worder` VALUES ('11', '2', '1', '123', '12312313212', '小白的收货地址', '22.00', '2', '2000-20-20 24:26', '0', '小白的包裹');
INSERT INTO `worder` VALUES ('14', '2', '1', '123', '12312313212', '小白的收货地址', '22.00', '2', '2000-20-20 24:26', '0', '送到楼下谢谢！');
INSERT INTO `worder` VALUES ('15', '1', '2', '123', '12312313212', '小明的收货地址', '22.00', '0', '2000-20-20 24:26', '0', '小包裹');
INSERT INTO `worder` VALUES ('16', '1', '2', '123', '12312313212', '小明的收货地址', '22.00', '2', '2000-20-20 24:26', '0', '大包裹');
INSERT INTO `worder` VALUES ('17', '1', '2', '123', '12312313212', '小明的收货地址', '22.00', '1', '2000-20-20 24:26', '0', '下午送');
INSERT INTO `worder` VALUES ('18', '1', '2', '123', '12312313212', '小明的收货地址', '22.00', '0', '2000-20-20 24:26', '0', '早上送');
INSERT INTO `worder` VALUES ('19', '1', '2', '123', '12312313212', '小明的收货地址', '22.00', '1', '2000-20-20 24:26', '0', '尽快送');
INSERT INTO `worder` VALUES ('20', '1', '2', '123', '12312313212', '小明的收货地址', '22.00', '2', '2000-20-20 24:26', '0', '123');
INSERT INTO `worder` VALUES ('22', '123456', null, 'Dell', '12345678911', '中国台湾', '20.00', '2', '2022-05-28 21:39:51', '0', '123');
INSERT INTO `worder` VALUES ('23', '123456', null, 'Dell', '12345678911', '中国台湾', '20.00', '2', '2022-05-28 21:41:35', '0', '4');
INSERT INTO `worder` VALUES ('24', '1', '2', '123', '13012345677', '小白的收货地址', '99.00', '0', '2022-05-29 00:12:29', '3', '2');
INSERT INTO `worder` VALUES ('25', '1', '2', '123', '13012345677', '小白的收货地址', '99.00', '0', '2022-05-28 23:55:39', '2', '2');
INSERT INTO `worder` VALUES ('26', '1', null, '123', '13012345677', '小白的收货地址', '99.00', '0', '2022-05-26', '0', '2');

-- ----------------------------
-- Table structure for wuser
-- ----------------------------
DROP TABLE IF EXISTS `wuser`;
CREATE TABLE `wuser` (
  `u_id` int NOT NULL AUTO_INCREMENT,
  `u_name` varchar(64) NOT NULL,
  `u_pwd` varchar(64) NOT NULL,
  `u_nickname` varchar(64) DEFAULT NULL,
  `u_img` varchar(50) DEFAULT NULL,
  `u_phone` varchar(20) DEFAULT NULL,
  `u_email` varchar(64) DEFAULT NULL,
  `u_state` varchar(64) DEFAULT NULL,
  `u_openid` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `uniname` (`u_name`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of wuser
-- ----------------------------
INSERT INTO `wuser` VALUES ('1', 'xiaoming', 'e10adc3949ba59abbe56e057f20f883e', '小明', '', '13012345678', '123456789@qq.com', '1', '0');
INSERT INTO `wuser` VALUES ('2', 'xiaobai', 'e10adc3949ba59abbe56e057f20f883e', '小白', null, '13012345666', '12345666@qq.com', '1', '0');
