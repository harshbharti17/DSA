import java.util.*;

class Solution {
    public static void print_divisors(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);

                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        Collections.sort(list);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}