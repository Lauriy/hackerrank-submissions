import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputTime = sc.nextLine();
        sc.close();
        DateFormat df1 = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat df2 = new SimpleDateFormat("HH:mm:ss");
        try {
            Date date = df1.parse(inputTime);
            System.out.println(df2.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}