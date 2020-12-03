// 标题:
//      存在重复元素

// 描述:
//给定一个整数数组，判断是否存在重复元素。 
//
// 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。 
//
// 
//
// 示例 1: 
//
// 输入: [1,2,3,1]
//输出: true 
//
// 示例 2: 
//
// 输入: [1,2,3,4]
//输出: false 
//
// 示例 3: 
//
// 输入: [1,1,1,3,3,4,3,2,4,2]
//输出: true 
// Related Topics 数组 哈希表 
// 👍 292 👎 0


// 思路:

/**
 * Created by huyanshi on
 * map
 */

// ===============思路end=============


package editor.cn;

import util.*;

import java.util.HashSet;
import java.util.Set;

// My Code Start

public class LeetCode217 {
    public static void main(String[] args) {
        Solution solution = new LeetCode217().new Solution();

        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

    }


// My Code End


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            if (nums == null || nums.length == 0) return false;
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return true;
                } else {
                    set.add(num);
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
