// rotten oranges rotting oranges
class Pair{
    int r;
    int c;
    int tm;
    Pair(int r,int c, int tm){
        this.r=r;
        this.c=c;
        this.tm=tm;
    }
}

class Solution  {
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int vis[][] = new int[n][m];
        
        int cntFresh=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1) {
                    cntFresh++;
                }
            }
        }
        
        int tm=0;
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,-1,0,1};
        int count = 0;
        
        while(!q.isEmpty()){
            int row = q.peek().r;
            int col = q.peek().c;
            int time = q.peek().tm;
            
            tm = Math.max(tm,time);
            
            q.remove();
            
            for(int i=0;i<4;i++){
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]!=2 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,time+1));
                    vis[nrow][ncol]=2;
                    count++;
                }
            }
        }
        if(count!=cntFresh){
            return -1;
        }
        return tm;
    }
}
