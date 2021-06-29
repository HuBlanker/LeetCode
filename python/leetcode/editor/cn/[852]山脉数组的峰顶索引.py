# 符合下列属性的数组 arr 称为 山脉数组 ：
#  
#  arr.length >= 3 
#  存在 i（0 < i < arr.length - 1）使得：
#  
#  arr[0] < arr[1] < ... arr[i-1] < arr[i] 
#  arr[i] > arr[i+1] > ... > arr[arr.length - 1] 
#  
#  
#  
# 
#  给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 
# 1] > ... > arr[arr.length - 1] 的下标 i 。 
# 
#  
# 
#  示例 1： 
# 
#  
# 输入：arr = [0,1,0]
# 输出：1
#  
# 
#  示例 2： 
# 
#  
# 输入：arr = [0,2,1,0]
# 输出：1
#  
# 
#  示例 3： 
# 
#  
# 输入：arr = [0,10,5,2]
# 输出：1
#  
# k
#  示例 4： 
# 
#  
# 输入：arr = [3,4,5,1]
# 输出：2
#  
# 
#  示例 5： 
# 
#  
# 输入：arr = [24,69,100,99,79,78,67,36,26,19]
# 输出：2
#  
# 
#  
# 
#  提示： 
# 
#  
#  3 <= arr.length <= 104 
#  0 <= arr[i] <= 106 
#  题目数据保证 arr 是一个山脉数组 
#  
# 
#  
# 
#  进阶：很容易想到时间复杂度 O(n) 的解决方案，你可以设计一个 O(log(n)) 的解决方案吗？ 
#  Related Topics 数组 二分查找 
#  👍 200 👎 0


# leetcode submit region begin(Prohibit modification and deletion)
class Solution(object):
    def peakIndexInMountainArray(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        left = 0
        right = len(arr) - 1
        while left <= right:
            pivot = left + ((right - left) >> 1)

            mid_v = arr[pivot]

            if left < pivot < right and mid_v > arr[pivot - 1] and mid_v > arr[pivot + 1]:
                return pivot
            if pivot < right:
                mid_r = arr[pivot + 1]
                if mid_v > mid_r:
                    right = pivot
                elif mid_v < mid_r:
                    left = pivot
            elif pivot > left:
                mid_l = arr[pivot - 1]
                if mid_v > mid_l:
                    left = pivot
                elif mid_v < mid_l:
                    right = pivot
        return left


# leetcode submit region end(Prohibit modification and deletion)


# 11122
s = Solution()
print(s.peakIndexInMountainArray([0, 1, 0]))
print(s.peakIndexInMountainArray([0, 2, 1, 0]))
print(s.peakIndexInMountainArray([0, 10, 5, 2]))
print(s.peakIndexInMountainArray([3, 4, 5, 1]))
print(s.peakIndexInMountainArray([24, 69, 100, 99, 79, 78, 67, 36, 26, 19]))
print(s.peakIndexInMountainArray([18, 29, 38, 59, 98, 100, 99, 98, 90]))
