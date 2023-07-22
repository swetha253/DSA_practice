import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner ip=new Scanner(System.in);
        String ARR=ip.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println( ARR.equals( new StringBuilder(ARR).reverse().toString()) ? "Yes" : "No" );
        
    }
}
