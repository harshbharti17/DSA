import java.util.*;

public class Solution {
    public static void main(String args[]) {

        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int lastDigit = n % 10;
            cnt = cnt + 1;
            n = n / 10;
        }
        System.out.println("value" + cnt);

    }
}