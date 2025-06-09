
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //calculator operations
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("The sum is " + Calculator.add(a, b));
        System.out.println("The difference is " + Calculator.subtract(a, b));
        System.out.println("The product is " + Calculator.multiply(a, b));
        System.out.println("The quotient is " + Calculator.divide(a, b));

    }
}
