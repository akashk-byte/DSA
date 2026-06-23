class Solution {
    public int missingNumber(int[] nums) {
        int expectedsum = 0;
        int arraysum = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            arraysum += nums[i];
            expectedsum = n*(n+1)/2;
        }
        int result = expectedsum-arraysum; 
        return result;
    }
}