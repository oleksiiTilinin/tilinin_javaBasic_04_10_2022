import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        int[] first = generateRandomArray(7);
        int[] second = generateRandomArray(7);

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println("First: " + Arrays.toString(first));
        System.out.println("Second: " + Arrays.toString(second));

        int matchCount = 0;

        for (int i = 0; i < first.length; i++) {

            if (first[i] == second[i]) {

                matchCount = matchCount + 1;

            }
            if (i == first.length - 1) {
                System.out.println("Match count: " + matchCount);
            }
        }
    }

    private static int[] generateRandomArray(int setArrayLength) {
        int[] generatedArray = new int[setArrayLength];
        for (int i = 0; i < generatedArray.length; i++) {
            generatedArray[i] = (int) (Math.random() * 9);
        }
        return generatedArray;
    }
}
