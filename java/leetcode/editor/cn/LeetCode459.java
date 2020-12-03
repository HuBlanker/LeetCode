// 标题:
//      重复的子字符串

// 描述:
//给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。 
//
// 示例 1: 
//
// 
//输入: "abab"
//
//输出: True
//
//解释: 可由子字符串 "ab" 重复两次构成。
// 
//
// 示例 2: 
//
// 
//输入: "aba"
//
//输出: False
// 
//
// 示例 3: 
//
// 
//输入: "abcabcabcabc"
//
//输出: True
//
//解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
// 
// Related Topics 字符串 
// 👍 357 👎 0


// 思路:

/**
 * Created by huyanshi on
 */

// ===============思路end=============


package editor.cn;

import util.*;

// My Code Start

public class LeetCode459 {
    public static void main(String[] args) {
        Solution solution = new LeetCode459().new Solution();

        System.out.println(solution.repeatedSubstringPattern("abab"));
        System.out.println(solution.repeatedSubstringPattern("abcabcabcabc"));
    }


// My Code End


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            int length = s.length();
            for (int i = 1; i < s.length(); i++) {
                if (length % i == 0) {
                    if (check(s, i)) {
                        return true;
                    }
                }
            }
            return false;
        }
        private boolean check(String s, int i) {
            String tmp = s.substring(0, i);
            for (int j = i; j < s.length(); j += i) {
                if (!tmp.equals(s.substring(j, j + i))) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}
