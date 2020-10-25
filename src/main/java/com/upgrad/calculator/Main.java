package com.upgrad.Calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.upgrad.calculator");
        Calculator calculator=(Calculator)context.getBean("calculator");
        Scanner scanner=new Scanner(System.in);
        int result=0;
        try {
            System.out.println("Please enter two numbers");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println("Please select a valid operation to perform");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");

            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    result = calculator.compute("add", number1, number2);
                    break;
                case 2:
                    result = calculator.compute("sub", number1, number2);
                    break;
                case 3:
                    result = calculator.compute("mul", number1, number2);
                    break;
                case 4:
                    result = calculator.compute("div", number1, number2);
                    break;
                case 5:
                    result = calculator.compute("mod", number1, number2);
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("Please enter a valid Number");
            scanner.next();
        }
        System.out.println("Result is = "+result);
    }
}
