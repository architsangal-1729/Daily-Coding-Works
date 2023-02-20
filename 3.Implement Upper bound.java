class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        int f=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(x>=arr[i] && arr[i]>f){
                f = arr[i];
            }
        }
        int c=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(x<=arr[i] && arr[i]<c){
                c = arr[i];
            }
        }
        return new Pair(f==Integer.MIN_VALUE?-1:f,c==Integer.MAX_VALUE?-1:c);
        
    }
}
