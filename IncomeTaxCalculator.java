import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual income (in Lakhs): ");
        float income = sc.nextFloat();
        float tax = 0;

        if (income <= 2.5f) {
            tax = 0;
        } else if (income <= 5.0f) {
            tax += 0.05f * (income - 2.5f);
        } else if (income <= 10.0f) {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.20f * (income - 5.0f);
        } else {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.20f * (10.0f - 5.0f);
            tax += 0.30f * (income - 10.0f);
        }

        System.out.println("Total tax payable: ₹" + (tax * 100000));
        
    }
}