package com.chmnu_ki_123.k3;
import java.util.Scanner;

import static java.lang.Math.*;

public class MathCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number (use ',' as decimal separator): ");
        double x = getValidDouble(sc);

        System.out.print("Enter the second number (use ',' as decimal separator): ");
        double a = getValidDouble(sc);

        System.out.print("Enter the third number (use ',' as decimal separator): ");
        double b = getValidDouble(sc);

        System.out.print("Enter the fourth number (use ',' as decimal separator): ");
        double c = getValidDouble(sc);

        if (x * x == 1) {
            System.out.println("Error: Division by zero in expression 'b / (x * x - 1)'.");
            return;
        }

        double one = a * cos(b / (x * x - 1));

        // Перевірка на ділення на нуль
        double two = exp(-b * x) + c;
        if (two == 0) {
            System.out.println("Error: Division by zero in expression 'one / two'.");
            return;
        }

        double result = one / two;

        System.out.printf("Result: %.3f\n", result);
    }

    // Метод для отримання коректного значення double
    private static double getValidDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Please enter a valid floating-point number using ',' as the decimal separator.");
            sc.next();  // Очистити неправильне введення
        }
        return sc.nextDouble();
    }
}
