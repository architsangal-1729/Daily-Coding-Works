class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) arr[i] =-1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum==0) count++;
            if(map.containsKey(sum)){
                count += map.get(sum);
            }   
            map.put(sum, map.getOrDefault(sum, 0)+1);   
        }
        return count;
    }
}
