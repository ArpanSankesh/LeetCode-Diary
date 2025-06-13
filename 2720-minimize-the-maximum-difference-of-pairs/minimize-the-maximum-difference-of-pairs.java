class Solution {
    public int minimizeMax(int[] nums, int p) {        
        Arrays.sort(nums);

        int lo = 0;
        int hi = nums[nums.length - 1] - nums[0];

        while(lo < hi){
            int mid = lo + (hi - lo) / 2;

            if(canFormPair(nums, mid, p)){
                hi = mid;
            }else{
                lo = mid+1;
            }
        }

       return lo;
    }

    private boolean canFormPair(int[] nums, int maxDiff, int p){
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] <= maxDiff){
                count++;
                i++;
            }
        }
        return count >= p;
    }
}