import java.util.Scanner;

public class SumOfDigits {

    // Iterative method to calculate the sum of digits
    public static int sumOfDigitsIterative(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10;       // Remove the last digit
        }
        return sum;
    }

    // Recursive method to calculate the sum of digits
    public static int sumOfDigitsRecursive(int number) {
        // Base case: when number is 0
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumOfDigitsRecursive(number / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int iterativeSum = sumOfDigitsIterative(number);
            int recursiveSum = sumOfDigitsRecursive(number);

            System.out.println("Sum of digits (Iterative): " + iterativeSum);
            System.out.println("Sum of digits (Recursive): " + recursiveSum);
        }

        scanner.close();
    }
}
