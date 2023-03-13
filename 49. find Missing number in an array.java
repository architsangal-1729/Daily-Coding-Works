class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         int ans = 0;
         for(int i=1;i<=N;i++){
             ans = ans ^ i;
         }
         for(int i=0;i<A.length;i++){
             ans = ans ^ A[i];
         }
         return ans;
    }
}
