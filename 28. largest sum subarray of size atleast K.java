class Compute {
    public long maxSumWithK(long arr[], long N, long K) {
        int n = (int)N;
        int k = (int)K;
      
// maxSum[i] is going to store maximum sum till index i
// We use Kadane's algorithm to fill maxSum[]
        long [] maxSum = new long[n];
        maxSum[0] = arr[0];
        long currSum = arr[0];
        for(int i=1;i<n;i++){
            currSum = Math.max(arr[i],currSum+arr[i]);
            maxSum[i] = currSum;
        }
      
// Sum of first k elements        
        long sum = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
      
// Use the concept of sliding window
        long res = sum;
        for(int i=k;i<n;i++){
            // Compute sum of k elements ending with a[i].
            sum += arr[i] - arr[i-k];
          
            // Update result if required
            res = Math.max(res,sum);
          
          // Include maximum sum till [i-k] also if it increases overall max.
            res = Math.max(res, sum + maxSum[i-k]);
        }
        return res;
    }
}
