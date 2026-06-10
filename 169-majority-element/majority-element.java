class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count =0;
        int temp=0;
        for(int i=0;i<n;i++){
            if(count==0){
                temp=nums[i];
            }
            if(nums[i]==temp){
                count++;
            }
            else{
                count--;
            }
        }
        return temp;
    }
}
    