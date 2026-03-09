// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int revNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            revNum = (revNum * 10) + lastDigit;
        }
        // System.out.println(revNum);
        return revNum;
    }
}