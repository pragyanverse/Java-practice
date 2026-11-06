import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Class 10 Percentage Calculator ---");

        System.out.print("Enter marks of 1st subject (out of 100): ");
        float sub1 = sc.nextFloat();

        System.out.print("Enter marks of 2nd subject (out of 100): ");
        float sub2 = sc.nextFloat();

        System.out.print("Enter marks of 3rd subject (out of 100): ");
        float sub3 = sc.nextFloat();

        System.out.print("Enter marks of 4th subject (out of 100): ");
        float sub4 = sc.nextFloat();

        System.out.print("Enter marks of 5th subject (out of 100): ");
        float sub5 = sc.nextFloat();

        float totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = (totalMarks / 500.0f) * 100;

        System.out.println("\nTotal Marks: " + totalMarks + " / 500");
        System.out.println("Percentage: " + percentage + "%");

    }
}