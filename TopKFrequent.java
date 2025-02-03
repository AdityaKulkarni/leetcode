class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Map<Integer, Integer> topK = map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(k).collect(Collectors.toMap(
          Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));


        int[] res = new int[k];
        int i = 0;

        for(Map.Entry<Integer, Integer> entry: topK.entrySet()){
            res[i] = entry.getKey();
            i++;
        }

        return res;
        
    }
}