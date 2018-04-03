/*
Navicat MySQL Data Transfer

Source Server         : testdjango
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : homepaym

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-03 21:43:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hpm_zhangwu
-- ----------------------------
DROP TABLE IF EXISTS `hpm_zhangwu`;
CREATE TABLE `hpm_zhangwu` (
  `zwid` int(11) NOT NULL AUTO_INCREMENT,
  `flname` varchar(200) DEFAULT NULL,
  `money` double DEFAULT NULL,
  `zhanghu` varchar(100) DEFAULT NULL,
  `createtime` date DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`zwid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hpm_zhangwu
-- ----------------------------
INSERT INTO `hpm_zhangwu` VALUES ('1', '吃饭支出', '247', '交行', '2018-03-02', '家庭聚餐');
INSERT INTO `hpm_zhangwu` VALUES ('2', '工资收入', '12345', '现金', '2018-03-15', '开工资');
INSERT INTO `hpm_zhangwu` VALUES ('3', '服装支出', '1998', '现金', '2018-04-02', '买衣服');
INSERT INTO `hpm_zhangwu` VALUES ('4', '吃饭支出', '325', '现金', '2018-06-18', '朋友聚餐');
INSERT INTO `hpm_zhangwu` VALUES ('5', '股票收入', '8000', '工行', '2018-10-28', '股票大涨');
INSERT INTO `hpm_zhangwu` VALUES ('6', '股票收入', '5000', '工行', '2018-10-28', '股票大涨');
INSERT INTO `hpm_zhangwu` VALUES ('7', '工资收入', '5000', '交行', '2018-10-28', '又开工资');
INSERT INTO `hpm_zhangwu` VALUES ('8', '礼金支出', '5000', '现金', '2018-10-28', '朋友结婚');
INSERT INTO `hpm_zhangwu` VALUES ('9', '其他支出', '1560', '现金', '2018-10-29', '丢钱');
INSERT INTO `hpm_zhangwu` VALUES ('10', '交通支出', '2300', '交行', '2018-10-29', '油价');
INSERT INTO `hpm_zhangwu` VALUES ('11', '吃饭支出', '1000', '工行', '2018-10-29', '又吃饭');
INSERT INTO `hpm_zhangwu` VALUES ('12', '工资收入', '1000', '现金', '2018-10-30', '开资');
INSERT INTO `hpm_zhangwu` VALUES ('13', '交通支出', '2000', '现金', '2018-10-30', '机票');
INSERT INTO `hpm_zhangwu` VALUES ('14', '工资收入', '2000', '现金', '2018-03-03', '收入啊');
INSERT INTO `hpm_zhangwu` VALUES ('16', '股票支出', '5000', '工行', '2018-04-02', '股票跌了');
