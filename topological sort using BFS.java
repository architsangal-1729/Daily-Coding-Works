class Solution {
    static void bfs(ArrayList<ArrayList<Integer>> adj,int V,ArrayList<Integer> ansList,int[] inDeg){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<V;i++){
            if(inDeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int cur = q.poll();
            ansList.add(cur);
            
            for(int neighbor:adj.get(cur)){
                if(--inDeg[neighbor]==0){
                    q.add(neighbor);
                }
            }
        }
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int inDeg[] = new int [V];
        for(ArrayList<Integer> list: adj){
            for(int e : list){
                inDeg[e]++;
            }
        }
        ArrayList<Integer> ansList = new ArrayList<>();
        bfs(adj,V,ansList,inDeg);
        int ans[] = new int[V];
        int i=0;
        for(int e: ansList){
            ans[i++]=e;
        }
        return ans;
    }
}
