//Find Eventual Safe States dfs approach
class Solution {
    public boolean dfs(int node, int V, int[][] adj, int[] vis, int[] pathVis, int[] check){
        vis[node]=1;
        check[node]=0;
        pathVis[node]=1;

        for(Integer it : adj[node]){
            if(vis[it]==0){
                if(dfs(it,V,adj,vis,pathVis,check)==true){
                    return true;
                }
            }
            else if(pathVis[it]==1){
                return true;
            }
        }
        pathVis[node]=0;
        check[node]=1;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] adj) {
        int V = adj.length;
        int[] vis = new int[V];
        int[] pathVis = new int[V];
        int[] check = new int[V];

        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i,V,adj,vis,pathVis,check);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<V;i++){
            if(check[i]==1){
                ans.add(i);
            }
        }
        return ans;
    }
}
