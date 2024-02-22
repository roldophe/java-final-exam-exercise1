import java.util.Scanner;

public class Main {

//
//    <<<<<<<<<< EXERCISE1 SEMESTER1 >>>>>>>>>>
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = getNumberOfElements(scanner);
        int[] numbers = inputNumbers(scanner, n);

        printEnteredNumbers(numbers);

        scanner.close();
    }

    private static int getNumberOfElements(Scanner scanner) {
        System.out.print("Enter the number of elements: ");
        return scanner.nextInt();
    }
    private static int[] inputNumbers(Scanner scanner, int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    private static void printEnteredNumbers(int[] numbers) {
        System.out.println("Entered numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}