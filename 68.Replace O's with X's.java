//Replace O's with X's with dfs
//surrounded regions with dfs

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    // simple dfs template
    static void dfs(int row, int col, int[][] vis, char[][] mat, int n,int m){
        vis[row][col]=1; 
        
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,-1,0,1};
        
        for(int i=0;i<4;i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && mat[nrow][ncol]=='O'){
                dfs(nrow,ncol,vis,mat,n,m);
            }
        }
    }
    static char[][] fill(int n, int m, char mat[][])
    {
        int[][] vis = new int[n][m]; //// simple declaration template
        
        for(int i=0;i<n;i++){   //for col wise traversing in boundary
            if(mat[i][0]=='O' && vis[i][0]==0){     //first col
                dfs(i,0,vis,mat,n,m);
            }
            if(mat[i][m-1]=='O' && vis[i][m-1]==0){     // last col
                dfs(i,m-1,vis,mat,n,m);
            }
        }
        for(int j=0;j<m;j++){       //for row wise traversing in boundary
            if(mat[0][j]=='O' && vis[0][j]==0){     //first row
                dfs(0,j,vis,mat,n,m);
            }
            if(mat[n-1][j]=='O' && vis[n-1][j]==0){     //last row
                dfs(n-1,j,vis,mat,n,m);
            }
        }
        
        //for simple changing of those O's which are not at boundary i.e. vis[][] of them is zero.
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && mat[i][j]=='O'){
                    mat[i][j]='X';
                }
            }
        }
        return mat;
    }
}
