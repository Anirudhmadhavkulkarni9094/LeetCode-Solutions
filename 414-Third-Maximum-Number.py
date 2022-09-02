# Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

# Example 1:

# Input: nums = [3,2,1]
# Output: 1
# Explanation:
# The first distinct maximum is 3.
# The second distinct maximum is 2.
# The third distinct maximum is 1.


# Example 2:

# Input: nums = [1,2]
# Output: 2
# Explanation:
# The first distinct maximum is 2.
# The second distinct maximum is 1.
# The third distinct maximum does not exist, so the maximum (2) is returned instead.


# Example 3:

# Input: nums = [2,2,3,1]
# Output: 1
# Explanation:
# The first distinct maximum is 3.
# The second distinct maximum is 2 (both 2's are counted together since they have the same value).
# The third distinct maximum is 1.

class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        arr1 = nums
        nums = set(nums)   #converting list nums to set to remove all duplicate
        nums = list(nums)  #converting back set to list to use index
        nums.sort()
        if(len(nums)<3):
            return nums[-1]  #checking if the length of new list is less than 3 so that 3rd largest number will be last number
        else:
            return nums[-3] #otherwise printing last 3 element
        
