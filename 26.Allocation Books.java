//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends

class Solution {
    static boolean isPossible(int [] arr, int mid,int M){
        int pages=0;
        int allocatedStudents=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid) return false;
            if((pages+arr[i])>mid){
                allocatedStudents++;
                pages=arr[i];
            }
            else{
                pages+=arr[i];
            }
            if(allocatedStudents>M) return false;
        }
        return true;
    }
    public static int findPages(int[]arr,int N,int M){
       if(M>N) return -1;
       int low =arr[0];
       int high=arr[0];
       for(int i=1;i<N;i++){
           low=Math.min(low,arr[i]);
           high+=arr[i];
       }
       int res=-1;
       while(low<=high){
           int mid=low+(high-low)/2;
           if(isPossible(arr,mid,M)){
                high=mid-1;
                res=mid;
           }
           else{
               low=mid+1;
           }
       }
        return low;
    }
};
