class Solution {
    public boolean isvalid(int[] freq1,int[] freq2){
        for(int i=0;i<256;i++){
            if(freq1[i]<freq2[i]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        //int arr = s.toCharArray();
        //int arr1 = t.toCharArray();
        int left =0;
        int start=0;
        int minlen = Integer.MAX_VALUE;
        //String str= new String();
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        //String ans = new String[];
        for(char c : t.toCharArray()){
            freq2[c]++;
        } 
        for(int right=0;right<s.length();right++){
             freq1[s.charAt(right)]++;

             while(isvalid(freq1,freq2)){
                int len = right-left+1;
                if(len<minlen){
                    minlen=len;
                    start=left;
                }
                freq1[s.charAt(left)]--;
                left++;
             }
        }
        if(minlen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minlen);
    }
}