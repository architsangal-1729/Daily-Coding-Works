class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int firstOccurence = Integer.MAX_VALUE;
        int row=-1;
        
        for(int i=0;i<n;i++){
            
            int low = 0;
            int high = arr[i].length-1;
            
            while(low<=high){
                int mid = (low + high)>>1;
                
                if(arr[i][mid]==1){
                    if(firstOccurence>mid){
                    firstOccurence = Math.min(firstOccurence, mid);
                    row=i;
                    }
                    high = mid-1;
                }
                
                else{
                    low = mid+1;
                }
            }
        }
        return row;
    }
}


/*
for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(arr[i][j]==1){
                    return i;
                }
            }
        }
        return -1;
*/
