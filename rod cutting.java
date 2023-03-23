class Solution{
    public int cutRod(int price[], int n) {
        int w = n;
        int len[] = new int[n];
        for(int i=1;i<n+1;i++){
            len[i-1] = i;
        }
        int t[][] = new int[w+1][n+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(len[i-1]<=j){
                    t[i][j] = Math.max(price[i-1]+t[i][j-len[i-1]] , t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][w];
    }
}
