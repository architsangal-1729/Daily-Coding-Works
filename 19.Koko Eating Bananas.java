class Solution {
    boolean isValid(int[] piles,int h , int k){
        int time=0;
        for(int p:piles){
            time+=(p-1)/k+1;
            if(time>h) break;
        }
        return time<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=1000000000;
        while(low<high){
            int mid=low + (high-low)/2;
            if(isValid(piles,h,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
