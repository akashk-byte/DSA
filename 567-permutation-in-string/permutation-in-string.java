class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] need = new int[256];
        int[] have  = new int[256];
        int left = 0;
        int len =0;
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            need[ch]++;
        }
        for(int right=0;right<s2.length();right++){
            char ch = s2.charAt(right);
            have[ch]++;
            if(right-left+1>s1.length()){
                have[s2.charAt(left)]--;
                left++;
            }
            if(Arrays.equals(need,have)){
        return true;   
            }
        }
                return false;
    }
}