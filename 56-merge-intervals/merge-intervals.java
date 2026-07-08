class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for(int i=1; i<intervals.length;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            int[] last = ans.get(ans.size()-1);
            int lastStart = last[0];
            int lastEnd = last[1];
            if(start<=lastEnd){
                last[1]=Math.max(lastEnd,end);
            }
            else{
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}