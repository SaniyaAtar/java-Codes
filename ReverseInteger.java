// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
 public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10; // Extract the last digit
            x /= 10;           // Remove the last digit from x

            // Check for overflow or underflow before multiplying or adding
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow
            }

            // Append the digit to the result
            result = result * 10 + digit;
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(reverse(123));    // Output: 321
        System.out.println(reverse(-123));   // Output: -321
        System.out.println(reverse(120));    // Output: 21
        System.out.println(reverse(0));      // Output: 0
        System.out.println(reverse(1534236469)); // Output: 0 (overflow)
    }
}
