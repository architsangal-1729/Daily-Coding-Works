class Solution {
    public int subarraySum(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            // if(sum==k){
            //     count++;
            // }
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
                //map.put(sum,map.get(sum-k)+1);
            }
            // else{
            //     map.put(sum-k,1);
            // }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
