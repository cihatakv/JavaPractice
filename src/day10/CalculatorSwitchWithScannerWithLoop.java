package day10;

import java.util.Scanner;

public class CalculatorSwitchWithScannerWithLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the 1st Number: ");
        int num1 = scan.nextInt();
        System.out.println("Please enter the 2nd Number: ");
        int num2 = scan.nextInt();
        System.out.println("How many calculation you wanna do? ");
        int j = scan.nextInt();
        char operator;
        for (int i = 0; i < j; i++) {
        System.out.println("Please enter + to add, - to subtract, * to multiply, ");
        System.out.println("/ to divide or % to find the remainder: ");
        operator = scan.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 / num2));
                    break;
                case '%':
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 % num2));
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
    }
}
