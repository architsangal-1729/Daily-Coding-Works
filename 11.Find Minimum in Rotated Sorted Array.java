class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int s=0,e=n-1;
        int minVal=Integer.MAX_VALUE;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[s]<arr[e]){
                minVal=Math.min(minVal,arr[s]);
                break;
            }
            if(arr[s]<=arr[mid]){
                minVal=Math.min(arr[s],minVal);
                s=mid+1;
            }
            if(arr[e]>=arr[mid]){
                minVal=Math.min(arr[mid],minVal);
                e=mid-1;
            }
        }
        return minVal;
    }
}   
