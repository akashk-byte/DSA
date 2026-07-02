class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       HashSet<List<Integer>> ans = new HashSet<>();
       int n = nums.length;
       for(int i=0;i<n;i++){
        HashSet<Integer> seen = new HashSet<>();
        for(int j = i+1;j<n;j++){
            int third=  -(nums[i]+nums[j]);
            if(seen.contains(third)){
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[j]);
                temp.add(nums[i]);
                temp.add(third);
                Collections.sort(temp);
                ans.add(temp);
            }
            seen.add(nums[j]);
        }
       }
       return new ArrayList<>(ans);
    }
}