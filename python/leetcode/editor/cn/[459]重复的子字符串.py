# 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。 
# 
#  示例 1: 
# 
#  
# 输入: "abab"
# 
# 输出: True
# 
# 解释: 可由子字符串 "ab" 重复两次构成。
#  
# 
#  示例 2: 
# 
#  
# 输入: "aba"
# 
# 输出: False
#  
# 
#  示例 3: 
# 
#  
# 输入: "abcabcabcabc"
# 
# 输出: True
# 
# 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
#  
#  Related Topics 字符串 
#  👍 357 👎 0


# leetcode submit region begin(Prohibit modification and deletion)


class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        l = len(s)
        for i in range(1, l):
            if l % i == 0:
                if self.check(s, i):
                    return True
        return False

    def check(self, s: str, i: int):
        tmp = s[0:i]
        for j in range(i, len(s), i):
            if tmp != s[j:j + i]:
                return False
        return True


# leetcode submit region end(Prohibit modification and deletion)

so = Solution()
print(so.repeatedSubstringPattern("aa"))
print(so.repeatedSubstringPattern("ab"))
print(so.repeatedSubstringPattern("abab"))
print(so.repeatedSubstringPattern("abcabc"))
print(so.repeatedSubstringPattern("ababc"))
