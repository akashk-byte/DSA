class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left= 0;
        int right = k-1;
        double avg = (double)0;
        int sum=0;
        for(int i=left;i<=right;i++){
             sum  = sum +nums[i];
        }
             int maxsum = sum;
            avg = (double)sum/k;
            while(right<nums.length-1){
                left++;
                right++;

                sum = sum-nums[left-1]+nums[right];
                maxsum = Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
    }
}