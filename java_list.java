import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int elements = sca.nextInt();
        List<Integer> list = new ArrayList<>(elements);
        for (int i = 0; i < elements; i++) {
            list.add(sca.nextInt());
        }
        int queries = sca.nextInt();
        for (int i = 0; i < queries; i++) {
            String query = sca.next();
            if ("Insert".equals(query)) {
                 int index = sca.nextInt();
                int value = sca.nextInt();
                list.add(index, value);
            } else {
               int index = sca.nextInt();
                list.remove(index);
            }
        }
        list.stream().forEach(n -> System.out.print(n +" "));
        scanner.close();
    }
}
