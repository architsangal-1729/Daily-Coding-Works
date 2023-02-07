import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        // An array of zeroes
        int[] frequency = new int[100 + 1];
        
        // Fill array so that the value at each index corresponds to the number of occurrences of that integer
        for (int i = 0; i < n; i++){
            frequency[in.nextInt()]++;
        }
        in.close();
        
        // Determine which pair of adjacent integers has the highest number of occurrences
        int max = 0;
        for (int i = 1; i <= 100; i++) {
            int count = frequency[i] + frequency[i - 1];
            if (count > max) {
                max = count;
            }
        }
        
        System.out.println(max);
    }
}
