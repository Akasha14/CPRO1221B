import java.util.Scanner;

class StudentRegistration {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("Student Registration Form");
        System.out.println();

        // Call scanner for user inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter year of birth (4 digits): ");
        int birthYear = scanner.nextInt();

        // Assign full name with a space
        String fullName = firstName + " " + lastName;

        // Assign temporary password with an asterisk
        String temporaryPassword = firstName + "*" + birthYear;

        // Final display message
        System.out.println("\nWelcome " + fullName + "!");
        System.out.println("Your registration is complete.");
        System.out.println("Your temporary password is: " + temporaryPassword);
    }
}
