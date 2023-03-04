class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length;
        while(low<high){
            int mid=(low+high)>>1;
            if(arr[mid]-mid-1>=k) high=mid;
            else low=mid+1;
        }
        return low+k;
    }
}
