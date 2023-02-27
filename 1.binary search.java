    int binarysearch(int arr[], int n, int k) {
        // code here
        int s=0;
        int e=n-1;
        int mid=-1;
        while(s<=e){
            mid=s+(e-s)/2;
            if(k==arr[mid]){
                return mid;
            }
            else if(k<arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;//code ends
    }
}
