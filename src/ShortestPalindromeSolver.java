import java.util.Scanner;
public class ShortestPalindromeSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        ShortestPalindromeSolver solver = new ShortestPalindromeSolver();
        System.out.println(solver.shortestPalindrome(str));
    }
    String shortestPalindrome(String s) {
        int n = s.length();
        int end = n;
        while (end > 0) {
            if (isPalindrome(s, 0, end - 1)) {
                break;
            }
            end--;
        }
        String suffix = s.substring(end);
        String prefix = new StringBuilder(suffix).reverse().toString();

        return prefix + s;
    }
    boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
