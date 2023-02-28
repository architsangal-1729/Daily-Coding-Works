//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean isValid(int arr[],int n, int mid,int k){
        int coord=arr[0];
        int cows=1;
        for(int i=1;i<n;i++){
            if(arr[i]-coord>=mid) {
                cows++;
                coord=arr[i];
            }
            if(cows>=k) return true;
        }
        return false;
    }
    public static int solve(int n, int k, int[] arr) {
        int low =1;
        int high=arr[n-1]-arr[0];
        while(low<=high){
            int mid = (high+low)/2;
            if(isValid(arr,n,mid,k)){
                low=mid+1;
            }
            else high=mid-1;
        }
        return high;
    }
}
