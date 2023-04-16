//detect cycle in undirected graph dfs
// depth first search detect cycle in undirected graph

class Solution {
    public boolean checkCylecByDFS(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int node, int parent){
        vis[node]=true;
        
        for(int adjNode : adj.get(node)){
            if(!vis[adjNode]){
                if(checkCylecByDFS(adj,vis,adjNode,node)) return true;
            }
            else if(parent != adjNode){
                return true;
            }
        }
        return false;
        
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        Arrays.fill(vis,false);
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(checkCylecByDFS(adj,vis,i,-1)) return true;
            }
        }
        return false;
    }
}
