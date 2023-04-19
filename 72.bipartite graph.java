//bipartite graph bfs approach
class Solution  {
    public boolean isCheck(int V, ArrayList<ArrayList<Integer>>adj, int start,int[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = 0;
        
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove(node);
            
            for(int it : adj.get(node)){
                if(vis[it]==-1){
                    vis[it] = 1 - vis[node];
                    q.add(it);
                }
                else if(vis[it]==vis[node]){
                    return false;
                }
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
                if(isCheck(V,adj,i,vis)==false) return false;
            }
        }
        return true;
    }
}
