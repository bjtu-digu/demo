/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50709
Source Host           : 127.0.0.1:3306
Source Database       : digu

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2016-04-20 22:47:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bar
-- ----------------------------
DROP TABLE IF EXISTS `bar`;
CREATE TABLE `bar` (
  `bar_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `topic` varchar(255) DEFAULT NULL,
  `exist` int(11) DEFAULT '1',
  `bar_name` varchar(11) NOT NULL,
  `create_time` date DEFAULT NULL,
  `bar_head` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`bar_id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bar
-- ----------------------------
INSERT INTO `bar` VALUES ('3', '1', 'personal', '1', 'Test', '2015-09-28', '1');
INSERT INTO `bar` VALUES ('4', '5', 'lantian', '1', '555', '2015-10-11', '1');
INSERT INTO `bar` VALUES ('5', '1', '111', '1', 'fff', '2016-04-12', '1');

-- ----------------------------
-- Table structure for chat
-- ----------------------------
DROP TABLE IF EXISTS `chat`;
CREATE TABLE `chat` (
  `msg_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `bar_id` int(11) NOT NULL,
  `msg` varchar(255) DEFAULT NULL,
  `Date` datetime DEFAULT NULL,
  `exist` int(11) DEFAULT '1',
  PRIMARY KEY (`msg_id`,`user_id`,`bar_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chat
-- ----------------------------

-- ----------------------------
-- Table structure for msg
-- ----------------------------
DROP TABLE IF EXISTS `msg`;
CREATE TABLE `msg` (
  `msg_id` int(11) NOT NULL AUTO_INCREMENT,
  `msg` varchar(255) NOT NULL,
  `add_msg` varchar(255) NOT NULL COMMENT '保留位,如申明贴吧来源(id)',
  `type` varchar(255) NOT NULL COMMENT 'sys/private/apply/allow',
  `sender_id` int(11) NOT NULL,
  `reader_id` int(11) NOT NULL,
  `read` int(11) NOT NULL DEFAULT '1',
  `exist` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`msg_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of msg
-- ----------------------------

-- ----------------------------
-- Table structure for pic
-- ----------------------------
DROP TABLE IF EXISTS `pic`;
CREATE TABLE `pic` (
  `pic_id` int(11) NOT NULL COMMENT '保留500位为系统图片',
  `pic_type` varchar(255) NOT NULL,
  `pic_name` varchar(255) NOT NULL,
  `pic_date` date NOT NULL COMMENT '系统自动记录',
  `pic_size` int(11) NOT NULL COMMENT '限制3M',
  `pic_path` varchar(255) NOT NULL COMMENT '系统自动匹配',
  `dcp` varchar(255) NOT NULL,
  `exist` int(11) DEFAULT '1',
  PRIMARY KEY (`pic_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pic
-- ----------------------------

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `last_date` datetime DEFAULT NULL,
  `post_id` int(11) NOT NULL AUTO_INCREMENT,
  `bar_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `post_name` varchar(255) NOT NULL,
  `post_msg` varchar(255) NOT NULL,
  `post_date` datetime NOT NULL COMMENT '响应页面自动记录',
  `last_reply` varchar(255) DEFAULT NULL COMMENT '响应页面自动记录',
  `exist` int(11) DEFAULT '1',
  PRIMARY KEY (`post_id`)
) ENGINE=MyISAM AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('2016-04-20 21:22:39', '27', '4', '1', 'hehe', 'hehe', '2016-04-20 09:05:50', '10', '1');

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `reply_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增',
  `bar_id` int(11) NOT NULL,
  `post_id` int(11) NOT NULL,
  `reply_date` datetime NOT NULL COMMENT '响应页面自动记录',
  `reply_msg` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL,
  `exist` int(11) DEFAULT '1' COMMENT '若-1不存在1存在',
  PRIMARY KEY (`reply_id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply
-- ----------------------------
INSERT INTO `reply` VALUES ('1', '3', '2', '2015-10-11 23:12:04', '222222233333333333', '5', '1');
INSERT INTO `reply` VALUES ('2', '4', '26', '2016-04-20 08:49:34', 'hehe', '1', '1');
INSERT INTO `reply` VALUES ('3', '4', '26', '2016-04-20 08:50:00', 'hehe', '1', '1');
INSERT INTO `reply` VALUES ('4', '4', '26', '2016-04-20 08:52:16', 'hehe', '1', '1');
INSERT INTO `reply` VALUES ('5', '4', '26', '2016-04-20 08:55:22', 'hehe', '1', '1');
INSERT INTO `reply` VALUES ('6', '4', '26', '2016-04-20 08:56:30', 'hehe', '1', '1');
INSERT INTO `reply` VALUES ('7', '4', '26', '2016-04-20 08:57:18', 'hehe', '1', '1');
INSERT INTO `reply` VALUES ('8', '4', '27', '2016-04-20 09:05:56', 'hehe', '1', '1');
INSERT INTO `reply` VALUES ('9', '4', '27', '2016-04-20 09:06:04', '666', '1', '1');
INSERT INTO `reply` VALUES ('10', '4', '27', '2016-04-20 21:22:39', 'hehe，666', '5', '1');

-- ----------------------------
-- Table structure for star_bar
-- ----------------------------
DROP TABLE IF EXISTS `star_bar`;
CREATE TABLE `star_bar` (
  `user_id` int(11) NOT NULL,
  `bar_id` int(11) NOT NULL,
  `sign_num` int(11) DEFAULT '0',
  `exist` int(11) DEFAULT '1' COMMENT '若-1不存在1存在',
  `sign` int(11) DEFAULT '0',
  PRIMARY KEY (`user_id`,`bar_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of star_bar
-- ----------------------------

-- ----------------------------
-- Table structure for star_user
-- ----------------------------
DROP TABLE IF EXISTS `star_user`;
CREATE TABLE `star_user` (
  `user_id` int(11) NOT NULL,
  `star_id` int(11) NOT NULL,
  `exist` int(11) DEFAULT '1',
  PRIMARY KEY (`user_id`,`star_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of star_user
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `bar_id` int(11) NOT NULL DEFAULT '0',
  `user_id` int(11) NOT NULL DEFAULT '0',
  `exist` int(11) DEFAULT '1',
  PRIMARY KEY (`bar_id`,`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '1', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `register_date` date DEFAULT NULL,
  `pic_id` int(11) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `is_teacher` int(11) DEFAULT '-1',
  `is_manager` int(11) DEFAULT '-1',
  `exist` int(11) DEFAULT '1',
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Tin', '123456', '2015-09-27', '1', '13301145@bjtu.edu.cn', '-1', '-1', '0');
INSERT INTO `user` VALUES ('2', 'Yayoi', '123', '2015-09-28', '1', '13301136@bjtu.edu.cn', '-1', '-1', '1');
INSERT INTO `user` VALUES ('3', '蔡蓝天', '123', '2015-09-28', '1', '13301145@bjtu.edu.cn', '-1', '-1', '1');
INSERT INTO `user` VALUES ('4', '测试员', '123', '2015-09-28', '1', '13301145@bjtu.edu.cn', '-1', '-1', '1');
INSERT INTO `user` VALUES ('5', 'lantian', '123', '2015-10-11', '1', '13301145@qq.com', '-1', '-1', '1');
INSERT INTO `user` VALUES ('14', '456', '456', '2016-04-08', null, '456@qq.com', '-1', '-1', '1');
INSERT INTO `user` VALUES ('15', '123', '123', '2016-04-08', null, '123@qq.com', '-1', '-1', '1');
INSERT INTO `user` VALUES ('16', 'hehe', 'hehe', '2016-04-13', null, 'hehe@qq.com', '-1', '-1', '1');
