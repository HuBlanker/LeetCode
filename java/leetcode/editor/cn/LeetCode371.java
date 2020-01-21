// 标题:
//      两整数之和

// 描述:
//不使用运算符 + 和 - ，计算两整数 a 、b 之和。 
//
// 示例 1: 
//
// 输入: a = 1, b = 2
//输出: 3
// 
//
// 示例 2: 
//
// 输入: a = -2, b = 3
//输出: 1 
// Related Topics 位运算

// 思路:

/**
 * Created by huyanshi on
 */

// ===============思路end=============


package editor.cn;

import util.*;

// My Code Start

public class LeetCode371 {
    public static void main(String[] args) {
        Solution solution = new LeetCode371().new Solution();
    }


// My Code End


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int getSum(int a, int b) {
            while (b != 0) {
                int res = (a & b) << 1;
                a = a ^ b;
                b = res;
            }
            return a;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
