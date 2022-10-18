public class RugbyClass {

    public static void main(String[] args) {

        int[] team1 = new int[26];
        int team1Total = 0;
        for (int i = 1; i <= 25; i++) {
            int randomAge = (int) (18 + Math.random() * 22);
            System.out.println("Player " + i + " of Team 1 is " + randomAge + " years old");
            team1[i] = randomAge;
            team1Total = team1Total + randomAge;
        }
        System.out.println("Sum " + team1Total);
        System.out.println("Average age of Team 1 players: " + team1Total / 25 + "\n");


        int[] team2 = new int[26];
        int team2Total = 0;
        for (int i = 1; i <= 25; i++) {
            int randomAge = (int) (18 + Math.random() * 22);
            System.out.println("Player " + i + " of Team 2 age is " + randomAge + " years old");
            team2[i] = randomAge;
            team2Total = team2Total + randomAge;
        }
        System.out.println("Sum " + team2Total);
        System.out.println("Average age of Team 2 players: " + team2Total / 25);

    }

}
