class Solution{
    static int minJumps(int[] arr){
        int jumps=0;
        int currMax=0;
        int currReach=0;
        for(int i=0;i<arr.length-1;i++){
            if(i+arr[i]>currMax) currMax=i+arr[i];
            if(i==currReach){
                jumps++;
                currReach=currMax;
            }
            if(arr[i]==0 && i==currMax) return -1;
        }
        return jumps;
    }
}
