// 标题:
//      汇总区间

// 描述:
//给定一个无重复元素的有序整数数组 nums 。 
//
// 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 num
//s 的数字 x 。 
//
// 列表中的每个区间范围 [a,b] 应该按如下格式输出： 
//
// 
// "a->b" ，如果 a != b 
// "a" ，如果 a == b 
// 
//
// 
//
// 示例 1： 
//
// 输入：nums = [0,1,2,4,5,7]
//输出：["0->2","4->5","7"]
//解释：区间范围是：
//[0,2] --> "0->2"
//[4,5] --> "4->5"
//[7,7] --> "7"
// 
//
// 示例 2： 
//
// 输入：nums = [0,2,3,4,6,8,9]
//输出：["0","2->4","6","8->9"]
//解释：区间范围是：
//[0,0] --> "0"
//[2,4] --> "2->4"
//[6,6] --> "6"
//[8,9] --> "8->9"
// 
//
// 示例 3： 
//
// 输入：nums = []
//输出：[]
// 
//
// 示例 4： 
//
// 输入：nums = [-1]
//输出：["-1"]
// 
//
// 示例 5： 
//
// 输入：nums = [0]
//输出：["0"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 20 
// -231 <= nums[i] <= 231 - 1 
// nums 中的所有值都 互不相同 
// 
// Related Topics 数组 
// 👍 78 👎 0


// 思路:

/**
 * Created by huyanshi on 20201210
 * 双指针
 */

// ===============思路end=============


package editor.cn;

import java.util.ArrayList;
import java.util.List;

// My Code Start

public class LeetCode228 {
    public static void main(String[] args) {
        Solution solution = new LeetCode228().new Solution();
        System.out.println(solution.summaryRanges(new int[]{1, 3}));
        System.out.println(solution.summaryRanges(new int[]{2, 3}));
        System.out.println(solution.summaryRanges(new int[]{2, 3, 5}));
        System.out.println(solution.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }


// My Code End


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> summaryRanges2(int[] nums) {
            List<String> ret = new ArrayList<>();
            int left = 0, right = 0;
            boolean ing = false;
            int last = 0;
            for (int i = 0; i < nums.length; i++) {
                if (!ing) {
                    left = nums[i];
                    ing = true;
                    last = nums[i];
                    continue;
                }
                if (nums[i] - last == 1) {
                    last = nums[i];
                    if (i == nums.length - 1) {
                        ret.add(left + "->" + last);
                        ing = false;
                    }
                } else {
                    right = last;
                    // add to ret
                    if (left == right) {
                        ret.add(String.valueOf(left));
                    } else {
                        ret.add(left + "->" + right);
                    }
                    i--;

                    // other
                    ing = false;
                }

            }
            if (ing) {
                ret.add(String.valueOf(left));
            }
            return ret;
        }

        public List<String> summaryRanges(int[] nums) {
            List<String> ret = new ArrayList<>();
            int i = 0;
            int j = 0;
            for (; j < nums.length; j++ ) {
                if (j + 1 < nums.length && nums[j + 1] - nums[j] == 1) {
                    continue;
                }
                if (i == j  ) ret.add(nums[i] + "");
                else ret.add(nums[i] + "->" + nums[j]);
                i = j+1;
            }
            return ret;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
