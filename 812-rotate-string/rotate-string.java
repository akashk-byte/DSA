class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i =0;i<s.length();i++){
            if(s.length()!=goal.length()){
                return false;
            }
             String doubleString = s+s;
             if(doubleString.contains(goal)){
                return true;
             }
        }
        return false;
    }
}