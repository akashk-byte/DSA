class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end = nums.length-1;
        for(int i =start;i<=end;i++){
            boolean left = (i==start || nums[i]>=nums[i-1]);
            boolean right  = (i==end || nums[i]>=nums[i+1]);
            if(left && right){
                return i;
            }
        }
        return 0;
    }
}