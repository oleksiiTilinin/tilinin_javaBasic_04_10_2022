public class NumberShuttlesClass {
    public static void main(String[] args) {
        int shuttleNumber = 0;
        for (int i = 0; i < 200; i++) {
            int x = i / 100;
            int y = i / 10 % 10;
            int z = i % 10;

            boolean luckyNumberCheck = (x != 9) && (x != 4) && (y != 4) && (z != 4) && (y != 9) && (z != 9);
            boolean stopCounting = shuttleNumber <= 100;
            if (luckyNumberCheck && stopCounting) {
                System.out.println(shuttleNumber + " Shuttle Number is " + i);
                shuttleNumber++;
            }
        }
    }
}
