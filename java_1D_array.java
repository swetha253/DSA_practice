mport java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner ip = new Scanner(System.in);
        int s = ip.nextInt();
int[] arr= new int[s];

        for(int i = 0 ; i < s; i++){
            int value = ip.nextInt();
            arr[i] = value;
        }
        ip.close();

        // Prints each sequential element in array a
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
