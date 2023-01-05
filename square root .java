import java.util.* ;
import java.io.*; 

public class Solution {
    public static long binarySearch(long n){
        long s=1 , e=n ;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(mid<=n/mid)    s = mid+1;
            else              e = mid-1;
        }
        return e;
    }
	public static int sqrtN(long N) {
		int x = (int)binarySearch(N);
        return x;
	}
}
