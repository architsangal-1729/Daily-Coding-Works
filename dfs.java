//dfs depth first search

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list,boolean vis[]){
        vis[node] = true;
        list.add(node);
        
        for(Integer it : adj.get(node)){
            if(vis[it]==false){
                dfs(it,adj,list,vis);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V+1];
        ArrayList<Integer> list = new ArrayList<>();
        
        vis[0] = true;
        dfs(0,adj,list,vis);
        
        return list;
    }
}
