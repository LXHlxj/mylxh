/*
 Navicat Premium Data Transfer

 Source Server         : myuser
 Source Server Type    : MySQL
 Source Server Version : 50648
 Source Host           : localhost:3306
 Source Schema         : user

 Target Server Type    : MySQL
 Target Server Version : 50648
 File Encoding         : 65001

 Date: 24/04/2021 01:25:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for yuangong3
-- ----------------------------
DROP TABLE IF EXISTS `yuangong3`;
CREATE TABLE `yuangong3`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(999) CHARACTER SET utf8 COLLATE utf8_croatian_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_croatian_ci NOT NULL COMMENT '名字',
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_croatian_ci NOT NULL COMMENT '性别',
  `chengren` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '0代表未成年，1代表成年',
  `xueji` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `gonzi` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL,
  `beian` varchar(10) CHARACTER SET utf8 COLLATE utf8_croatian_ci NOT NULL COMMENT '0代表无犯罪1代表有犯罪记录',
  `sfz` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NOT NULL COMMENT '身份证',
  `aihao` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NULL DEFAULT NULL COMMENT '爱好',
  `jineng` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NOT NULL COMMENT '技能',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_croatian_ci NOT NULL,
  `submittime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '入职时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36 CHARACTER SET = utf8 COLLATE = utf8_croatian_ci COMMENT = '0代表未成年\r\n1代表成年' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of yuangong3
-- ----------------------------
INSERT INTO `yuangong3` VALUES (3, 'L1000735', '刘红', '女', '0', '高中', '8888888', '0', 'xxxx', 'xx', 'c', '88888888', '2021-04-07 17:03:52');
INSERT INTO `yuangong3` VALUES (7, 'L1000732', '黑哥', '男', '0', 'xx', '50000', '1', 'xxx', 'xxx', 'xxx', '13547893874', '2021-04-09 19:34:51');
INSERT INTO `yuangong3` VALUES (8, 'L1000731', '天天', '男', '未成年', '本科', '30000', '0', 'xxxx', 'xxxxx\'x\'x', 'xxxxxx', 'xxx', '2021-04-06 18:11:17');
INSERT INTO `yuangong3` VALUES (9, 'L1000730', '啊啊', '男', '未成年', '本科', '30000', '0', 'xxxx', 'xxxxx\'x\'x', 'xxxxxx', 'xxx', '2021-04-06 18:10:55');
INSERT INTO `yuangong3` VALUES (12, 'L1000728', '请问', '男', '未成年', '本科', '50000', '0', 'xxxx', 'xxxxx\'x\'x', 'xxxxxx', '15928659674', '2021-04-10 15:09:56');
INSERT INTO `yuangong3` VALUES (17, 'L1000726', '瑶瑶', '男', '成年', '985', '99999', '1', 'xxxxxxx', 'a', 'aa', 'xxx', '2021-04-06 18:10:29');
INSERT INTO `yuangong3` VALUES (22, 'L1000721', '瑶瑶', '男', '成年', '985', '99999', '1', 'xxxxxxx', 'a', 'aa', 'xxx', '2021-04-06 18:09:58');
INSERT INTO `yuangong3` VALUES (23, 'L1000720', '瑶瑶', '男', '成年', '985', '99999', '1', 'xxxxxxx', 'a', 'aa', 'xxx', '2021-04-06 18:09:48');
INSERT INTO `yuangong3` VALUES (24, 'L1000719', '瑶瑶', '男', '成年', '985', '99999', '1', 'xxxxxxx', 'a', 'aa', 'xxx', '2021-04-06 18:09:38');
INSERT INTO `yuangong3` VALUES (25, 'L1000718', '瑶瑶', '男', '成年', '985', '99999', '1', 'xxxxxxx', 'a', 'aa', 'xxx', '2021-04-06 18:09:32');
INSERT INTO `yuangong3` VALUES (26, 'L1000717', '瑶瑶', '男', '成年', '985', '99999', '1', 'xxxxxxx', 'a', 'aa', 'xxx', '2021-04-06 18:09:27');
INSERT INTO `yuangong3` VALUES (27, 'L1000716', '瑶瑶', '男', '成年', '985', '99999', '1', 'xxxxxxx', 'a', 'aa', 'xxx', '2021-04-06 18:09:19');
INSERT INTO `yuangong3` VALUES (28, 'L1000715', '瑶瑶', '男', '成年', '985', '99999', '1', 'xxxxxxx', 'a', 'aa', 'xxx', '2021-04-06 18:09:12');
INSERT INTO `yuangong3` VALUES (29, 'L1000714', '瑶瑶', '男', '成年', '985', '99999', '1', 'xxxxxxx', 'a', 'aa', 'xxx', '2021-04-06 18:09:07');
INSERT INTO `yuangong3` VALUES (30, 'L1000713', '傻逼', '男', '成年', '985', '99999', '1', 'xxxxxxx', 'a', 'aa', 'xxx', '2021-04-06 18:08:59');
INSERT INTO `yuangong3` VALUES (32, 'L1000710', 'ada', '女', '未成年', '211', '2000000', '0', 'xxxxx', 'xxxx', 'xxxxx', 'xxxxxx', '2021-04-04 22:56:00');
INSERT INTO `yuangong3` VALUES (33, 'L1000388', '韩寒', '女', '未成年', '985', '200', '1', 'xxxxx', 'xxxx', 'xxxxx', '00', '2021-04-06 19:29:31');
INSERT INTO `yuangong3` VALUES (34, 'L1000771', '韩寒', '女', '未成年', '985', '2000000', '1', 'xxxxx', 'xxxx', 'xxxxx', 'xxxxxx', '2021-04-04 23:07:00');
INSERT INTO `yuangong3` VALUES (35, 'L1000627', '李强', '女', '未成年', '985', '5000', '0', '51382219980804175X', '', 'java', '13547893844', '2021-04-09 20:08:24');

SET FOREIGN_KEY_CHECKS = 1;
