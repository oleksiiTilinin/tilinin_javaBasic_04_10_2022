package ithillel.hw3;

public class ChineseDynastiesClass {

    public static void main(String[] args) {
        final double kof = 1.5;

        int liWarrior = 13 * 860;
        int liArcher = 24 * 860;
        int liRider = 46 * 860;
        int liQuantityOfWarriors = 860 * 3;

        int minWarrior = (int) (9 * 860 * kof);
        int minArcher = (int) (35 * 860 * kof);
        int minRider = (int) (12 * 860 * kof);
        int mingQuantityOfWarriors = (int) (liQuantityOfWarriors * 1.5);

        int liAttackAmount = (liWarrior + liArcher + liRider) / liQuantityOfWarriors;
        int minAttack = (minWarrior + minArcher + minRider) / mingQuantityOfWarriors;

        System.out.println("Common attack value for Ling dynasty is: - " + liAttackAmount);
        System.out.println("Common attack value for Ming dynasty is: - " + minAttack);

    }
}
