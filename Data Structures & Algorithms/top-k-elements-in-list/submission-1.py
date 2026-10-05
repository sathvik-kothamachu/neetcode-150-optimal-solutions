class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dictionary={}
        freq=[[] for i in range(len(nums)+1)]
        for num in nums:
            dictionary[num]=1+dictionary.get(num,0)
        for key,val in dictionary.items():
            freq[val].append(key)
        res=[]
        for i in range(len(freq)-1,0,-1):
            for j in freq[i]:
                res.append(j)
                if len(res)==k:
                    return res

        

        