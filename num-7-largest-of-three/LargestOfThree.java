import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}
