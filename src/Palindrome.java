import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print(" Enter a word or phrase: ");
        String inputText = keyboard.nextLine();

        String purifyText = purifyText(inputText);
        boolean isPalindrome = isPalindrome(purifyText);

        if (isPalindrome) {
            System.out.println("It's a palindrome!");
        }else{
            System.out.println("It's not a palindrome!");
        }

    }
    private static String purifyText(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("[^A-Za-z0-9]", "");
    }
    private static boolean isPalindrome(String text) {
        String toLower = text.toLowerCase();
        String rev = "";
        for (int i = toLower.length() - 1; i >= 0; i--) {
            rev = rev + toLower.charAt(i);
        }
        if (toLower.equals(rev)) {
            return true;
        }else {
            return false;
        }
    }
}
