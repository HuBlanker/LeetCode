// 标题:
//      排列硬币

// 描述:
//你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。 
//
// 给定一个数字 n，找出可形成完整阶梯行的总行数。 
//
// n 是一个非负整数，并且在32位有符号整型的范围内。 
//
// 示例 1: 
//
// 
//n = 5
//
//硬币可排列成以下几行:
//¤
//¤ ¤
//¤ ¤
//
//因为第三行不完整，所以返回2.
// 
//
// 示例 2: 
//
// 
//n = 8
//
//硬币可排列成以下几行:
//¤
//¤ ¤
//¤ ¤ ¤
//¤ ¤
//
//因为第四行不完整，所以返回3.
// 
// Related Topics 数学 二分查找

// 思路:

/**
 * Created by huyanshi on 191119.
 * <p>
 * 在 0-n之间2分查找, ( N * (N + 1) /2) < x.的这个边界值.
 */

// ===============思路end=============


package editor.cn;

import util.*;

// My Code Start

public class LeetCode441 {
    public static void main(String[] args) {
        Solution solution = new LeetCode441().new Solution();
        System.out.println(solution.arrangeCoins(8));
        System.out.println(solution.arrangeCoins(1804289383));
    }


// My Code End


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int arrangeCoins(int n) {
            int left = 0;
            int right = n;
            while (left <= right) {
                int mid = left + ((right - left) >> 1);
                long i = (long) mid * (mid + 1) / 2;
                if (i > Integer.MAX_VALUE) {
                    right = mid - 1;
                    continue;
                }
                if (i == n) return mid;
                if (i < n) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return right;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
