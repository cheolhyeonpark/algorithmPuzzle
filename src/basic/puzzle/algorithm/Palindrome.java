package basic.puzzle.algorithm;

public class Palindrome {

    public static final int START_NUMBER = 10;

    public int findPalindrome() {
        int number = START_NUMBER;
        while (!isPalindrome(number)) {
            number++;
        }
        return number;
    }

    private boolean isPalindrome(int number) {
        return isPalindrome(number, 2)
                && isPalindrome(number, 8)
                && isPalindrome(number, 10);
    }

    private boolean isPalindrome(int number, int base) {
        int origin = number;
        int reverse = 0;
        while (number > 0) {
            reverse *= base;
            reverse += number % base;
            number /= base;
        }
        return origin == reverse;
    }
}
