// 标题:
//      两个数组的交集

// 描述:
//给定两个数组，编写一个函数来计算它们的交集。 
//
// 示例 1: 
//
// 输入: nums1 = [1,2,2,1], nums2 = [2,2]
//输出: [2]
// 
//
// 示例 2: 
//
// 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出: [9,4] 
//
// 说明: 
//
// 
// 输出结果中的每个元素一定是唯一的。 
// 我们可以不考虑输出结果的顺序。 
// 
// Related Topics 排序 哈希表 双指针 二分查找

// 思路:

/**
 * Created by huyanshi on 1911-13.
 * <p>
 * 1. 用哈希表做的一个简单粗暴的版本, 时间复杂度应该是O(m+n)2. 空间复杂度是,O(m+n). 因为重新用hash表存储了一份.
 * <p>
 * 2. 双指针
 * <p>
 * 3. 用java的retainall.
 */

// ===============思路end=============


package editor.cn;

import util.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// My Code Start

public class LeetCode349 {
    public static void main(String[] args) {
        Solution solution = new LeetCode349().new Solution();
        int[] intersection = solution.intersection3(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        System.out.println(Arrays.toString(intersection));
    }


// My Code End


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // 这是一个用hash表来做的的粗暴版本, 先找到全集, 然后遍历是否contains.
        public int[] intersection2(int[] nums1, int[] nums2) {
            Set<Integer> union = new HashSet<>();
            for (int i : nums1) {
                union.add(i);
            }

            for (int i : nums2) {
                union.add(i);
            }
            List<Integer> retL = new ArrayList<>();
            for (Integer integer : union) {
                if (contains(nums1, integer) && contains(nums2, integer)) {
                    retL.add(integer);
                }
            }
            int[] ret = new int[retL.size()];
            for (int i = 0; i < retL.size(); i++) {
                ret[i] = retL.get(i);
            }
            return ret;
        }

        private boolean contains(int[] nums1, Integer integer) {
            for (int i : nums1) {
                if (i == integer) return true;
            }
            return false;
        }

        // 双指针 解决
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);

            Set<Integer> ret = new HashSet<>();
            int i = 0, j = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    ret.add(nums1[i]);
                    i++;
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            int[] r = new int[ret.size()];
            int p = 0;
            for (int a : ret) {
                r[p] = a;
                p++;
            }
            return r;

        }

        public int[] intersection3(int[] nums1, int[] nums2) {
            Set<Integer> a = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
            Set<Integer> b = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
            a.retainAll(b);
            return a.stream().mapToInt(Integer::intValue).toArray();
        }

    }
//leetcode submit region end(Prohibit modification and deletion)


}
