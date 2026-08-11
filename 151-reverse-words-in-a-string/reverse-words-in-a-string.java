class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] ab= s.trim().split("\\s+");
        for(int i = ab.length-1;i>=0;i--){
            if(result.length()>0){
                result.append(" ");
            }
            result.append(ab[i]);
        }
        return result.toString();
    }
}