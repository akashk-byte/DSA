class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxValue = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = minHeight * width;

            maxValue = Math.max(maxValue, area);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxValue;
    }
}