class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int[][] result = new int[n/3][3];
        int groupIndex = 0;

        for(int i = 0; i < n; i += 3){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];

            if(c - a > k){
                return new int[0][0];
            }

            result[groupIndex][0] = a;
            result[groupIndex][1] = b;
            result[groupIndex][2] = c;
            groupIndex++;
        }
        return result;
    }
}