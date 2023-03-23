class Solution {
    public long count(int coins[], int n, int sum) {
        long t[][] = new long[n+1][sum+1];
        for(int i=0;i<n;i++){
            t[i][0] = 1;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coins[i-1]<=j){
                    t[i][j] = t[i][j-coins[i-1]] + t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
