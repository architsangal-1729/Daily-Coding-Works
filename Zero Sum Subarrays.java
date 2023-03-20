class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        Map<Long,Integer> map = new HashMap<>();
        long sum=0;
        long count=0;
        map.put((long)0,1);
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                count += map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return count;
    }
}
