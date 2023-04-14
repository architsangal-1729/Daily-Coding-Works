// number of provinces

class Solution {
    // traversing algo BFS or DFS
    public static void dfs(int node ,ArrayList<ArrayList<Integer>> adjLs, int[] vis){
        vis[node] = 1;
        
        for(Integer it : adjLs.get(node)){
            if(vis[it]==0){
                dfs(it,adjLs,vis);
            }
        }
    }
  // traversing algo BFS or DFS
    public static void bfss(int nodeX, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        q.add(nodeX);
        vis[nodeX]=1;
        
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            
            for(Integer it : adj.get(node)){
                if(vis[it]==0){
                    vis[it]=1;
                    q.add(it);
                }
            }
        }
    }
  
  
    
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<ArrayList<Integer>>();
        for(int i =0;i<V;i++){
            adjLs.add(new ArrayList<Integer>());
        }
        
        //changing adj matrix to adj list
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(adj.get(i).get(j)==1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        
        //using traversing algo to traverse over a single province and count how many times it gets called
        int vis[] = new int[V];
        int count =0;
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                count++;
                //dfs(i,adjLs,vis);
                bfss(i,adjLs,vis);
            }
        }
        return count;
    }
};
