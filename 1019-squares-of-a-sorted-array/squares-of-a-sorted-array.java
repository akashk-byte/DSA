class Solution {
    public int[] sortedSquares(int[] nums) {
       int left = 0;
       int right = nums.length-1;
       int [] ans =  new int[nums.length];
       for(int i= nums.length-1;i>=0;i--){
        int leftsqrt = nums[left]*nums[left];
        int rightsqrt = nums[right]*nums[right];
        if(leftsqrt<rightsqrt){
            ans[i]=rightsqrt;
            right--;
        }
        else{
            ans[i]=leftsqrt;
            left++;
        }
       }
       return ans;
    }
}