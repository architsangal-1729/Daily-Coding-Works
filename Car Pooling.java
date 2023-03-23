class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int maxEnd = 0;
        for(int[] trip : trips){
            maxEnd = Math.max(maxEnd, trip[2]);
        }
        int arr[] = new int[maxEnd+2];

        for(int i=0;i<trips.length;i++){
            int a = trips[i][0];
            int b = trips[i][1];
            int k = trips[i][2];
            arr[b] += a;
            arr[k] -= a;
        }
        if(arr[0]>capacity) return false;
        for(int i=1;i<arr.length;i++){
            arr[i] += arr[i-1];
            if(arr[i]>capacity) return false;
        }
        return true;
    }
}
