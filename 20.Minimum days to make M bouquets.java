class Solution {
    public static int solve(int m, int k, int[] bloomDay) {
       int low =1;
        int high=1000000000;
        
        if(m>bloomDay.length/k) return -1;

        while(low<high){
            int mid=low+(high-low)/2;
            int flower=0;
            int bouquet=0;

            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]>mid){
                    flower=0;
                }
                else if(++flower>=k){
                    bouquet++;
                    flower=0;
                }
            }

            if(bouquet<m) low=mid+1;
            else high=mid;
        }
        return low;
       
    }
}
