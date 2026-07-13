class Solution {
    public int maxProduct(int[] nums) {
        int maxending=nums[0];
        int minending =nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            int peviousmax= maxending;
            int previousmin = minending;

            int op2 = peviousmax * nums[i];
            int op3 = previousmin * nums[i];
            int op1 = nums[i];
            maxending = Math.max(op1 , Math.max(op2,op3));
            minending = Math.min(op1 , Math.min(op2,op3));
            ans = Math.max(ans,maxending);
        }
        return ans;
    }
}