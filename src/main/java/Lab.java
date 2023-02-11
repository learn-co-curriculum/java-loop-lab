import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a positive integer to count to:");
            int maxInteger = scanner.nextInt();

            // Implement a for loop that prints the integers 0 - maxInteger
            System.out.println("The For Loop prints:");

            // Implement a while loop that prints the integers 0 - maxInteger
            System.out.println("\nThe While Loop prints:");

            // Implement a do-while loop that prints the integers 0 - maxInteger
            System.out.println("\nThe Do-While Loop prints:");

        } catch (InputMismatchException exception) {
            System.out.println("Invalid Input");
        }
    }
}
