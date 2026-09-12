class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j=0;
        int p = 0;
        int [] k = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]>=nums2[j]){
                k[p] = nums2[j];
                j++;
                p++;
            }
            else{
                k[p] = nums1[i];
                i++;
                p++;
            }
        }
        while(j<n){
            k[p] = nums2[j];
            j++;
            p++;
        }
        while(i<m){
            k[p] = nums1[i];
            i++;
            p++;
        }
        for(int x=0;x<m+n;x++){
            nums1[x]=k[x];
        }
    }
}