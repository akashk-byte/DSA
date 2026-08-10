class Solution {
    public int beautySum(String s) {
        int result =0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=i;j<s.length();j++){
               // substring.add(s.substring(i,j));
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                int max =0;
                int min = Integer.MAX_VALUE;
                for(int frequency : map.values()){
                    max= Math.max(max,frequency);
                    min= Math.min(min,frequency);
                }
                 int beauty = max-min;
                result = result + beauty;
            }
        }
        return result;
    }
}