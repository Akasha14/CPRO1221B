import java.util.Scanner;

public class DiceRoller1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userPick;
        int die1, die2, total;

        //Starting Menu.
        System.out.println("---------------------------------------");
        System.out.println("Dice Roller");
        System.out.println();
        System.out.print("Roll the dice? (y/n): ");
        userPick = scanner.nextLine();
        System.out.println();

        //Only starts if 'y' or 'Y' is entered.
        while (userPick.equalsIgnoreCase("y")) {
            //rollDie() function called and stored in each die, then added together.
            die1 = rollDie();
            die2 = rollDie();
            total = die1 + die2;

            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total: " + total);
            System.out.println();

            //Special messages. (two ones),(two sixes)
            if (die1 == 1 && die2 == 1) {
                System.out.println("Snake eyes!");
            } else if (die1 == 6 && die2 == 6) {
                System.out.println("Boxcars!");
            }

            System.out.print("Roll again? (y/n): ");
            userPick = scanner.nextLine();

            //Exits while loop on 'n' or 'N'.
            if (userPick.equalsIgnoreCase("n")) {
                break;
            }
        }

        if (userPick.equalsIgnoreCase("n")) {
            System.out.println("Exiting.");
        }

        scanner.close();
    }

    //Function for rolling the die, with the random method of the Math class
    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }
}