// 标题:
//      上升的温度

// 描述:
//
// 
// 表 Weather 
//
// 
//+---------------+---------+
//| Column Name   | Type    |
//+---------------+---------+
//| id            | int     |
//| recordDate    | date    |
//| temperature   | int     |
//+---------------+---------+
//id 是这个表的主键
//该表包含特定日期的温度信息 
//
// 
//
// 编写一个 SQL 查询，来查找与之前（昨天的）日期相比温度更高的所有日期的 id 。 
//
// 返回结果 不要求顺序 。 
//
// 查询结果格式如下例： 
//
// 
//Weather
//+----+------------+-------------+
//| id | recordDate | Temperature |
//+----+------------+-------------+
//| 1  | 2015-01-01 | 10          |
//| 2  | 2015-01-02 | 25          |
//| 3  | 2015-01-03 | 20          |
//| 4  | 2015-01-04 | 30          |
//+----+------------+-------------+
//
//Result table:
//+----+
//| id |
//+----+
//| 2  |
//| 4  |
//+----+
//2015-01-02 的温度比前一天高（10 -> 25）
//2015-01-04 的温度比前一天高（20 -> 30）
// 
// 
// 
// 👍 164 👎 0


// 思路:

/**
 * Created by huyanshi on 
 */
 
// ===============思路end=============

 
package editor.cn;

import util.*;

// My Code Start

public class LeetCode197{
       public static void main(String[] args) {
//            Solution solution = new LeetCode197().new Solution();
      }


// My Code End


//There is no code of Java type for this problem

    // select id from  Weather where Temperature > (select Temperature from Weather
    // where recordDate = DATE_SUB(curdate(),INTERVAL -1 DAY))


}
