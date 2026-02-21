class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        int r=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum= nums[i]+nums[j];
                if(sum==target){
                    result [r] = i;
                    r++;
                    result[r]= j;
                }
            }
        }
        return result;
}
}