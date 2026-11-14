import java.util.Scanner;
class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of terms: ");
        int term = sc.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        for(int i = 1; i <= terms; i++){
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}