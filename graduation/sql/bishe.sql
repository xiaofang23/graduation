/*
 Navicat Premium Data Transfer

 Source Server         : l本机
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : bishe

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 09/03/2020 20:24:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_structure_id` int(11) NULL DEFAULT NULL COMMENT '为null表示为公共课，否则为专业课',
  `course_module_id` int(11) NULL DEFAULT NULL COMMENT '为null表示为没有模块的课，只有类别的课',
  `course_categroy_id` int(11) NULL DEFAULT NULL,
  `course_group_id` int(11) NULL DEFAULT NULL,
  `course_number` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `course_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `credit` float(11, 1) NULL DEFAULT NULL,
  `is_compulsory` tinyint(1) NULL DEFAULT NULL,
  `is_elective` tinyint(1) NULL DEFAULT NULL,
  `is_theoretical` tinyint(1) NULL DEFAULT NULL,
  `is_practical` tinyint(1) NULL DEFAULT NULL,
  `total_hour` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `theoretical_hour` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `practical_hour` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `is_test` tinyint(1) NULL DEFAULT NULL,
  `is_check` tinyint(1) NULL DEFAULT NULL,
  `score_method` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `pre_course_id` int(11) NULL DEFAULT NULL,
  `suggested_semester` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `status` int(4) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `expected_score` int(4) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, 0, 1, 1, 1, '61L020T', '思想道德修养与法律基础', 2.5, 1, 0, 1, 0, '48', '32', '16', 0, 1, '五级', NULL, '1', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (2, 0, 1, 1, 1, '61L016T', '中国近现代史纲要', 2.0, 1, 0, 1, 0, '32', '24', '8', 0, 1, '五级', NULL, '2', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (3, 0, 1, 1, 1, '61L021T', '马克思主义基本原理', 2.5, 1, 0, 1, 0, '48', '32', '16', 0, 1, '五级', NULL, '3', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (4, 0, 1, 1, 1, '61L022T', '毛泽东思想和中国特设社会主义理论体系概论', 3.0, 1, 0, 1, 0, '64', '32', '32', 0, 1, '五级', NULL, '4', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (5, 0, 1, 1, 1, '61S021T', '思想政治理论课社会实践', 1.0, 1, 0, 0, 1, '2周', '', '2周', 0, 1, '两级', NULL, '5', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (6, 0, 1, 1, 1, '61L007T', '形势与政策', 2.0, 1, 0, 1, 0, '32', '16', '16', 0, 1, '两级', NULL, '1-7', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (7, 0, 1, 1, 2, '62L211T', '综合英语基础', 4.0, 0, 1, 1, 0, '80', '64', '16', 0, 1, '五级', NULL, '1-3', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (8, 0, 1, 1, 2, '62L212T', '初级综合英语', 4.0, 0, 1, 1, 0, '80', '64', '16', 0, 1, '五级', NULL, '1-3', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (9, 0, 1, 1, 2, '62L213T', '中级综合英语', 4.0, 0, 1, 1, 0, '80', '64', '16', 0, 1, '五级', NULL, '1-3', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (10, 0, 1, 1, 2, '62L214T', '高级综合英语', 4.0, 0, 1, 1, 0, '80', '64', '16', 0, 1, '五级', NULL, '1-3', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (11, 0, 1, 1, 2, NULL, '大学英语拓展课程', 4.0, 0, 1, 1, 0, '80', '64', '16', 0, 1, '五级', NULL, '1-3', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (12, 0, 1, 1, 2, '62L215T', '英语综合能力', 12.0, 0, 1, 1, 0, NULL, NULL, NULL, 0, 1, '五级', NULL, '1-8', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (13, 0, 1, 1, 3, '85L073T', '大学计算机基础', 1.0, 0, 1, 1, 0, '32', '16', '16', 0, 1, '两级', NULL, '1', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (14, 0, 1, 1, 4, '00L133T', '军事理论', 0.5, 1, 0, 1, 0, '16', '16', '', 0, 1, '两级', NULL, '1', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (15, 0, 1, 1, 4, '00S001T', '军事训练', 2.5, 1, 0, 0, 1, '18天', NULL, '18天', 0, 1, '两级', NULL, '1', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (16, 0, 1, 1, 5, '60L009T', '体育丨', 1.0, 1, 0, 0, 1, '32', NULL, '32', 0, 1, '五级', NULL, '1', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (17, 0, 1, 1, 5, NULL, '体育选修课程', 3.0, 0, 1, 0, 1, '96', NULL, '96', 0, 1, '两级', NULL, '2-6', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (18, 0, 1, 2, 6, '73L187Q', '微积分（B）I', 6.0, 1, 0, 1, 0, '96', '96', NULL, 1, 0, '百分', NULL, '1', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (19, 0, 1, 2, 6, '73L178Q', '微积分（B）II', 5.0, 1, 0, 1, 0, '80', '80', NULL, 1, 0, '百分', NULL, '2', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (20, 0, 1, 2, 6, '73L160Q', '几何与代数（B）', 3.5, 1, 0, 1, 0, '56', '56', NULL, 1, 0, '百分', NULL, '1', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (21, 0, 1, 2, 6, '73L168Q', '概率论与数理统计（B）', 3.5, 1, 0, 1, 0, '56', '56', NULL, 1, 0, '百分', NULL, '4', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (22, 0, 1, 2, 7, '73L149Q', '大学物理（A）I', 4.0, 1, 0, 1, 0, '64', '64', NULL, 1, 0, '百分', NULL, '2', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (23, 0, 1, 2, 7, '73S194Q', '物理实验I', 1.0, 1, 0, 0, 1, '32', NULL, '32', 0, 1, '五级', NULL, '2', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (24, 0, 1, 2, 8, '73L170Q', '工科化学', 2.0, 1, 0, 1, 0, '32', '28', '4', 0, 1, '五级', NULL, '1', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (25, 0, 1, 3, 9, NULL, '创新创业类', 2.0, 0, 1, NULL, NULL, NULL, NULL, NULL, 0, 1, '两级', NULL, '2', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (26, 0, 1, 3, 9, NULL, '新生研讨课', 1.0, 0, 1, NULL, NULL, '16', NULL, NULL, 0, 1, '两级', NULL, '', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (27, 0, 1, 3, 9, NULL, '数学与自然科学类', NULL, 0, 1, NULL, NULL, NULL, NULL, NULL, 0, 1, '两级', NULL, NULL, 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (28, 0, 1, 3, 9, NULL, '工程与技术类', NULL, 0, 1, NULL, NULL, NULL, NULL, NULL, 0, 1, '两级', NULL, NULL, 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (29, 0, 1, 3, 9, NULL, '经济管理类', NULL, 0, 1, NULL, NULL, NULL, NULL, NULL, 0, 1, '两级', NULL, NULL, 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (30, 0, 1, 3, 9, NULL, '社会科学类', NULL, 0, 1, NULL, NULL, NULL, NULL, NULL, 0, 1, '两级', NULL, NULL, 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (31, 0, 1, 3, 9, NULL, '人文与艺术类', NULL, 0, 1, NULL, NULL, NULL, NULL, NULL, 0, 1, '两级', NULL, NULL, 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (32, 1, 2, 4, 11, '50L097T', '交通运输概论', 1.0, 1, 0, 1, 0, '16', '16', NULL, 0, 1, '两级', NULL, '1', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (33, 1, 2, 4, 12, '20L181Q', '工程图学基础', 2.0, 1, 0, 1, 0, '32', '26', '6', 0, 1, '五级', NULL, '1', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (34, 1, 2, 4, 12, '10L129Q', '电工技术', 2.0, 1, 0, 1, 0, '32', '26', '6', 1, 0, '百分', NULL, '2', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (35, 1, 2, 4, 12, 'A0L235Q', '软件工程专业导论', 1.0, 1, 0, 1, 0, '16', '12', '4', 0, 1, '两级', NULL, '1', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (36, 1, 2, 4, 12, 'A0L033Q', 'C语言程序设计', 3.0, 1, 0, 1, 0, '48', '32', '16', 1, 0, '百分', NULL, '2', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (37, 1, 2, 4, 12, 'A0S004Q', '程序设计综合实践', 2.0, 1, 0, 0, 1, '32', NULL, '32', 0, 1, '两级', NULL, 'S1', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (38, 1, 2, 4, 10, '14S017T', '电类工程素质训练Ⅰ', 1.0, 1, 0, 0, 1, '16', NULL, '16', 0, 1, '两级', NULL, '2', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56', NULL);
INSERT INTO `course` VALUES (39, 1, 3, 5, 13, 'A0L237Q', '面向对象的编程与设计', 2.0, 1, 0, 1, 0, '32', '32', NULL, 1, 0, '百分', NULL, '3', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (40, 1, 3, 5, 13, 'A0L323Q', '软件工程概论', 2.0, 1, 0, 1, 0, '32', '32', NULL, 1, 0, '百分', NULL, '3', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (41, 1, 3, 5, 13, 'A0L238Q', '数据结构', 2.0, 1, 0, 1, 0, '32', '32', NULL, 1, 0, '百分', NULL, '4', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (42, 1, 3, 5, 13, 'A0L268Q', '离散数学', 2.0, 1, 0, 1, 0, '32', '32', NULL, 1, 0, '百分', NULL, '4', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (43, 1, 3, 5, 13, 'A0L242Q', '计算机网络', 2.0, 1, 0, 1, 0, '32', '32', NULL, 1, 0, '百分', NULL, '5', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (44, 1, 3, 5, 13, 'A0L240Q', '操作系统', 2.0, 1, 0, 1, 0, '32', '32', NULL, 1, 0, '百分', NULL, '5', 1, '2020-03-07 21:06:56', '2020-03-07 21:06:56', 70);
INSERT INTO `course` VALUES (45, 1, 3, 5, 13, 'A0L241Q', '数据库系统', 2.0, 1, 0, 1, 0, '32', '32', NULL, 1, 0, '百分', NULL, '5', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (46, 1, 3, 5, 13, 'A0L128Q', '软件系统分析与设计技术', 2.0, 1, 0, 1, 0, '32', '32', NULL, 1, 0, '百分', NULL, '6', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (47, 1, 3, 5, 13, 'A0L248Q', '软件体系结构', 2.0, 1, 0, 1, 0, '32', '32', NULL, 1, 0, '百分', NULL, '6', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (48, 1, 3, 5, 13, 'A0L168Q', '软件项目管理', 2.0, 1, 0, 1, 0, '32', '32', NULL, 1, 0, '百分', NULL, '6', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (49, 1, 3, 5, 13, 'A0L345Q', '软件质量保证与测试技术', 2.0, 1, 0, 1, 0, '32', '32', NULL, 1, 0, '百分', NULL, '6', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (50, 1, 3, 5, 14, 'A0S183Q', '综合专题研究课程II', 2.0, 1, 0, 0, 1, '2周', NULL, '2周', 0, 1, '五级', NULL, 'S2', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (51, 1, 3, 5, 14, 'A0S184Q', '综合专题研究课程III', 2.0, 1, 0, 0, 1, '2周', NULL, '2周', 0, 1, '五级', NULL, 'S3', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (52, 1, 3, 5, 16, 'A0S180Q', '专业实习', 8.0, 1, 0, 0, 1, '24周', NULL, '24周', 0, 1, '五级', NULL, '7-8', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (53, 1, 3, 5, 15, 'A0S185Q', '毕业设计', 15.0, 1, 0, 0, 1, '16周', NULL, '16周', 0, 1, '五级', NULL, '8', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (54, 1, 3, 5, 17, 'A0S181Q', '面向对象与交互式应用开发综合实践', 2.0, 1, 0, 0, 1, '32', NULL, '32', 0, 1, '五级', NULL, '3', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (55, 1, 3, 5, 17, 'A0S600Q', '数据结构与算法综合实践', 2.0, 1, 0, 0, 1, '32', NULL, '32', 0, 1, '五级', NULL, '4', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (56, 1, 3, 5, 17, 'A0S182Q', '数据库应用系统综合实践', 2.0, 1, 0, 0, 1, '32', '', '32', 0, 1, '五级', NULL, '5', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (57, 1, 3, 5, 17, 'A0S178Q', '软件系统构思综合训练', 2.0, 1, 0, 0, 1, '32', NULL, '32', 0, 1, '五级', NULL, '6', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (58, 1, 3, 5, 18, 'A0L158Q', '软件法规与知识产权', 1.0, 0, 1, 1, 0, '16', NULL, NULL, 0, 1, '五级', NULL, '5', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (59, 1, 3, 5, 18, 'A0L328Q', '计算机组成原理', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '3', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (60, 1, 3, 5, 18, 'A0L244Q', '算法设计与实践', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '4', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (61, 1, 3, 5, 18, 'A0L245Q', 'C++程序设计', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '4', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (62, 1, 3, 5, 18, 'A0L251Q', '信息安全理论与实践', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '5', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (63, 1, 3, 5, 18, 'A0L243Q', '用户界面设计与评价', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '5', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (64, 1, 3, 5, 18, 'A0L346Q', 'Web前端开发技术', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '5', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (65, 1, 3, 5, 18, 'A0L253Q', '移动应用开发技术', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '5', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (66, 1, 3, 5, 18, 'A0L344Q', '非关系型数据库技术', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '5', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (67, 1, 3, 5, 18, 'A0L347Q', '软件过程与改进', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '6', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (68, 1, 3, 5, 18, 'A0L252Q', 'JAVA EE架构与应用', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '6', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (69, 1, 3, 5, 18, 'A0L254Q', 'Linux操作系统与网络编程', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '6', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (70, 1, 3, 5, 18, 'A0L348Q', '数据挖掘与大数据分析', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '6', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (71, 1, 3, 5, 18, 'A0L343Q', '软件产品分析设计与运营', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '6', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);
INSERT INTO `course` VALUES (72, 1, 3, 5, 18, 'A0L349Q', '前沿技术专题', 2.0, 0, 1, 1, 0, '32', '32', NULL, 0, 1, '五级', NULL, '6', 1, '2020-03-07 21:07:46', '2020-03-07 21:07:46', 70);

-- ----------------------------
-- Table structure for course_category
-- ----------------------------
DROP TABLE IF EXISTS `course_category`;
CREATE TABLE `course_category`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `status` int(4) NOT NULL,
  `module_id` int(11) NOT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_category
-- ----------------------------
INSERT INTO `course_category` VALUES (1, '公共基础课', 1, 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_category` VALUES (2, '数学及自然科学', 1, 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_category` VALUES (3, '素质类', 1, 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_category` VALUES (4, '大类公共类', 1, 2, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_category` VALUES (5, '专业类', 1, 3, '2020-03-07 20:15:41', '2020-03-07 20:15:56');

-- ----------------------------
-- Table structure for course_eva_result
-- ----------------------------
DROP TABLE IF EXISTS `course_eva_result`;
CREATE TABLE `course_eva_result`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) NULL DEFAULT NULL,
  `score` float(5, 2) NULL DEFAULT NULL,
  `student_level` int(4) NULL DEFAULT NULL,
  `eva_time` datetime(0) NULL DEFAULT NULL,
  `eav_cal_json` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `status` int(4) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for course_group
-- ----------------------------
DROP TABLE IF EXISTS `course_group`;
CREATE TABLE `course_group`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `module_id` int(11) NOT NULL,
  `category_id` int(11) NOT NULL,
  `group_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `status` int(4) NOT NULL,
  `structure_id` int(11) NOT NULL,
  `theory_compulsory_credit` float(11, 1) NOT NULL,
  `theory_elective_credit` float(11, 1) NOT NULL,
  `practical_compulsory_credit` float(11, 1) NOT NULL,
  `practical_elective_credit` float(11, 1) NOT NULL,
  `total_credit` float(11, 1) NOT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_group
-- ----------------------------
INSERT INTO `course_group` VALUES (1, 1, 1, '思想政治课', 1, 0, 12.0, 0.0, 1.0, 0.0, 13.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (2, 1, 1, '外语课', 1, 0, 0.0, 0.0, 0.0, 0.0, 12.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (3, 1, 1, '计算机课', 1, 0, 0.0, 1.0, 0.0, 0.0, 1.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (4, 1, 1, '军事课', 1, 0, 0.5, 0.0, 2.5, 0.0, 3.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (5, 1, 1, '体育课', 1, 0, 0.0, 0.0, 1.0, 3.0, 4.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (6, 1, 2, '数学课', 1, 0, 18.0, 0.0, 0.0, 0.0, 18.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (7, 1, 2, '物理课', 1, 0, 4.0, 0.0, 1.0, 0.0, 5.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (8, 1, 2, '化学课', 1, 0, 2.0, 0.0, 0.0, 0.0, 2.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (9, 1, 3, '素质类', 1, 0, 0.0, 0.0, 0.0, 0.0, 11.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (10, 2, 4, '工程训练', 1, 1, 0.0, 0.0, 1.0, 0.0, 1.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (11, 2, 4, '交通运输概论', 1, 1, 1.0, 0.0, 0.0, 0.0, 1.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (12, 2, 4, '工程基础课/大类基础课', 1, 1, 8.0, 0.0, 2.0, 0.0, 10.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (13, 3, 5, '专业核心课', 1, 1, 22.0, 0.0, 0.0, 0.0, 22.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (14, 3, 5, '综合专题研究课', 1, 1, 0.0, 0.0, 4.0, 0.0, 4.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (15, 3, 5, '毕业设计（论文）', 1, 1, 0.0, 0.0, 15.0, 0.0, 15.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (16, 3, 5, '专业实习', 1, 1, 0.0, 0.0, 8.0, 0.0, 8.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (17, 3, 5, '综合实践', 1, 1, 0.0, 0.0, 8.0, 0.0, 8.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_group` VALUES (18, 3, 5, '专业选修课', 1, 1, 0.0, 17.0, 0.0, 0.0, 17.0, '2020-03-07 20:15:41', '2020-03-07 20:15:56');

-- ----------------------------
-- Table structure for course_module
-- ----------------------------
DROP TABLE IF EXISTS `course_module`;
CREATE TABLE `course_module`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `module_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `status` int(4) NOT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_module
-- ----------------------------
INSERT INTO `course_module` VALUES (1, '通识与公共基础类', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_module` VALUES (2, '大类公共课', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56');
INSERT INTO `course_module` VALUES (3, '专业课', 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56');

-- ----------------------------
-- Table structure for course_structure
-- ----------------------------
DROP TABLE IF EXISTS `course_structure`;
CREATE TABLE `course_structure`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `type` int(4) NOT NULL,
  `total_credit` int(11) NOT NULL,
  `compulsory_credit` int(11) NOT NULL,
  `elective_credit` int(11) NOT NULL,
  `status` int(4) NOT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_structure
-- ----------------------------
INSERT INTO `course_structure` VALUES (1, '理工类课程体系', 1, 155, 111, 44, 1, '2020-03-07 20:15:41', '2020-03-07 20:15:56');

-- ----------------------------
-- Table structure for graduation_point
-- ----------------------------
DROP TABLE IF EXISTS `graduation_point`;
CREATE TABLE `graduation_point`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `target_id` int(11) NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `status` int(4) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of graduation_point
-- ----------------------------
INSERT INTO `graduation_point` VALUES (1, 1, '1.1 具有扎实的数学、自然科学基础。', 1, '2020-03-08 10:36:43', '2020-03-08 10:34:52');
INSERT INTO `graduation_point` VALUES (2, 1, '1.2 掌握解决复杂软件工程问题所必需的计算科学基础知识。', 1, '2020-03-08 10:45:36', '2020-03-08 10:45:34');
INSERT INTO `graduation_point` VALUES (3, 1, '\r\n1.3 掌握解决复杂软件工程问题所必需的工程基础和软件工程专业知识。\r\n', 1, '2020-03-08 10:45:38', '2020-03-08 10:45:36');
INSERT INTO `graduation_point` VALUES (4, 2, '\r\n2.1能够应用数学、自然科学和工程科学基本原理，识别、分析、判断复杂工程问题的关键环节、参数和影响因素。\r\n', 1, '2020-03-08 10:45:31', '2020-03-08 10:45:31');
INSERT INTO `graduation_point` VALUES (5, 2, '\r\n2.2能够针对软件工程问题或软件系统建立合适的模型，清晰地表达和描述复杂软件工程问题。\r\n', 1, '2020-03-08 10:45:39', '2020-03-08 10:45:39');
INSERT INTO `graduation_point` VALUES (6, 2, '\r\n2.3能够运用基本原理，借助文献研究，提出多种解决方案，分析方案优劣及其可行性。\r\n', 1, '2020-03-08 10:45:39', '2020-03-08 10:45:39');
INSERT INTO `graduation_point` VALUES (7, 3, '\r\n3.1能够基于分析明确定义需求，并根据特定需求确定设计目标和约束条件。\r\n', 1, '2020-03-08 10:45:40', '2020-03-08 10:45:40');
INSERT INTO `graduation_point` VALUES (8, 3, '\r\n3.2针对需求和目标，完成系统、算法、模块或部件等的设计与实现，以及软件过程的改进，体现创新意识。\r\n', 1, '2020-03-08 10:45:42', '2020-03-08 10:45:42');
INSERT INTO `graduation_point` VALUES (9, 3, '\r\n3.3在设计和实现过程中，综合考虑社会、健康、安全、法律、文化及环境等的影响，能够从系统的角度权衡复杂工程问题所涉及的相关因素。\r\n', 1, '2020-03-08 10:45:42', '2020-03-08 10:45:42');
INSERT INTO `graduation_point` VALUES (10, 4, '\r\n4.1能够基于科学原理并采用科学方法对复杂软件工程问题进行分析，建立定性或定量模型并研究比较，设计合理的解决方案。\r\n', 1, '2020-03-08 10:45:43', '2020-03-08 10:45:43');
INSERT INTO `graduation_point` VALUES (11, 4, '\r\n4.2 能够优选开发环境与技术方案，采用科学方法实现解决方案。\r\n', 1, '2020-03-08 10:45:43', '2020-03-08 10:45:43');
INSERT INTO `graduation_point` VALUES (12, 4, '\r\n4.3 能够正确采集、整理和分析数据，并对结果进行解释和评价，获取合理有效的结论。\r\n', 1, '2020-03-08 10:45:43', '2020-03-08 10:45:43');
INSERT INTO `graduation_point` VALUES (13, 5, '\r\n5.1 能熟练使用软件工程工具与技术手段，正确表达复杂软件工程问题，设计和实现相应解决方案。\r\n', 1, '2020-03-08 10:45:44', '2020-03-08 10:45:44');
INSERT INTO `graduation_point` VALUES (14, 5, '\r\n5.2能熟练使用文献检索工具，获取复杂软件工程问题的相关科技文献及软件工程领域的最新进展。\r\n', 1, '2020-03-08 10:45:44', '2020-03-08 10:45:44');
INSERT INTO `graduation_point` VALUES (15, 5, '\r\n5.3能选择并使用恰当的技术、资源、现代软件工程工具，完成软件工程问题的预测和模拟，或软件工程项目的确认和验证，并能够理解其局限性。\r\n', 1, '2020-03-08 10:45:44', '2020-03-08 10:45:44');
INSERT INTO `graduation_point` VALUES (16, 6, '\r\n6.1具有软件工程实习和社会实践的经历。\r\n', 1, '2020-03-08 10:45:45', '2020-03-08 10:45:45');
INSERT INTO `graduation_point` VALUES (17, 6, '\r\n6.2了解软件工程专业领域相关的技术标准、知识产权、产业政策、法律法规，了解企业管理体系和业务流程。\r\n', 1, '2020-03-08 10:45:45', '2020-03-08 10:45:45');
INSERT INTO `graduation_point` VALUES (18, 6, '\r\n6.3 能够客观评价复杂软件工程问题解决方案的实施对社会、健康、安全、法律以及文化的影响，并理解应承担的责任。\r\n', 1, '2020-03-08 10:45:45', '2020-03-08 10:45:45');
INSERT INTO `graduation_point` VALUES (19, 7, '\r\n7.1理解软件工程的环境背景和社会可持续发展的内涵和意义。\r\n', 1, '2020-03-08 10:45:46', '2020-03-08 10:45:46');
INSERT INTO `graduation_point` VALUES (20, 7, '\r\n7.2 能够评价复杂软件工程问题的工程实践对环境与可持续发展产生的影响。\r\n', 1, '2020-03-08 10:45:46', '2020-03-08 10:45:46');
INSERT INTO `graduation_point` VALUES (21, 8, '\r\n8.1具有人文知识、科学素养和社会责任感，理解社会主义核心价值观。\r\n', 1, '2020-03-08 10:45:46', '2020-03-08 10:45:46');
INSERT INTO `graduation_point` VALUES (22, 8, '\r\n8.2在软件工程实践中，理解并遵守工程职业道德和规范，具有法律意识，履行职责。\r\n', 1, '2020-03-08 10:45:47', '2020-03-08 10:45:47');
INSERT INTO `graduation_point` VALUES (23, 9, '\r\n9.1能够独立完成团队分配的任务，共享信息、倾听意见，具有协作精神和技能。\r\n', 1, '2020-03-08 10:45:47', '2020-03-08 10:45:47');
INSERT INTO `graduation_point` VALUES (24, 9, '\r\n9.2在多学科背景下的团队中，理解团队成员的不同角色，并根据工作需要承担相应的责任。\r\n', 1, '2020-03-08 10:45:47', '2020-03-08 10:45:47');
INSERT INTO `graduation_point` VALUES (25, 10, '\n10.1能够就复杂软件工程问题通过口头、书面、设计图表等方式与业界同行及社会公众进行有效沟通和交流。\n', 1, '2020-03-08 10:45:48', '2020-03-08 10:45:48');
INSERT INTO `graduation_point` VALUES (26, 10, '\n10.2 熟练掌握英语的听说读写能力，具有国际化视野和跨文化交流能力。\n', 1, '2020-03-08 10:45:48', '2020-03-08 10:45:48');
INSERT INTO `graduation_point` VALUES (27, 11, '\n11.1理解并掌握软件工程管理原理和经济决策方法\n', 1, '2020-03-08 10:45:48', '2020-03-08 10:45:48');
INSERT INTO `graduation_point` VALUES (28, 11, '\n11.2能够将软件工程项目管理原理与经济决策方法应用于产品开发、过程改进、系统运维等过程中。\n', 1, '2020-03-08 10:45:49', '2020-03-08 10:45:49');
INSERT INTO `graduation_point` VALUES (29, 12, '\n12.1能认识不断探索和学习的必要性，具有自主学习和终身学习的意识。\n', 1, '2020-03-08 10:45:49', '2020-03-08 10:45:49');
INSERT INTO `graduation_point` VALUES (30, 12, '\n12.2掌握自主学习和终身学习的方法和技能，能针对个人或职业发展的需要，主动学习，适应发展。\n', 1, '2020-03-08 10:45:50', '2020-03-08 10:45:50');

-- ----------------------------
-- Table structure for graduation_point_course
-- ----------------------------
DROP TABLE IF EXISTS `graduation_point_course`;
CREATE TABLE `graduation_point_course`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `point_id` int(11) NULL DEFAULT NULL,
  `course_id` int(11) NULL DEFAULT NULL,
  `proportion` int(4) NULL DEFAULT NULL,
  `expected_score` int(4) NULL DEFAULT NULL,
  `status` int(4) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for graduation_point_course_eva_result
-- ----------------------------
DROP TABLE IF EXISTS `graduation_point_course_eva_result`;
CREATE TABLE `graduation_point_course_eva_result`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `point_course_id` int(11) NULL DEFAULT NULL,
  `score` float(5, 2) NULL DEFAULT NULL,
  `student_level` int(4) NULL DEFAULT NULL,
  `eva_time` datetime(0) NULL DEFAULT NULL,
  `eva_cal_json` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `status` int(4) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for graduation_point_eva_result
-- ----------------------------
DROP TABLE IF EXISTS `graduation_point_eva_result`;
CREATE TABLE `graduation_point_eva_result`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `point_id` int(11) NULL DEFAULT NULL,
  `score` float(5, 2) NULL DEFAULT NULL,
  `student_level` int(4) NULL DEFAULT NULL,
  `eva_time` datetime(0) NULL DEFAULT NULL,
  `status` int(4) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for graduation_target
-- ----------------------------
DROP TABLE IF EXISTS `graduation_target`;
CREATE TABLE `graduation_target`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `evaluation_method` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `evaluation_cycle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `responsible` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `evaluation_basis` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `assessment_method` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `status` int(4) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `update_time` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of graduation_target
-- ----------------------------
INSERT INTO `graduation_target` VALUES (1, '工程知识', '掌握解决复杂软件工程问题所必需的数学、自然科学、计算科学基础、工程基础和软件工程专业知识。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:39', '2020-03-08 10:33:39');
INSERT INTO `graduation_target` VALUES (2, '问题分析', '能够应用数学、自然科学和工程科学的基本原理，识别、表达、并通过文献研究分析复杂软件工程问题，以获得有效结论。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:39', '2020-03-08 10:33:39');
INSERT INTO `graduation_target` VALUES (3, '设计/开发解决方案', '能够设计针对复杂软件工程问题的解决方案，设计满足特定需求的软件系统、部件或软件过程，并能够在设计环节中体现创新意识，考虑社会、健康、安全、法律、文化以及环境等因素。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:39', '2020-03-08 10:33:39');
INSERT INTO `graduation_target` VALUES (4, '研究', '能够基于科学原理并采用科学方法对复杂软件工程问题进行研究，包括设计实验、分析与解释数据、并通过信息综合得到合理有效的结论。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:40', '2020-03-08 10:33:40');
INSERT INTO `graduation_target` VALUES (5, '使用现代工具', '能够针对复杂软件工程问题，开发、选择与使用恰当的技术、资源、现代软件工程工具和信息技术工具，包括对复杂软件工程问题的预测与模拟，并能够理解其局限性。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:40', '2020-03-08 10:33:40');
INSERT INTO `graduation_target` VALUES (6, '工程与社会', '能够基于工程相关背景知识进行合理分析，评价软件工程实践和复杂软件工程问题解决方案对社会、健康、安全、法律以及文化的影响，并理解应承担的责任。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:40', '2020-03-08 10:33:40');
INSERT INTO `graduation_target` VALUES (7, '环境与可持续发展', '能够理解和评价针对复杂软件工程问题的工程实践对环境、社会可持续发展的影响。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:40', '2020-03-08 10:33:40');
INSERT INTO `graduation_target` VALUES (8, '职业规范', '具有人文社会科学素养、社会责任感，能够在软件工程实践中理解并遵守工程职业道德和规范，履行责任。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:41', '2020-03-08 10:33:41');
INSERT INTO `graduation_target` VALUES (9, '个人与团队', '能够在多学科背景下的团队中承担个体、团队成员以及负责人的角色。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:41', '2020-03-08 10:33:41');
INSERT INTO `graduation_target` VALUES (10, '沟通', '能够就复杂软件工程问题与业界同行及社会公众进行有效沟通和交流，包括撰写报告和设计文稿、陈述发言、清晰表达或回应指令。并具备一定的国际视野，能够在跨文化背景下进行沟通和交流。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:41', '2020-03-08 10:33:41');
INSERT INTO `graduation_target` VALUES (11, '项目管理', '理解并掌握软件工程管理原理与经济决策方法，并能在多学科环境中应用。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:41', '2020-03-08 10:33:41');
INSERT INTO `graduation_target` VALUES (12, '终身学习', '具有自主学习和终身学习的意识，有不断学习和适应发展的能力。', NULL, NULL, NULL, NULL, NULL, 1, '2020-03-08 10:33:44', '2020-03-08 10:33:44');

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence`  (
  `next_val` bigint(20) NULL DEFAULT NULL
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES (1);
INSERT INTO `hibernate_sequence` VALUES (1);
INSERT INTO `hibernate_sequence` VALUES (1);
INSERT INTO `hibernate_sequence` VALUES (1);
INSERT INTO `hibernate_sequence` VALUES (1);

SET FOREIGN_KEY_CHECKS = 1;
