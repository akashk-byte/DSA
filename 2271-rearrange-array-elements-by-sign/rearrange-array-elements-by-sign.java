class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos =0;
        int neg=1;
     //int pos[]= new int[nums.length/2];
    // int[] neg= new int[nums.length/2];
     int[] ans= new int[nums.length];
     for(int i=0;i<nums.length;i++){
        if(nums[i]>=0){
            ans[pos]=nums[i];
            pos+=2;
        }
        else{
            ans[neg]=nums[i];
            neg+=2;
        }
     }
     /*for(int i=0;i<pos.length;i++){
        ans[2*i]= pos[i];
        ans[2*i+1]=neg[i];
     }*/
     return ans;

    }
}