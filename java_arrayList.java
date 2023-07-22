import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);
        int num = ip.nextInt();
        String s = ip.nextLine();
        ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>(num);
        for (int i = 0; i < num; i++) {
            s = ip.nextLine();
            a.add(i, new ArrayList<String>(Arrays.asList(s.split("\\s"))));
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = ip.nextInt();
            int y = ip.nextInt();
            if (x <= a.size() && y < a.get(x-1).size() && y >= 0) {
                System.out.println(a.get(x-1).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
