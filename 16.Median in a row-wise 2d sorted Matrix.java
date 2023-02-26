class Solution {
    public static int binarySearch(int [] arr, int mid){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m=(l+h)>>1;
            if(arr[m]<=mid) l=m+1;
            else h=m-1;
        }
        return l;
    }
    public static int median(int arr[][], int r, int c) {
        int low =1;
        int high=1000000000;
        
        while(low <=high){
            int mid=(low+high)>>1;
            int count=0;
            for(int i=0;i<r;i++){
                count += binarySearch(arr[i],mid);
            }
            if(count<=(r*c)/2){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}
