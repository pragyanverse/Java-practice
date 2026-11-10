import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 0;

        // Sum of first n even numbers
        while (i < n) {
            sum += 2 * i;
            i++;
        }

        System.out.println("Sum of first " + n + " even numbers is: " + sum);

    }
}