package TandomloopAssignment;

import java.util.Scanner;

public class Calculator {
	double a, b;
    String o;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        b = sc.nextDouble();

        sc.nextLine(); 
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        o = sc.nextLine();

        sc.close();
    }

    void calculate() {
        if (o.equalsIgnoreCase("add")) {
            System.out.println("Result: " + (a + b));
        } else if (o.equalsIgnoreCase("subtract")) {
            System.out.println("Result: " + (a - b));
        } else if (o.equalsIgnoreCase("multiply")) {
            System.out.println("Result: " + (a * b));
        } else if (o.equalsIgnoreCase("divide")) {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operation.");
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.getInput();
        c.calculate();
    }
} 
