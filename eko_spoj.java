
//  BINARY SEARCH //  //  BINARY SEARCH //  //  BINARY SEARCH //  //  BINARY SEARCH //  //  BINARY SEARCH //  //  BINARY SEARCH //  //  BINARY SEARCH //

import java.util.*;
import java.lang.*;

class Main
{
	public static boolean solve(int [] arr, int n, int m, int mid){
		int sum = 0;
		for(int i:arr){
			if(i>mid) sum+=i-mid;
		}
		if(sum>=m) return true;
		return false;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// the size of arr
		int m = sc.nextInt();// the desired given wooods len needed
		int [] arr = new int[n];
		for(int i=0;i<n;i++){
			int arr[i] = sc.nextInt();
		}
		int lb=0;
		int ans=0;
		int ub=arr.length;
		while(lb<=ub){
			int mid = lb+(ub-lb)/2;
			if(solve(arr,n,m,mid){
				ans = mid;
				lb = mid+1;
			}
			else{
				ub=mid-1;
			}
		}
		System.out.println(ans);
		return 0;
	}
}
