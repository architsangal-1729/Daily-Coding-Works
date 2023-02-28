class Solution {
    int neededDays(int []weights, int d){
        int days=1;
        int currWt=0;
        for(int weight : weights){
            if(currWt + weight > d){
                days++;
                currWt=0;
            }
            currWt += weight;
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int i:weights){
            low = Math.max(low,i);
            high += i;
        }
        while(low<high){
            int mid = low + (high - low)/2;
            if(neededDays(weights,mid)>days) low = mid+1;
            else    high=mid;
        }
        return low;
    }
}
