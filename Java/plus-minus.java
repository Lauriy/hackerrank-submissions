import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalCount = Float.parseFloat(sc.nextLine());
        int[] numbers = Arrays.asList(sc.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        sc.close();
        float negativeCount = 0;
        float positiveCount = 0;
        float zeroCount = 0;
        for (int number : numbers) {
            if (number == 0) {
                zeroCount++;
            } else if (number > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        DecimalFormat df = new DecimalFormat("#.000000");
        System.out.println(df.format(positiveCount / totalCount));
        System.out.println(df.format(negativeCount / totalCount));
        System.out.println(df.format(zeroCount / totalCount));
    }
}