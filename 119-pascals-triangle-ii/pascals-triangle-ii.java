class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        long l=1;
        list.add(1);
        for(int i=1;i<=rowIndex;i++){
            l=l*(rowIndex-i+1);
            l=l/i;
            list.add((int)l);
        }
        return list;
    }
}