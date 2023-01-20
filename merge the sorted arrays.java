class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0; 
        int j=0;
        int k=0;
        int tempArr[] = new int[m+n];
        while(j<n && i<m){
            if(nums1[i]<=nums2[j]){
                tempArr[k++]=nums1[i++];
            }
            else{
                tempArr[k++]=nums2[j++];
            }
        }
        while(i<m)  tempArr[k++]=nums1[i++];
        while(j<n)  tempArr[k++]=nums2[j++];
        for(int x=0;x<(m+n);x++)    nums1[x] = tempArr[x];
    }
}
