class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        dictionary=defaultdict(list)
        for words in strs:
            count=[0]*26
            for char in words:
                count[ord(char)-ord('a')]+=1
            dictionary[tuple(count)].append(words)
        return list(dictionary.values())

        