//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    long[] res = new Solution().printFibb(n);
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
// } Driver Code Ends
///////////////////////////////////////////////////
class Solution{
    static long fib(int n,long[]ans){
        if(n<=1) return 1;
        if(ans[n]!=-1) return ans[n];
        ans[n]=fib(n-1,ans)+fib(n-2,ans);
        return ans[n];
    }
    public static long[] printFibb(int n) {
        long[] ans = new long[n];
        if(n==1){
            ans[0]=1;    
            return ans;   
        }
        Arrays.fill(ans,-1);
        ans[0]=1;
        ans[1]=1;
        fib(n-1,ans);
        return ans;
    }
}
