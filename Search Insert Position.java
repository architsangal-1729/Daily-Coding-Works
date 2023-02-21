class Solution
{
    static int searchInsertK(int arr[], int n, int k)
    {
        int s=0,e=n-1;
        int mid=-1;
        while(s<=e){
            mid=(s+e)/2;
            if(k==arr[mid]) return mid;
            else if(k>arr[mid]) s=mid+1;
            else e=mid-1;
        }
        return e+1;
      // OR return s;
    }
}
