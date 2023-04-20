//Bipartite Graph dfs

class Solution  {
    public boolean isCheckDFS(int V, ArrayList<ArrayList<Integer>>adj, int start,int[] vis,int color){
        vis[start] = color;
        
        for(int it : adj.get(start)){
            if(vis[it]==-1){
                if(isCheckDFS(V,adj,it,vis,1-color)==false) return false;
            }
            else if(vis[it]==vis[start]){
                return false;
            }
        }
        
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int[] vis = new int[V];
        Arrays.fill(vis,-1);
        
        for(int i=0;i<V;i++){
            if(vis[i]==-1){
                if(isCheckDFS(V,adj,i,vis,0)==false) return false;
            }
        }
        return true;
    }
}
