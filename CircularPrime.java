import java.util.Scanner;
public class CircularPrime
{
    static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        int n = 1193;
        int d = 0, mul = 1, temp, temp1, temp2, temp3;

        boolean flag = isPrime(n);
        if (flag)
        {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }

        temp = n;
        while (temp > 0)
        {
            temp /= 10;
            d++;
            mul *= 10;
        }
        mul /= 10;

        System.out.println("Circular permutations:");
        int num = n;
        for (int i = 0; i < d; i++) {
            temp1 = num / mul;
            temp2 = num % mul;
            temp3 = (temp2 * 10) + temp1;

            System.out.println(temp3);
            num = temp3;
        }
    }
}