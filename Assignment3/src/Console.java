import java.util.Scanner;

public class Console {

    private static final Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid integer value.");
            }
        }
    }

    public static int getInt(String prompt, int min, int max) {
        while (true) {
            int value = getInt(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than "
                        + min + " and less than " + max + ".");
            }
        }
    }

    public static double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double value = Double.parseDouble(sc.nextLine());
                if (value >= 0) {
                    return value;
                } else {
                    System.out.println("Error! Please enter a non-negative value."); // Added this.
                }
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid double value.");
            }
        }
    }

    public static double getDouble(String prompt, double min, double max) {
        while (true) {
            double value = getDouble(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than "
                        + min + " and less than " + max + ".");
            }
        }
    }

    public static String getContinue(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}
