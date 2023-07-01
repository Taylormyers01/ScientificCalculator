package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class CoreFunctionsSimple {
/*
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double ans = 0;
        char operation;

        //take the user's chosen operator first

        Scanner input = new Scanner(System.in);
        System.out.println("What operation would you like to use?");
        System.out.println("( + - * / ^ v )");   // \u221A produces √
        operation = input.next().charAt(0);

        //take the user's chosen numbers
        if (operation != 'v') {
            System.out.println("Enter your first number: ");
            num1 = input.nextDouble();

            System.out.println("Enter your second number: ");
            num2 = input.nextDouble();


            if (operation == '/' && num2 == 0) {
                System.out.println("Error");
            } else if (operation == 'v') {
                System.out.println("Enter the number you want to square root: ");
                num1 = input.nextDouble();
            }
            input.close();

            //switch statement through operator and perform the calculation.
            switch (operation) {
                case '+':
                    ans = num1 + num2;
                    System.out.printf("%.3f + %.3f = %.3f", num1, num2, ans);
                    break;
                case '-':
                    ans = num1 - num2;
                    System.out.printf("%.3f - %.3f = %.3f", num1, num2, ans);
                    break;
                case '*':
                    ans = num1 * num2;
                    System.out.printf("%.3f * %.3f = %.3f", num1, num2, ans);
                    break;
                case '/':
                    ans = num1 / num2;
                    System.out.printf("%.3f / %.3f = %.3f", num1, num2, ans);
                    break;
                case '^':
                    for (double i = num2; i <= num2; i++)
                        ans = num1 * num1;
                    System.out.printf("%.3f to the %.3f power = %.3f", num1, num2, ans);
                    break;
                case 'v':
                    ans = Math.sqrt(num1);
                    System.out.printf("%.3f + %.3f = %.3f", num1, num2, ans);
                    break;
            }
        }

    }
}
*/
}