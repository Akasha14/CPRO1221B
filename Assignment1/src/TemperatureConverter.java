import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userPick, continuePick;
        double temperature, convertResult;

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("Choose the conversion type:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println();
            System.out.print("Enter your choice (1 or 2): ");
            userPick = scanner.nextLine();

            // If user picks 1, wants Fahrenheit
            if (userPick.equals("1")) {
                System.out.println();
                System.out.print("Enter a degree in Fahrenheit: ");
                temperature = scanner.nextDouble();
                //Conversion
                convertResult = (temperature - 32) * 5 / 9;
                System.out.printf("Fahrenheit %.2f is %.2f in Celsius%n", temperature, convertResult);

                // If user picks 2, wants Celsius
            } else if (userPick.equals("2")) {
                System.out.println();
                System.out.print("Enter a degree in Celsius: ");
                temperature = scanner.nextDouble();
                //Conversion
                convertResult = temperature * 9 / 5 + 32;
                System.out.printf("Celsius %.2f is %.2f in Fahrenheit%n", temperature, convertResult);

                // Anything else entered is invalid
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
                continue;
            }

            scanner.nextLine();

            System.out.print("Do you want to perform another conversion? (y/n): ");
            continuePick = scanner.nextLine();

            // Break loop if entered 'n'
            if (continuePick.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Exiting.");
    }
}
