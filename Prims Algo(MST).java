                                    // NOT FULLY CORRECT//    // HAS SOME BUGS//

// only priority queue used so the code is not very much optimised but its easy to understand
// so for now the time complexity is O(E log E) and space complexity is O(E+V)
// also the codde can be improved by using priority queue and hashmap(i.e. used to store the minimum wt associated with the vertex not all the vertices with any weights)
// more understanding --> anuj bhiaya GRAPH Prims Algorithm ==> https://www.youtube.com/watch?v=kXiqvMykeJA&list=PLUcsbZa0qzu1EhwPcQfbDfl9VitpSUgBp&index=8
class Pair implements Comparable<Pair>{
    int wt;
    int v;
    Pair(int wt,int v){
        this.v=v;
        this.wt=wt;
    }
    public int compareTo(Pair that){
        return this.wt-that.wt;
    }
}
class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	     boolean vis[] = new boolean[V];
	     PriorityQueue<Pair> q = new PriorityQueue<>();
	     
	     q.add(new Pair(0,0));  //iss se shuruwat kari h kuch aur bhi le sakte ho
	     int ans=0;
	     while(q.size()!=0){
	         Pair cur =  q.remove();
	         int u = cur.v;
	         if(vis[u]){
	             continue;  //agar wo node visited hochuki h toh aab uss se koi mtlb ni h
	         }
	         ans+=cur.wt; //agar visited ni thi toh uska wt add karke usko visited true mark kardo
	         vis[u]=true;
	         
	         ArrayList<ArrayList<Integer>> neighbors = adj.get(u);
	         for(ArrayList<Integer> list:neighbors){
	             int vertex=list.get(0);
	             int wt=list.get(1);
	             if(vis[vertex]==false){
	                 q.add(new Pair(vertex,wt));
	             }
	         } 
	     }
	     return ans;
	}
}
