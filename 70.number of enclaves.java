//number of enclaves with bfs
// similar to the replace O's with X's or the surrouded regions questions 
// the difference in both the questions is just that replace O's with X's or the surrouded regionswas done by dfs approach while number of enclaves is done by bfs approach

class Pair{
    int f;
    int s;
    Pair(int f,int s){
        this.f=f;
        this.s=s;
    }
}

class Solution {

    int numberOfEnclaves(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // first row, forst col, lasr row, last col
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    if(grid[i][j]==1){
                        q.add(new Pair(i,j));
                        vis[i][j]=1;
                    }
                }
            }
        }
        
        int[] delrow ={0,1,0,-1};
        int[] delcol ={-1,0,1,0};
        
        while(!q.isEmpty()){
            int r = q.peek().f;
            int c = q.peek().s;
            
            q.remove();
            
            for(int i=0;i<4;i++){
                int nr = r + delrow[i];
                int nc = c + delcol[i];
                
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 && vis[nr][nc]==0){
                    q.add(new Pair(nr,nc));
                    vis[nr][nc]=1;
                }
            }
        }
        
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    count++;
                }  
            }
        }
        return count;
    }
}
