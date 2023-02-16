class Solution
{
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
        //code here
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<edges.length;j++){
                int src=edges[j][0];
                int dest=edges[j][1];
                int wt=edges[j][2];
                if(dist[src]!=Integer.MAX_VALUE && dist[src]+wt<dist[dest]){
                    dist[dest]= dist[src]+wt;
                }
            }
        }
        for(int j=0;j<edges.length;j++){
                int src=edges[j][0];
                int dest=edges[j][1];
                int wt=edges[j][2];
                if(dist[src]!=Integer.MAX_VALUE && dist[src]+wt<dist[dest]){
                    return 1;
                }
        }
        return 0;
    }
}
