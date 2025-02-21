import java.util.Scanner;

class LeftAngledTriangle {
    int n;

    LeftAngledTriangle() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scn.nextInt();
    }

    void display() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class RightAngledTriangle {
    int n;

    RightAngledTriangle() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scn.nextInt();
    }

    void display() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        LeftAngledTriangle left = new LeftAngledTriangle();
        RightAngledTriangle right = new RightAngledTriangle();

        System.out.println("\nLeft Angled Triangle:");
        left.display();

        System.out.println("\nRight Angled Triangle:");
        right.display();
    }
}
