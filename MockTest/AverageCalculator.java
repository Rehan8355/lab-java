package MockTest;
  import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();

        int sum = 0;
        int number;
        int i = 0;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            sum += number;
            i++;
        } while (i < count);

        double average = (double) sum / count;
        System.out.println("The average is: " + average);
    }
}


