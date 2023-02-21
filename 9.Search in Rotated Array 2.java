class Solution {
    public static boolean Search(int n, int[] arr, int key) {
        int s=0,e=n-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            
            if(key==arr[mid]){
                return true;
            }
            
            if(arr[mid]==arr[s] && arr[mid]==arr[e]){
                s++;e--;
            }
            
            else if(arr[mid]>=arr[s]){
                if(arr[s]<=key && arr[mid]>=key) e=mid-1;
                else s=mid+1;
            }
            
            else {
                if(arr[mid]<=key && arr[e]>=key) s=mid+1;
                else e=mid-1;
            }
        }
        return false;
    }
}
