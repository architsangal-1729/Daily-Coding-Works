// flood fill algorithm
class Solution {
    public void dfs(int r, int c, int[][] image, int[][]ans, int iniColor, int newColor){
        ans[r][c] = newColor;
        
        int n = image.length;
        int m = image[0].length;
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,-1,0,1};

        for(int i=0;i<4;i++){
            int newrow = r + delRow[i];
            int newcol = c + delCol[i];

            if(newrow>=0 && newrow<n && newcol>=0 && newcol<m && ans[newrow][newcol]!=newColor && image[newrow][newcol]==iniColor){
                dfs(newrow,newcol,image,ans,iniColor,newColor);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor = image[sr][sc];
        int[][] ans = image;

        dfs(sr,sc,image,ans,iniColor,color);
        return ans;
    }
}
