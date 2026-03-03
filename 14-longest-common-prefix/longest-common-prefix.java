class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstString=strs[0];
       for(int i=0;i<firstString.length();i++){
        for(int j=1;j<strs.length;j++){
            if(i>=strs[j].length() ||
            strs[j].charAt(i)!=firstString.charAt(i)){
                return firstString.substring(0,i);
            }
            }
            }
            return firstString;
            }
            }
            
       
    
