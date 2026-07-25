class Solution {
    public int maxDepth(String s) {
        int balance =0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ){
                balance++;
                //max= balance;
            }
            else if(s.charAt(i)==')'){
                balance--;
            }
            max= Math.max(max,balance);
        }
        return max;
    }
}