class Solution {
    public static int smallestDivisor(int[] nums, int t) {
        int low=1;
        int high=1000000000;
        while(low<high){
            int sum=0;
            int mid=(low)+(high-low)/2;
            for(int i:nums){
                sum += (i+mid-1)/mid;
            }
            if(sum>t) low=mid+1;
            else high=mid;  
        }
        return low;
    }
}   
