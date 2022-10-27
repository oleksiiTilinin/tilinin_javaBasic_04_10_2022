import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int) (10
                * Math.random());

        int trying = 5;

        int i, guess;

        System.out.println(
                "A number is chosen"
                        + " between 1 to 100. "
                        + "Guess the number"
                        + " within 5 trials.");

        for (i = 0; i < trying; i++) {

            System.out.println(
                    "Guess the number:");

            guess = sc.nextInt();

            if (number == guess) {
                System.out.println(
                        "Congratulations!"
                                + " You guessed the number.");
                break;
            } else if (number > guess
                    && i != trying - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            } else if (number < guess
                    && i != trying - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }

        if (i == trying) {
            System.out.println(
                    "You have exhausted "
                            + trying + " trials.");

            System.out.println(
                    "The number was " + number);
        }
    }
}