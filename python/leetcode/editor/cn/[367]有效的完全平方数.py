# 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。 
# 
#  进阶：不要 使用任何内置的库函数，如 sqrt 。 
# 
#  
# 
#  示例 1： 
# 
#  
# 输入：num = 16
# 输出：true
#  
# 
#  示例 2： 
# 
#  
# 输入：num = 14
# 输出：false
#  
# 
#  
# 
#  提示： 
# 
#  
#  1 <= num <= 2^31 - 1 
#  
#  Related Topics 数学 二分查找 
#  👍 228 👎 0


# leetcode submit region begin(Prohibit modification and deletion)
class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num == 1:
            return True
        left = 0
        right = int(num / 2)
        while left <= right:
            mid = left + ((right - left) >> 1)
            mid2 = mid * mid
            if mid2 == num:
                return True
            elif mid2 < num:
                left = mid + 1
            elif mid2 > num:
                right = mid - 1
        return False

# leetcode submit region end(Prohibit modification and deletion)
