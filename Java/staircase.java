import java.util.Scanner;

public class Solution {
    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = Integer.parseInt(sc.nextLine());
        sc.close();
        for (int i = 0; i < height; i++) {
            System.out.println(repeat(" ", height - i - 1) + repeat("#", i + 1));
        }
    }
}