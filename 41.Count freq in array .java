class Solution{
    public static void frequencyCount(int arr[], int n, int p) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=1;j<=n;j++){
            map.put(j,0);
        }
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                Integer freq = map.get(arr[i]);
                map.put(arr[i],++freq);
            }
            
        }
      // update the given arrat only
      
      
      //////////////////////////////////////////////////////////////////////////in-place array updation
        
      
        for(int i=1;i<=n;i++){
            arr[i-1] = map.get(i);
        }
    }
}
