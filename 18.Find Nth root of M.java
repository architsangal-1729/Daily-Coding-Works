class Solution{
    public int NthRoot(int n, int m){
        int low =0;
		int high=m;
		int mid=-1;
		if(m==1) return 1;
		while(low<=high){
		    mid=(low+high)/2;
		    if(Math.pow(mid,n)==m) {
		        return mid;
		    }
		    else if(Math.pow(mid,n)<m) {
		        low=mid+1;
		    }
		    else{
		        high=mid-1;
		    }
		}
		return -1;
    }
}
