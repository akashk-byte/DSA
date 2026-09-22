class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int max= 0;
        int maxlength = 0;
        int[] freq = new int[256];
        for(int right=0;right<s.length();right++){
            int index  = s.charAt(right)-'A';
            freq[index]++;
            max = Math.max(max,freq[index]);
            while((right-left+1)-max>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            int len = right-left+1;
            maxlength = Math.max(maxlength,len);
        }
        return maxlength;
    }
}