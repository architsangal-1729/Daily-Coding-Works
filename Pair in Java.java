//Pair in Java
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// Pair class
class Pair{
    int x;
    int y;
    
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}


// } Driver Code Ends

class custom_Compare{
    static void sortPairs(Pair arr[], int N){
        
        Arrays.sort(arr, new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                return p1.x-p2.x;
            }            
        });
        for(int i = 0;i<N;i++){
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();
    }
}

//{ Driver Code Starts.

// Driver class with main function
class GFG {
    
    // Driver code
	public static void main (String[] args) {
		
		//taking input using Scanner class 
		Scanner sc = new Scanner(System.in);
		
		//taking count of testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    
		    //taking count of elements
		    int N = sc.nextInt();
		    
		    // Creating an array of Pair
		    Pair arr[] = new Pair[N];
		    
		    //adding elements to Pair array
		    for(int i = 0;i<N;i++){
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        arr[i] = new Pair(x, y);
		    }
		    
		    //creating an object of custom_Compare class
		    custom_Compare obj = new custom_Compare();
		    
		    //calling sortPairs() method of
		    //class  custom_Compare
		    obj.sortPairs(arr, N);
		}
	}
}
// } Driver Code Ends
