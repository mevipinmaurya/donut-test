import java.util.Scanner;

public class GCDCalculator {

    // Iterative method to calculate GCD
    public static int gcdIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Recursive method to calculate GCD
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first non-negative integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second non-negative integer: ");
        int num2 = scanner.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Please enter non-negative integers.");
        } else {
            int iterativeGCD = gcdIterative(num1, num2);
            int recursiveGCD = gcdRecursive(num1, num2);

            System.out.println("GCD (Iterative): " + iterativeGCD);
            System.out.println("GCD (Recursive): " + recursiveGCD);
        }

        scanner.close();
    }
}
