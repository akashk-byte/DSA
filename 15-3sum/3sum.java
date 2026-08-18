class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int right = n-1;
            int left = i+1;
            while(left<right){
                int sum = nums[i]+nums[right]+nums[left];
                if(sum==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[right]);
                    list.add(nums[left]);
                    ans.add(list);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                    else if(sum>0){
                        right--;
                    }
                    else{
                        left++;
                    }
            }
        }
            return ans;
    }
}