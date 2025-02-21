import java.util.Scanner;

class Calculator {
    
    void add() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two numbers for addition: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Sum = " + (a + b));
    }

    int sub() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two numbers for subtraction: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        return a - b;
    }

    void mul(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    double div(int a, int b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return -1;
        }
        return (double) a / b;
    }
}

class Calcu {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add();

        int resultSub = calc.sub();
        System.out.println("Subtraction = " + resultSub);

        calc.mul(5, 3);

        double resultDiv = calc.div(10, 2);
        System.out.println("Division = " + resultDiv);
    }
}
