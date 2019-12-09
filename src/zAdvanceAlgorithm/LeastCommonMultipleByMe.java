package zAdvanceAlgorithm;

import java.util.Scanner;

public class LeastCommonMultipleByMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNum = scan.nextInt();
        int secondNum =  scan.nextInt();
        int gcd = 1;
        int lcm;

        int max = firstNum;
        if (secondNum > firstNum)
            max = secondNum;

        for (int i = 1; i <= max; i++) {
            if (firstNum %i == 0 && secondNum %i == 0)
                gcd = i;
        }
        System.out.println("gcd = " + gcd);
//        int lcmFn = 1;
//        int lcmSn = 1;
//        for (int i = 1; i <= max; i++){
//            if (firstNum %i == 0)
//                lcmFn *= i;
//
//
//
//
//        }


    }
}
