class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max = 0;
         
        for(int i = 0; i < n; i++){
            int j = (i + 1) % n;
            int diff = Math.abs(nums[i] - nums[j]); 
            if(max < diff){
                max = diff;
            }
            }
        return max;
        }
    }
