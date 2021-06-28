# 给你一个排序后的字符列表 letters ，列表中只包含小写英文字母。另给出一个目标字母 target，请你寻找在这一有序列表里比目标字母大的最小字母。 
# 
#  在比较时，字母是依序循环出现的。举个例子： 
# 
#  
#  如果目标字母 target = 'z' 并且字符列表为 letters = ['a', 'b']，则答案返回 'a' 
#  
# 
#  
# 
#  示例： 
# 
#  输入:
# letters = ["c", "f", "j"]
# target = "a"
# 输出: "c"
# 
# 输入:
# letters = ["c", "f", "j"]
# target = "c"
# 输出: "f"
# 
# 输入:
# letters = ["c", "f", "j"]
# target = "d"
# 输出: "f"
# 
# 输入:
# letters = ["c", "f", "j"]
# target = "g"
# 输出: "j"
# 
# 输入:
# letters = ["c", "f", "j"]
# target = "j"
# 输出: "c"
# 
# 输入:
# letters = ["c", "f", "j"]
# target = "k"
# 输出: "c"
#  
# 
#  
# 
#  提示： 
# 
#  
#  letters长度范围在[2, 10000]区间内。 
#  letters 仅由小写字母组成，最少包含两个不同的字母。 
#  目标字母target 是一个小写字母。 
#  
#  Related Topics 数组 二分查找 
#  👍 119 👎 0

from typing import List


# leetcode submit region begin(Prohibit modification and deletion)


class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        left = 0
        right = len(letters) - 1
        while left <= right:
            pivot = left + ((right - left) >> 1)
            mid_v = letters[pivot]
            if target == mid_v:
                # return letters[0] if (pivot + 1) == len(letters) else letters[pivot + 1]
                left = pivot + 1
            elif target < mid_v:
                right = pivot - 1
            elif target > mid_v:
                left = pivot + 1

        return letters[0] if left == len(letters) else letters[left]


# leetcode submit region end(Prohibit modification and deletion)

l = Solution().nextGreatestLetter(["c", "f", "j"], "a")
print(l)
l = Solution().nextGreatestLetter(["c", "f", "j"], "c")
print(l)
l = Solution().nextGreatestLetter(["c", "f", "j"], "d")
print(l)
l = Solution().nextGreatestLetter(["c", "f", "j"], "g")
print(l)
l = Solution().nextGreatestLetter(["c", "f", "j"], "j")
print(l)
l = Solution().nextGreatestLetter(["c", "f", "j"], "k")
print(l)
l = Solution().nextGreatestLetter(["e", "e", "e", "e", "e", "e", "n", "n", "n", "n"], "e")
print(l)
