class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int max = Integer.MAX_VALUE;
        int sum =0;
        for(int right=0;right<nums.length;right++){
            sum +=nums[right];
            while(sum>=target){
                int len = right-left+1;
                  max = Math.min(max,len);
                sum -= nums[left];
                left++;
            }
        }
        if(max == Integer.MAX_VALUE){
            return 0;
        }
        return max;
    }
}