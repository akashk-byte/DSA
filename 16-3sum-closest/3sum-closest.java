class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int max_diff = Integer.MAX_VALUE;
        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int left =i+1;
            int right =nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                int diff = Math.abs(sum-target);
                if(diff<max_diff){
                    max_diff=diff;
                    closest=sum;
                }
                else if(sum>target){
                    right--;
                }
                else if (sum<target){
                    left++;
                }
                else{
                    return target;
                }
                }
            }
        return closest ;
    }
}