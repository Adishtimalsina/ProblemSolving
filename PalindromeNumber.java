//Given an integer x, return true if x is a
//palindrome, and false otherwise.
//
//Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//
//  Solution

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        int number = x;
        int numbers = 0;

        if (number < 0) {
            return false;
        }
        while (number != 0) {
            int reminder = number % 10;
            number = number / 10;
            numbers = numbers * 10 + reminder;
        }
        //System.out.print(numbers);
        if (x == numbers) {
            return true;
        } else {
            return false;
        }

    }
}
