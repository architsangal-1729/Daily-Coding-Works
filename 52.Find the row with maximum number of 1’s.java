class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(arr[i][j]==1){
                    return i;
                }
            }
        }
        return -1;
    }
}
