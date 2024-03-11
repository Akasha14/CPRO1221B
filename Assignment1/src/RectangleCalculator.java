import java.util.Scanner;

public class RectangleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuePick;
        double length, width, area, perimeter;

        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Area and Perimeter Calculator");

        // Do-while loop, will at least run once.
        do {
            System.out.println();
            System.out.print("Enter length: ");
            length = scanner.nextDouble();
            System.out.print("Enter width: ");
            width = scanner.nextDouble();

            // Calculations
            area = width * length;
            perimeter = 2 * width + 2 * length;

            System.out.printf("Area: %.2f%n", area);
            System.out.printf("Perimeter: %.2f%n", perimeter);

            scanner.nextLine();

            System.out.println();
            System.out.print("Do you want to continue? (y/n): ");
            continuePick = scanner.nextLine();

        } while (continuePick.equalsIgnoreCase("y"));

        System.out.println("Exiting.");
    }
}
