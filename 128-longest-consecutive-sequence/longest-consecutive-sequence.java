class Solution {
    public int longestConsecutive(int[] nums) {
        int p=1;
        int c=1;
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else if(nums[i]==nums[i+1]-1){
                c++;
            }
            else{
                p=Math.max(p,c);
                c=1;
            }
        }
        p=Math.max(p,c);
        return p;
    }
}