class Solution{
	public int peakElement(int[] arr,int n)
    {
       int s=0;
       int e=n-1;
       
       while(s<e){
           int mid=(s+e)/2;
           
           if(mid==0) return arr[0]>=arr[1]?0:1;
           
           if(mid==n-1) return arr[n-1]>=arr[n-2]?n-1:n-2;

           if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1]) return mid;
           
           if(arr[mid]<arr[mid-1])  e=mid-1;
           
           else  s=mid+1;
       }
       return s;
    }
}
