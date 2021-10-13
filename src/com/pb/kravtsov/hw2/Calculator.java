package com.pb.kravtsov.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int leftOperand = in.nextInt();

        System.out.println("Input second number: ");
        int rightOperand = in.nextInt();

        System.out.println("Operator: ");
        String operator = in.next();

        if (rightOperand == 0 && operator == "/" ) {
            System.out.println("Division by zero is not possible");
            return;
        }

        switch (operator) {
            case "+":
                int sum = leftOperand + rightOperand;
                System.out.printf("The sum is: %d", sum + leftOperand);
                break;
            case "-":
                int subtraction = leftOperand - rightOperand;
                System.out.printf("The subtraction`s result is:  %d", subtraction);
                break;
            case "*":
                int multiplication = leftOperand * rightOperand;
                System.out.printf("The multiplication`s result is:  %d", multiplication);
                break;
            case "/":
                if (rightOperand == 0) {
                    System.out.println("Division by zero is not possible");
                    return;
                }
                int division = leftOperand / rightOperand;
                System.out.printf("The division`s result is:  %d", division);
                break;
            default:
                System.out.println("You have missed something, haven`t you?");
        }
    }
}
