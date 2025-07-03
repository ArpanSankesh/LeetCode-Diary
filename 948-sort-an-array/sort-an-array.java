class Solution {
    public int[] sortArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int minE = nums[0], maxE = nums[0];
        for(int num : nums){
            if (num < minE) minE = num;
            if (num > maxE) maxE = num;
        }
        int i = 0;
        for(int num = minE; num <= maxE; num++){
            while (map.getOrDefault(num, 0) > 0){
                nums[i++] = num;
                map.put(num, map.get(num) - 1);
            } 
        }
        return nums;
    }
}

                