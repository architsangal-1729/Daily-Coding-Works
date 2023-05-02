learnys exam aiml warmup 01 on 01May2023

//  odd merges java
/*
Given 2 sorted arrays A and B of size N each. Print the absolute difference of elements occuring at odd Indices in an array obtained after merging the given arrays in sorted order.

Input Format

Three lines of input. The first line contains integer N, second line contains sorted array A in space separated format and third line contains sorted array B in space separated format.

Output Format

Single line space separated absolute differences of odd indices values after merging.

Constraint

1 <N < 188

1 <= arr[1] <<= 1000

Sample Input 1

4

18 28 30 48

12 26 35 48

Sample Output 1

14 9 13
*/

import java.util.*;
public class Main
{
    public static int[] merge(int[] arr1, int[] arr2,int n){
        int temp[] = new int[n+n];
        int k=0;
        for(int i=0;i<n;i++){
            temp[k++]=arr1[i];
        }
        for(int i=0;i<n;i++){
            temp[k++]=arr2[i];
        }
        Arrays.sort(temp);
        return temp;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr1[] = new int[n];
	    int arr2[] = new int[n];
	    
	    for(int i=0;i<n;i++){
	        arr1[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        arr2[i]=sc.nextInt();
	    }
	    
	    int[] temp = merge(arr1,arr2,n);

	    for(int i=3;i<2*n;i+=2){
	        System.out.print(Math.abs(temp[i]-temp[i-2])+" ");
	    }
	    return;
	}
}







