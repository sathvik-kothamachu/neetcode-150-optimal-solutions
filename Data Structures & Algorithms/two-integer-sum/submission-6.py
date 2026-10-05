class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dictionary={}
        for index,num in enumerate(nums):
            dictionary[num]=index
        for index,num in enumerate(nums):
            diff=target-num
            if diff in dictionary and dictionary[diff]!=index:
                return [index,dictionary[diff]]
        return []
        