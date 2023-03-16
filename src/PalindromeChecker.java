import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata yang ingin diperiksa: ");
        String text = scanner.nextLine();
        if (isPalindrome(text)) {
            System.out.println(text + " adalah palindrome.");
        } else {
            System.out.println(text + " bukan palindrome.");
        }
    }

    public static boolean isPalindrome(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}