import java.util.Scanner;

public class DataValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuePick;
        double length, width, area, perimeter;
        String[] continueOptions = {"y", "n"};

        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Area and Perimeter Calculator");

        do {
            System.out.println();

            // Double validation used
            length = getValidDouble("Enter length: ", 0.0, 1000000.0, scanner);
            width = getValidDouble("Enter width: ", 0.0, 1000000.0, scanner);

            // Calculations
            area = width * length;
            perimeter = 2 * width + 2 * length;

            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println();

            // String validation used
            continuePick = getValidString("Do you want to continue? (y/n): ", continueOptions, scanner);


        } while (continuePick.equalsIgnoreCase("y"));

        System.out.println("Exiting.");
    }

    // DOUBLE VALIDATION
    private static double getValidDouble(String prompt, double min, double max, Scanner scanner) {
        double value = 0; // stores the user input
        boolean notValid = true; // loop control

        while (notValid) {
            System.out.print(prompt); // "Enter width:" or "Enter length:"

            if (scanner.hasNextDouble()) { // if the input is a double
                value = scanner.nextDouble(); // store the double value

                if (value < min || value > max) { // if the value is not in range
                    System.out.printf("Error! Value must be between %.0f and %.0f. Try again.%n", min, max);

                } else { // if the value is in range, exit the loop
                    notValid = false;
                }

            } else { // if the input is not a double(ex."ten"), error message.
                System.out.println("Error! Invalid decimal value. Please try again.");
            }

            // consume newline character from scanner.NextDouble()
            scanner.nextLine();
        }

        return value; // return the valid double input
    }


    // STRING VALIDATION
    private static String getValidString(String prompt, String[] validOptions, Scanner scanner) {
        String userInput = "";
        boolean notValid = true; //used to control the while loop
        boolean isValidOption = false; //used to check if user input is valid.

        while (notValid) {
            System.out.print(prompt);
            userInput = scanner.nextLine();

            // for each option in validOptions
            for (String option : validOptions) {
                if (userInput.equalsIgnoreCase(option)) {
                    isValidOption = true; // Valid input
                    break;
                }
            }

            // Invalid inputs, empty or wrong characters
            if (userInput.trim().isEmpty()) {
                System.out.println("Error: This entry is required. Try again.");
            } else if (!isValidOption) {
                System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
            } else {
                notValid = false;
            }
        }

        return userInput; // returns (Y,y) and (N,n)
    }
}