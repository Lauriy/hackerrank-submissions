import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentIndex = 0;
        int sum = 0;
        int matrixSize = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[matrixSize][matrixSize];
        while (sc.hasNextLine()) {
            matrix[currentIndex] = Arrays.asList(sc.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
            currentIndex++;
        }
        sc.close();
        for (currentIndex = 0; currentIndex < matrixSize; currentIndex++) {
            sum += matrix[currentIndex][currentIndex];
            sum -= matrix[currentIndex][matrixSize - currentIndex - 1];
        }
        System.out.println(Math.abs(sum));
    }
}