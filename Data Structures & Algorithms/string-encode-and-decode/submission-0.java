class Solution {

    public String encode(List<String> strs) {
        StringBuilder result=new StringBuilder();
        for(String str:strs){
            result.append(str.length()).append('#').append(str);

        }
        return result.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));

            j++;

            String str = s.substring(j, j + length);

            result.add(str);

            i = j + length;
        }

        return result;
    }
}
