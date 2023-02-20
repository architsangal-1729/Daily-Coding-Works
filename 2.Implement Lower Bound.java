class Solution{
    static int findFloor(long arr[], int n, long x)
    {
        int idx=-1;
        for(int i=0;i<n;i++){
            if(x>=arr[i]){
                idx = i;
            }
        }
        return idx;
    }
    
}
