import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long[] numbers = new long[5];
        long minTotal = 0, maxTotal = 0, total = 0, tempTotal;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextLong();
            total += numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {

            tempTotal = total;
            tempTotal -= numbers[i];
            if (tempTotal > maxTotal) {
                maxTotal = tempTotal;
            }
            if (tempTotal < minTotal || minTotal == 0) {
                minTotal = tempTotal;
            }
        }

        System.out.print(minTotal + " " + maxTotal);
    }
}