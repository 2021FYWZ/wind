/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80027
Source Host           : localhost:3306
Source Database       : project_wind

Target Server Type    : MYSQL
Target Server Version : 80027
File Encoding         : 65001

Date: 2022-05-27 20:37:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wfeedback
-- ----------------------------
DROP TABLE IF EXISTS `wfeedback`;
CREATE TABLE `wfeedback` (
  `f_id` int NOT NULL AUTO_INCREMENT,
  `u_id` int NOT NULL,
  `f_date` date NOT NULL,
  `f_ip` varchar(50) DEFAULT NULL,
  `f_content` varchar(64) NOT NULL,
  `f_info` varchar(64) DEFAULT NULL,
  `f_version` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`f_id`),
  KEY `fk_u` (`u_id`),
  CONSTRAINT `fk_u` FOREIGN KEY (`u_id`) REFERENCES `wuser` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of wfeedback
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of wmanager
-- ----------------------------

-- ----------------------------
-- Table structure for worder
-- ----------------------------
DROP TABLE IF EXISTS `worder`;
CREATE TABLE `worder` (
  `o_id` int NOT NULL,
  `u_id` int NOT NULL,
  `o_contatcts` varchar(64) NOT NULL,
  `o_phone` varchar(20) NOT NULL,
  `o_address` varchar(64) NOT NULL,
  `o_price` decimal(4,2) NOT NULL,
  `o_packsge` varchar(64) NOT NULL,
  `o_date` date NOT NULL,
  `o_state` int NOT NULL,
  `o_remark` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`o_id`),
  KEY `fk_WUSER_u_id` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of worder
-- ----------------------------
INSERT INTO `worder` VALUES ('1', '2', 'xiaoming', '13012345677', '中国大陆', '99.00', '大', '2022-05-26', '1', 'hello');

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
INSERT INTO `wuser` VALUES ('1', 'xiaoming', '123456', '小明', '', '13012345678', '123456789@qq.com', '1', '0');
INSERT INTO `wuser` VALUES ('2', 'xiaobai', '123456', '小白', null, '13012345666', '12345666@qq.com', '1', '0');
INSERT INTO `wuser` VALUES ('4', '2222', '22', '2222', '2222', '222', '222', '1', '0');
INSERT INTO `wuser` VALUES ('15', '11111111111', '11111111111', '11111111111', '11111111111', '11111111111', '11111111111@qq.com', '1', '0');
INSERT INTO `wuser` VALUES ('28', '22222222', 'adbc91a43e988a3b5b745b8529a90b61', '22222222', '11111111111', '11111111111', '11111111111@qq.com', '1', '0');
INSERT INTO `wuser` VALUES ('29', '123456', 'e10adc3949ba59abbe56e057f20f883e', '123456', '0', '12345678111', '123456@qq.com', '1', '0');
INSERT INTO `wuser` VALUES ('30', '123456789', 'e10adc3949ba59abbe56e057f20f883e', '123456', '123456', '12345678987', '123456@qq.com', '1', '0');
