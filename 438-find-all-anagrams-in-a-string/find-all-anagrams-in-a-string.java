class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] need = new int[256];
        int[] have = new int[256];
        int left = 0;
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            need[ch]++;
        }
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            have[ch]++;
            if(right-left+1>p.length()){
                have[s.charAt(left)]--;
                left++;
            }
            if(Arrays.equals(have,need)){
                list.add(left);
            }
        }
        return list;
    }
}