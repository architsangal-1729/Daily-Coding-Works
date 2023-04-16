//Detect cycle in an undirected graph bfs approach 
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends

class Pair{
    int f;
    int s;
    Pair(int f,int s){
        this.f=f;
        this.s=s;
    }
}
class Solution {
    public boolean checkCycleByBFS(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int V,int src){
        Queue<Pair> q = new LinkedList<>();
        vis[src]=true;
        q.add(new Pair(src,-1));
        
        while(!q.isEmpty()){
            int node = q.peek().f;
            int parent = q.peek().s;
            q.remove();
            
            for(int adjNode : adj.get(node)){
                if(!vis[adjNode]){
                    vis[adjNode]=true;
                    q.add(new Pair(adjNode,node));
                }
                else if(parent!=adjNode){
                    return true;
                }
            }
        }
        return false;
    } 
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        Arrays.fill(vis,false);
        
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(checkCycleByBFS(adj,vis,V,i)) return true;
            }
        }
        return false;
    }
}
