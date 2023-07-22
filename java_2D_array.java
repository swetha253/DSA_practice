import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    private static final Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = ip.nextLine().split(" ");
            ip.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
    int csum =Integer.MIN_VALUE;
        for(int x=0;x<6;x++)
        {
            for(int y=0;y<6;y++)
            { 
                if(x>1 && y>1)
                {
                    int sum=arr[x][y]+arr[x-1][y-1]+arr[x-2][y]+arr[x-2][y-1]
                    +arr[x-2][y-2]+arr[x][y-1]+arr[x][y-2];
                    
                    if(sum>csum)
                    {
                        csum=sum;
                    }
                }
            }
        }
        System.out.print(csum);
        ip.close();
    }
}
