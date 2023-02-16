class GfG
{   
    int[] rank,parent;
    int n;
    public void DisjointUnionSet(int n){
        parent = new int[n];
        rank = new int[n];
        this.n=n;
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
	int find(int A[],int x){
        if(parent[x]==x){
            return x;
        }
        return find(A,parent[x]);
	}
	void unionSet(int A[],int x,int y){
	    int xRoot = find(A,x);
	    int yRoot = find(A,y);
	    
	    if(xRoot==yRoot){
	        return;
	    }
	    if(rank[xRoot]<rank[yRoot]){ //jiski rank choti h usko badi wali ka child bana denge
	        parent[xRoot]=yRoot;
	    }
	    else if(rank[yRoot]<rank[xRoot]){// ---same--do---
	        parent[yRoot]=xRoot;
	    }
	    else{ // agar dono kii rank barabar h toh kisi ko bhi pakdo aur usse parrent bna do
            parent[yRoot]=xRoot;
            rank[yRoot]=rank[xRoot]+1;
	    }
         
	}
}
