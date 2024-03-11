import java.util.Scanner;

public class DiceRoller2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userPick;

        // Starting Menu.
        System.out.println("---------------------------------------");
        System.out.println("Dice Roller");
        System.out.println();
        System.out.print("Roll the dice? (y/n): ");
        userPick = scanner.nextLine();
        System.out.println();

        // Only starts if 'y' or 'Y' is entered.
        while (userPick.equalsIgnoreCase("y")) {
            // Create instance of Dice class.
            Dice dice = new Dice();

            // Roll dice.
            dice.roll();

            // Display result.
            dice.printRoll();

            System.out.print("Roll again? (y/n): ");
            userPick = scanner.nextLine();

            // Exits while loop on 'n' or 'N'.
            if (userPick.equalsIgnoreCase("n")) {
                break;
            }
        }

        if (userPick.equalsIgnoreCase("n")) {
            System.out.println("Exiting.");
        }

    }
}

// Die class to store data about each die.
class Die {
    private int dieValue;

    // Constructor sets the starting value of the die to zero.
    public Die() {
        this.dieValue = 0;
    }

    // roll() updates the die value to a random #(1-6).
    public void roll() {
        this.dieValue = (int) (Math.random() * 6) + 1;
    }

    // getValue() returns current value of the die.
    public int getValue() {
        return this.dieValue;
    }
}

class Dice {
    private Die die1;
    private Die die2;

    // Constructor creates the Die instances.
    public Dice() {
        this.die1 = new Die();
        this.die2 = new Die();
    }

    // Roll dice.
    public void roll() {
        die1.roll();
        die2.roll();
    }

    // Get value of die1.
    public int getDie1Value() {
        return die1.getValue();
    }

    // Get value of die2.
    public int getDie2Value() {
        return die2.getValue();
    }

    // Sum of both dice.
    public int getSum() {
        return die1.getValue() + die2.getValue();
    }

    // Display result and special messages.
    public void printRoll() {
        System.out.println("Die 1: " + getDie1Value());
        System.out.println("Die 2: " + getDie2Value());
        System.out.println("Total: " + getSum());

        // Special messages(1 AND 1, 6 AND 6, equals 7)
        if (getDie1Value() == 1 && getDie2Value() == 1) {
            System.out.println("Snake eyes!");
        } else if (getDie1Value() == 6 && getDie2Value() == 6) {
            System.out.println("Boxcars!");
        } else if (getDie1Value() + getDie2Value() == 7) {
            System.out.println("Craps!");
        }

        System.out.println();
    }
}
