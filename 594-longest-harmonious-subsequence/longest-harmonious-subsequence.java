class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int longestHarmSeq = 0;
        int n = nums.length;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);            
        }
        for(int key : map.keySet()){
            if(map.containsKey(key + 1)){
            int count = map.get(key) + map.get(key + 1);
            longestHarmSeq = Math.max(longestHarmSeq, count);
            }
        }
        return longestHarmSeq;
    }
}