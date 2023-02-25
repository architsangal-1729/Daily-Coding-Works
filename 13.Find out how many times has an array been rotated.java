class Solution {
    int findKRotation(int arr[], int n) {
        int s=0;
        int e=n-1;
        int pivot=0;
        if(n==1 || arr[s]<arr[e]) return 0;
        else if(arr[e-1]>arr[e]) return e;
        while(s<=e){
            int mid=(s+e)>>1;
            if( arr[mid]>arr[n-1]){
                pivot = mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return pivot+1;
    }
}
