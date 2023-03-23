class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int m, int n, String s1, String s2)
    {
        int t[][] = new int[m+1][n+1];
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j] , t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }
}
