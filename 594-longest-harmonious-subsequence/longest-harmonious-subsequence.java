class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int longestHarmSeq = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);            
        }
        for(int i = 0; i < n; i++){
            int min = nums[i];
            int max = min + 1;
            int count = 0;
            if(map.containsKey(min) && map.containsKey(max)){
                count = map.get(min) + map.get(max);
            }
            longestHarmSeq = Math.max(longestHarmSeq, count);
        }
        return longestHarmSeq;
    }
}