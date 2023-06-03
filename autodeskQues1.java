////////////////////// autodesk round 3 coding question number 1  ////////////////////////////////////////


// QUESTION: The function should return the new array. the Use cases are

// Use case-1
// 1. Exisitng array is 4578
// 2. User provide input value as 6 and index =2 
// 3. Return array should be 45678

// Use case 2 
// 1. Exisitng array is 4578
// 2. User provide input value as 6 and index =8 
// 3. return arrray should be 457800006

public class Main
{
	public static void main(String[] args) {
		int[] arr = new int[]{4,5,7,8};
		int key = 6;
		int idx = 2;
		
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		if(arr.length-1>=idx){
		    int[] newArr = new int[arr.length+1];
		    for(int i=0;i<idx;i++){
		        newArr[i]=arr[i];
		    }
		    newArr[idx]=key;
		    for(int i=idx;i<arr.length;i++){
		        newArr[i+1]=arr[i];
		    }
		    for(int i=0;i<newArr.length;i++){
    		    System.out.print(newArr[i]+" ");
    		}
		}
		else{
		    int[] newArr = new int[idx+1];
		    for(int i=0;i<arr.length;i++){
		        newArr[i]=arr[i];
		    }
		    for(int i=arr.length;i<idx;i++){
		        newArr[i]=0;
		    }
		    newArr[idx]=key;
    		for(int i=0;i<newArr.length;i++){
    		    System.out.print(newArr[i]+" ");
    		}
		}
	}
}
