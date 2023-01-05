import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isPossible(int n, int m, int[]arr, long mid){
        int count = 1;
        long ttalSum =0;
        for(int i =0;i<m;i++){
            if(ttalSum + arr[i] <= mid)
                ttalSum += arr[i];
            else{
                count++;
                if(count>n || arr[i]>mid) 
                    return false;
                ttalSum = arr[i];
            }
        }
        return true;
    }
    public static long ayushGivesNinjatest(int n, int m, int[] arr) {
        long s = 0;
        long e =0;
        for(int i=0;i<m;i++)
            e += arr[i];
        long ans = -1;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(isPossible(n,m,arr,mid)){
                ans = mid;
                e = mid-1;
            }
            else
                s = mid+1;
        }
        return ans;
    }
}
