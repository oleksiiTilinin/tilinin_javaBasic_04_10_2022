import java.util.Scanner;

public class CounterStrikeClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name for the first team:");
        String firstTeamName = scanner.next();
        System.out.println("Enter the name for the second team:");
        String secondTeamName = scanner.next();

        // Generate random frags for the players
        int[] firstTeam = {(int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20)};
        int[] secondTeam = {(int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20), (int) (Math.random() * 20)};

        // Compare results
        int firstTeamResult = firstTeam[0] + firstTeam[1] + firstTeam[2] + firstTeam[3] + firstTeam[4];
        int secondTeamResult = secondTeam[0] + secondTeam[1] + secondTeam[2] + secondTeam[3] + secondTeam[4];
        boolean result = firstTeamResult > secondTeamResult;

        // Calculate and print arithmetic average frags of the team's to console
        System.out.println("Arithmetic average frags of the " + firstTeamName + " is " + firstTeamResult / firstTeam.length);
        System.out.println("Arithmetic average frags of the " + secondTeamName + " is " + secondTeamResult / secondTeam.length);


        //Print the results to console
        if (result) {
            System.out.println("Winner is team '" + firstTeamName + "' with " + firstTeamResult + " points");
        } else {
            System.out.println("Winner is team '" + secondTeamName + "' with " + firstTeamResult + " points");
        }
    }
}