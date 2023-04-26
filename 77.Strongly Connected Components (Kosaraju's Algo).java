//       Strongly Connected Components (Kosaraju's Algorithm)

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Gfg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            // arraylist of arraylist to represent graph
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            int V = Integer.parseInt(sc.next());
            int E = Integer.parseInt(sc.next());
            
            for(int i =0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= E; i++)
            {    int u = Integer.parseInt(sc.next());
                 int v = Integer.parseInt(sc.next());
                 
                 // adding directed edgese between 
                 // vertex 'u' and 'v'
                 adj.get(u).add(v);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.kosaraju(V, adj));
		}
    }
}

// } Driver Code Ends



class Solution{
    
    public void dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adjT){
        vis[node]=1;
        for(Integer i : adjT.get(node)){
            if(vis[i]==0){
                dfs(i,vis,adjT);
            }
        }
    }
    public void dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st){
        vis[node]=1;
        for(Integer i : adj.get(node)){
            if(vis[i]==0){
                dfs(i,vis,adj,st);
            }
        }
        st.push(node);
    }
    
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj){
        Stack<Integer> st = new Stack<Integer>();
        int[] vis = new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i,vis,adj,st);
            }
        }
        
        ArrayList<ArrayList<Integer>> adjT = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            adjT.add(new ArrayList<Integer>());
        }
        for(int i=0;i<V;i++){
            vis[i]=0;
            for(Integer it : adj.get(i)){
                adjT.get(it).add(i);
            }
        }
        
        int sccCount =0;
        while(!st.isEmpty()){
            int node = st.peek();
            st.pop();
            
            if(vis[node]==0){
                sccCount++;
                dfs(node,vis,adjT);
            }
        }
        return sccCount;
    }
}
