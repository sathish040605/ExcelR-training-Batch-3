import java.util.Scanner;

public class SumOfTwoDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first digit
        System.out.print("Enter the first digit: ");
        int num1 = scanner.nextInt();

        // Prompt the user for the second digit
        System.out.print("Enter the second digit: ");
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
