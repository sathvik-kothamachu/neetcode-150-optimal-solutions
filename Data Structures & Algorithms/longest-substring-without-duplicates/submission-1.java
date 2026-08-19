class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap <Character,Integer> map=new HashMap<>();
      int left=0;
      int max=0;

      for(int right=0;right<s.length();right++){
        char c=s.charAt(right);
        map.put(c,map.getOrDefault(c,0)+1);
        while(map.get(c)>1){
            char ch_left=s.charAt(left);
            map.put(ch_left,map.get(ch_left)-1);
            left++;
        }
        max=Math.max(max,right-left+1);
      }  
      return max;
    }
}
