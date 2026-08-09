class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end =1;
        for(int i =0;i<s.length();i++){
            int odd = expend(s,i,i);
            int even = expend(s,i,i+1);  
            int len = Math.max(odd,even);
            int startindex = i-(len-1)/2;
            if(len>end-start){
                start = startindex;
                end= startindex+len;
            }
        }
        return s.substring(start,end);
    }
        private int expend(String s,int left,int right){
             while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                right++;
                left--;
            }
            return right - left -1;
    }
}
