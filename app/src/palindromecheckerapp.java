import java.util.Scanner;

public class palindromecheckerapp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        // Compare characters from start and end
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string is a Palindrome (ignoring spaces and case)");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        scanner.close();
    }
}