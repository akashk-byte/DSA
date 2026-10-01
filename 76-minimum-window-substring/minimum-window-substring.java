class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[256];
        int[] have = new int[256];
        int minlen = Integer.MAX_VALUE;
        int left =0;
        int count = 0;
        int start = 0;
        for(char ch : t.toCharArray()){
            need[ch]++; 
        }
        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);
            have[ch]++;
            if(need[ch]>0 && have[ch]<=need[ch]){
                count++;
            }
            while(count == t.length()){
                //minvalue= Math.max(minvalue,right-left+1);
                int len = right-left+1;
                if(len<minlen){
                    minlen = len;
                    start=left;
                }
                char leftChar = s.charAt(left);
                if(need[leftChar] > 0 && have[leftChar] <= need[leftChar]){
                    count--;
                }
                    have[leftChar]--;
                    left++;
            }
        }if(minlen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minlen);
    }
}