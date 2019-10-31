#coding=utf-8

# 暴力遍历两遍
def twoSum(nums: list, target: int) -> list:
    for i,n in enumerate(nums):
        j = i + 1
        while j < len(nums):
            if target == n + nums[j]:
                print([i,j])
                return [i,j]
            else:
                j = j + 1

if __name__ == "__main__":
    twoSum([2,3,7,1],9)