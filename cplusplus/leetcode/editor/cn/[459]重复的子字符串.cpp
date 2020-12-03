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




//leetcode submit region begin(Prohibit modification and deletion)
#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
    bool repeatedSubstringPattern(string s) {
        int len = s.length();
        for (int i = 1; i < len; ++i) {
            if (len % i == 0) {
                if (check(s, i)) {
                    return true;
                }

            }
        }
        return false;
    }

    bool check(string s, int i) {
        string tmp = s.substr(0, i);
        for (int j = i; j < s.length(); j += i) {
            if (tmp != s.substr(j, i)) {
                return false;
            }
        }
        return true;
    }
};
//leetcode submit region end(Prohibit modification and deletion)


int main(int argc, char **argv) {
    auto *solution = new Solution();
    std::cout << solution->repeatedSubstringPattern("abab") << endl;
    std::cout << solution->repeatedSubstringPattern("abb") << endl;
    std::cout << solution->repeatedSubstringPattern("aba") << endl;
    std::cout << solution->repeatedSubstringPattern("abcabc") << endl;
    std::cout << solution->repeatedSubstringPattern("aa") << endl;
}