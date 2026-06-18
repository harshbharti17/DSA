class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while (fast != 1) {
            slow = square(slow);
            fast = square(square(fast));

            //if a cycle exists, then the number is not a happy number
            if (slow == fast && slow != 1) {
                return false;
            }
        }
        fast = 1;
        return true;
    }

    //Finding the square of the digits of a number
    public int square(int n) {
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum = sum + remainder * remainder;
            n = n / 10;
        }
        return sum;
    }
}