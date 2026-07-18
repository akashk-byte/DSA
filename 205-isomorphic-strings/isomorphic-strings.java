class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> ans = new HashMap<>();
         HashMap<Character,Character> temp = new HashMap<>();
        for(int i=0;i<Math.min(s.length(),t.length());i++){
         char sc= s.charAt(i);
         char tc = t.charAt(i);
         if(ans.containsKey(sc)){
            if(ans.get(sc)!=tc){
                return false;
            }
         }
         if(temp.containsKey(tc)){
            if(temp.get(tc)!=sc){
                return false;
            }
         }
         ans.put(sc,tc);
         temp.put(tc,sc);
        }
        return true;    }
}