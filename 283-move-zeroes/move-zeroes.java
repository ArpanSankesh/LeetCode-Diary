class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int lastNonZero = 0;
        for (int i = 0 ; i < n; i++){
            if(nums[i] != 0 ){
                nums[lastNonZero] = nums[i]; 
                lastNonZero++;
            }
        }
        for(int i = lastNonZero; i < n; i++){
            nums[i] = 0;
        }

    }
}