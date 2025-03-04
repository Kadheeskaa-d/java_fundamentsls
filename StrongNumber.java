import java.util.Scanner;
public class StrongNumber {
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp = num;

        int sum = 0;
        while (temp > 0) {
            int digits = temp % 10;

            System.out.println("Factorial of " + digits + "is " + factorial(digits));
            sum = sum + factorial(digits);
            temp = temp / 10;
        }
        System.out.println(sum);
            if(sum == num){
            System.out.println("The given number " + num + " is a Strong number");}
            else{
                System.out.println("The given number " + num + " is not a Strong number");
            }

    }
}