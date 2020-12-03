// 标题:
//      验证回文字符串 Ⅱ

// 描述:
//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。 
//
// 示例 1: 
//
// 
//输入: "aba"
//输出: True
// 
//
// 示例 2: 
//
// 
//输入: "abca"
//输出: True
//解释: 你可以删除c字符。
// 
//
// 注意: 
//
// 
// 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。 
// 
// Related Topics 字符串 
// 👍 289 👎 0


// 思路:

/**
 * Created by huyanshi on 20201203
 *
 * 1. 左右双指针
 * 2. 由于只允许删除一个字母, 因此在第一次遇到左右指针不同的时候
 * 3. 尝试删除左指针所在的字符, 监测之后的字符串是否回文, 如果不可行, 删除右指针所在的字符, 检测是否回文.
 * 4. 如果左右指针都试过, 不是回文字符串, 返回false, 否则返回true.
 */

// ===============思路end=============


package editor.cn;

// My Code Start

public class LeetCode680 {
    public static void main(String[] args) {
        Solution solution = new LeetCode680().new Solution();
        System.out.println(solution.validPalindrome("abbca"));
        System.out.println(solution.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }


// My Code End


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean validPalindrome(String s) {
            int i = 0;
            int j = s.length() - 1;
            while (j - i > 0) {
                char l = s.charAt(i);
                char r = s.charAt(j);
                if (l == r) {
                    i += 1;
                    j -= 1;
                } else {
                    int tmpI = i;
                    int tmpJ = j;
                    i += 1;
                    while (j - i > 0) {
                        l = s.charAt(i);
                        r = s.charAt(j);

                        if (l == r) {
                            i += 1;
                            j -= 1;
                        } else {
                            break;
                        }
                    }
                    if (j - i <= 0) return true;
                    i = tmpI;
                    j = tmpJ;
                    j = j - 1;
                    while (j - i > 0) {
                        l = s.charAt(i);
                        r = s.charAt(j);

                        if (l == r) {
                            i += 1;
                            j -= 1;
                        } else {
                            break;
                        }
                    }
                    if (j - i <= 0) return true;
                    return false;
                }
            }
            return true;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)


}
