public class PalindromeChecker {

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        String lowerStr = s.toLowerCase();
        int left = 0;
        int right = lowerStr.length() - 1;

        while (left < right) {
            if (lowerStr.charAt(left) != lowerStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "А роза упала на лапу Азора";
        if (isPalindrome(input)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }
}
