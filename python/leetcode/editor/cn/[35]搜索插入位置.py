# 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
#
#  你可以假设数组中无重复元素。
#
#  示例 1:
#
#  输入: [1,3,5,6], 5
# 输出: 2
#
#
#  示例 2:
#
#  输入: [1,3,5,6], 2
# 输出: 1
#
#
#  示例 3:
#
#  输入: [1,3,5,6], 7
# 输出: 4
#
#
#  示例 4:
#
#  输入: [1,3,5,6], 0
# 输出: 0
#
#  Related Topics 数组 二分查找
#  👍 938 👎 0


# leetcode submit region begin(Prohibit modification and deletion)
class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        l = 0
        n = len(nums)
        r = n - 1
        ans = n
        while l <= r:
            m = int((l + r) / 2)
            if nums[m] >= target:
                ans = m
                r = m - 1
            else:
                l = m + 1
        return ans


# leetcode submit region end(Prohibit modification and deletion)


s = Solution()
print(s.searchInsert([1, 3, 5, 6], 5))
print(s.searchInsert([1, 3, 5, 6], 2))
print(s.searchInsert([1, 3, 5, 6], 7))
print(s.searchInsert([1, 3, 5, 6], 0))
