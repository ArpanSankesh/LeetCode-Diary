class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < n; i += 3){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];

            if(c - a > k){
                return new int[0][0];
            }

            result.add(Arrays.asList(a,b,c));
        }
        int[][] output = new int[result.size()][3];
        for(int i = 0; i < result.size(); i++){
            List<Integer> group = result.get(i);
            output[i][0] = group.get(0);
            output[i][1] = group.get(1);
            output[i][2] = group.get(2);
        }

        return output;
    }
}