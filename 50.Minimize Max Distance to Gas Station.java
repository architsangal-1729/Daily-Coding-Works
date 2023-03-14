//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      int k = sc.nextInt();
      Solution obj = new Solution();
      double ans = obj.findSmallestMaxDist(a,k);
      System.out.printf("%.2f",ans);
      System.out.println();
    }
  }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public static boolean isValid(int[] stations, int K, double distance , int n){
        int newStations =0;
        //double x=0;
        for(int i=1;i<n;i++){
            int temp = stations[i]-stations[i-1];
            // if(temp>distance){
            //     newStations += Math.ceil(temp/distance)-1;
            // }
            //x = (double)temp/distance;
            newStations += (int)(temp/distance);
        }
        return newStations<=K;
    }
    public static double findSmallestMaxDist(int stations[],int K) {
        int n = stations.length;
        double s = 0;
        double e = stations[n-1]-stations[0];
        
        while(e-s>1e-6){
            double mid = (s+e)/2;
            if(isValid(stations, K, mid, n)){
                e = mid;
            }
            else{
                s = mid;
            }
        }
        return s+0.000001;

  }
}
     
