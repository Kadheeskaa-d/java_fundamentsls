import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scn.nextInt();

        int square = n * n;

        while (n>0)
        if (n != square % 10) {
            System.out.println("The given number is not a Automorphic number!");
        } else {
            System.out.println("The given number is a Automorphic number!");
        }
    }
}

