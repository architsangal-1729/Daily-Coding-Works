class Solution {
    public int findMaxLength(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int maxi=0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) arr[i] =-1;
        }
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                maxi = Math.max(maxi,i-map.get(sum));
            }   
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }   
        }
        return maxi;
    }
}
