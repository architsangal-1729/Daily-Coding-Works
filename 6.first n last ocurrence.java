class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int s=0;
        int e=n-1;
        int mid=-1;
        int lastOcurr=-1;
        int firstOcurr=-1;
        while(s<=e){
            mid=(e+s)/2;
            if(x==arr[mid]){
                lastOcurr=mid;
                s=mid+1;
            }
            else if(x>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
         s=0;
         e=n-1;
         mid=-1;
        while(s<=e){
            mid=(e+s)/2;
            if(x==arr[mid]){
                firstOcurr=mid;
                e=mid-1;
            }
            else if(x>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        if(lastOcurr==-1 && firstOcurr==-1) return 0;
        
        return lastOcurr-firstOcurr+1;
    }
}
