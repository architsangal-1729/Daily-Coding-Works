import java.util.* ;
import java.io.*; 
public class Solution {
    
    public static int firstIndexFinder(ArrayList<Integer> arr, int n, int k){
        int s = 0;
        int e = n-1;
        int firstIdx = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr.get(mid)==k){
                firstIdx = mid;
                e = mid-1; // MAIN IDEA BEHIND THE SOLUTION
            }
            else if(arr.get(mid)>k){
                e = mid-1;
            }
            else if(arr.get(mid)<k){
                s = mid+1;
            }
        }
        return firstIdx;
    }
    public static int lastIndexFinder(ArrayList<Integer> arr, int n, int k){
        int s = 0;
        int e = n-1;
        int lastIdx = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr.get(mid)==k){
                lastIdx = mid;
                s = mid+1; // MAIN IDEA BEHIND THE SOLUTION
            }
            else if(arr.get(mid)>k){
                e = mid-1;
            }
            else if(arr.get(mid)<k){
                s = mid+1;
            }
        }
        return lastIdx;
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int[] ans = new int[2];
        int f = firstIndexFinder(arr,n,k);
        int l = lastIndexFinder(arr,n,k);
        ans[0] = f;
        ans[1] = l;
        return ans;
    }
}
