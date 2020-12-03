# 给定一个整数数组，判断是否存在重复元素。 
# 
#  如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。 
# 
#  
# 
#  示例 1: 
# 
#  输入: [1,2,3,1]
# 输出: true 
# 
#  示例 2: 
# 
#  输入: [1,2,3,4]
# 输出: false 
# 
#  示例 3: 
# 
#  输入: [1,1,1,3,3,4,3,2,4,2]
# 输出: true 
#  Related Topics 数组 哈希表 
#  👍 292 👎 0


# leetcode submit region begin(Prohibit modification and deletion)
from typing import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        if nums is None or len(nums) == 0:
            return False
        d = {}
        for n in nums:
            if n in d:
                return True
            else:
                d[n] = n
        return False


# leetcode submit region end(Prohibit modification and deletion)

# s = Solution()
# print(s.containsDuplicate([1, 2, 3, 4]))
# print(s.containsDuplicate([1, 2, 3, 1]))

import random


def check(nums):
    a = nums[0]
    for i in nums[1:]:
        if a <= i:
            a = i
        else:
            return False
    return True


def monkey_sort(nums):
    fuck = 0
    while True:
        if check(nums):
            break
        random.shuffle(nums)
        fuck += 1
    print("monkey done. %d" % fuck)
    print(nums)


monkey_sort([3, 5, 6, 1])
monkey_sort([1, 2, 3, 4])
monkey_sort([1, 3, 2, 4])
