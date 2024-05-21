import java.util.Scanner;

public class PerfectSquareSum {

    // Function to calculate the sum of first n perfect squares
    public static int calculatePerfectSquareSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int output = calculatePerfectSquareSum(n);

        System.out.println("For n = " + n + ", output is " + output);

        scanner.close();
    }
}