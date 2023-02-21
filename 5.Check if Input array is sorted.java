class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        int s=0;
        int e=n-1;
        while(s<=e && n!=1){
            if(arr[s]>arr[e] || arr[s]>arr[s+1] || arr[e]<arr[e-1]) return false;
            s++;e--;
        }
        return true;
    }
}
