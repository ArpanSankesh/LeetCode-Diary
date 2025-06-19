class Solution {
    public int maxArea(int[] height) {

        int amountOfWater = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int contHeight = Math.min(height[right], height[left]);
            int areaOfWater = width * contHeight;
            amountOfWater = Math.max(areaOfWater, amountOfWater);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return amountOfWater;
    }
}