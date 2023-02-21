class Solution {
    public int singleNonDuplicate(int[] arr) {
        int s=0,e=arr.length-1;
        while(s<e){
            int mid=(s+e)/2;
            
            if((mid%2==1 && arr[mid]==arr[mid-1]) || (mid%2==0 && arr[mid]==arr[mid+1])){
                s=mid+1;
            }
            else {
                e=mid;
            }
        }
        return arr[s];
    }
}
