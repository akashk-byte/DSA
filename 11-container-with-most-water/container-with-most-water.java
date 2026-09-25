class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int area = 0;
        while(left<right){
            int x = right-left;

            int y = x * Math.min(height[left],height[right]);

            area = Math.max(y,area);

            if(height[right]<height[left]){
                right--;
            }
            else{
                left++;
            }
        }
        return area;
    }
}