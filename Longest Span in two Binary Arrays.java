class Solution {
    int longestCommonSum(boolean arr1[], boolean arr2[], int n) {
        int a[] = new int [n];
        int b[] = new int [n];
        for(int i=0;i<n;i++){
           if(arr1[i]){
               a[i] = 1;
           } 
           else{
               a[i] = 0;
           }
        }
        for(int i=0;i<n;i++){
           if(arr2[i]){
               b[i] = 1;
           } 
           else{
               b[i] = 0;
           }
        }
        for(int i=0;i<n;i++){
            a[i] = a[i] - b[i];
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum += a[i];
            if(map.containsKey(sum)){
                max = Math.max(max, i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
    }
}
