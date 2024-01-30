package JavaPrograms;

public class Palindrome {
	public static void main(String[] args) {
        int x = 121;
        boolean isPalindrome = checkPalindrome(x);
        System.out.println(x + " is palindrome: " + isPalindrome);
    }

    public static boolean checkPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return (x == reversed || x == reversed / 10);
    }
}

