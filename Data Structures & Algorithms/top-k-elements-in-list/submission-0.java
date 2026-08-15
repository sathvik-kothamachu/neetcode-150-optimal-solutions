class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int num : map.keySet()) {
            int frequency = map.get(num);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(num);
        }

        int[] res = new int[k];
        int count = 0;
        for (int i = bucket.length - 1; i >= 0 && count < k; i--) {

            if (bucket[i] != null) {

                for (Integer num : bucket[i]) {

                    if (count == k) {
                        break;
                    }

                    res[count++] = num;
                }
            }
        }

        return res;
    }
}