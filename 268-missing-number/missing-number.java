class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> numSet = new HashSet<>();

        for(int num: nums){
            numSet.add(num);
        }
        for(int i = 0; i <= n; i++){
            if(!numSet.contains(i)){
                return i;
            }
        }
        return -1;
    }
}