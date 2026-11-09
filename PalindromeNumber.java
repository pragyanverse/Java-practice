import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int reversedNum = 0;

        // Loop to reverse the number
        while (num > 0) {
            int remainder = num % 10;
            reversedNum = (reversedNum * 10) + remainder;
            num = num / 10;
        }

        // Check if original and reversed are identical
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }

    }
}