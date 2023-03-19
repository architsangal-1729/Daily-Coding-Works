class Solution{
    public static int lenOfLongSubarr (int arr[], int n, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int maxi=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(map.containsKey(sum-k)){
                maxi = Math.max(maxi,i-map.get(sum-k));
            }   
            if (!map.containsKey(sum))   map.put(sum,i);
        }
        return maxi;
    }
}               
