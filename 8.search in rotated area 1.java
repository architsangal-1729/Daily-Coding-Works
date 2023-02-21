class Solution
{
    int search(int arr[], int s, int e, int key)
    {
        while(s<=e){
            int mid=(s+e)/2;
            if(key==arr[mid]) return mid;
            if(arr[mid]>=arr[s]){
                if(arr[s]<=key && arr[mid]>=key) e=mid-1;
                else s=mid+1;
            }
            else {
                if(arr[mid]<=key && arr[e]>=key) s=mid+1;
                else e=mid-1;
            }
        }
        return -1;
    }
}
