package hackerRank;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        String s = "";
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
    }
}
/*
java 100
cpp 65
python 50
 */