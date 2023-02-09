import java.util.*;
import java.lang.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			int p = sc.nextInt();
			int n = sc.nextInt();
			int [] arr = new int[n];
			for(int i = 0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println(solveIt(arr,p));
		}
	}
	static int solveIt(int[]arr,int p){
		int ans=-1;
		int low=0;
		int high = Integer.MAX_VALUE;
		while(low<=high){
			int mid = low + (high-low)/2;
			if(isValid(arr,p,mid)){
				ans = mid;
				high = mid-1;
			}
			else{
				low = mid+1;
			}
		}
		return ans;
	}
	static boolean isValid(int[]arr,int p,int mid){
		int time=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			int j=2;
			time = arr[i];
			while(time<=mid){
				count++;
				time += arr[i]*j;
				j++;
			}
			if(count>=p) return true;
		}
		return false;
	}
}
