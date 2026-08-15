class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String ch: strs){
            char[] tempArray = ch.toCharArray();
            Arrays.sort(tempArray);
            String chr = new String(tempArray);
            if(!map.containsKey(chr)){
                map.put(chr, new ArrayList<>());
            }
            map.get(chr).add(ch);
        }
        return new ArrayList<>(map.values());
    }
}