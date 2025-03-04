import java.util.Scanner;
public class Pronic_Abundant_Niven
{
    public static void pronic(int num)
    {
        for ( int x = 1 ; x <= num ; x++)
        {
            int pronic = x*(x+1);
            if(pronic==num){
                System.out.println("Pronic");
            }
        }
    }

    public static void abundant(int num)
    {
        int sum = 0;
        for(int y=1;y<num;y++)
        {
            int fact = num % y;
            if (fact == 0)
            {
                sum = sum + y;
            }
        }
                if (sum > num)
                {
                    System.out.println("Abundant");
                }
    }
    public static void niven(int num)
    {
        int sum =0;
        int temp = num;
        while (temp>0)
        {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        if(num%sum==0)
        {
            System.out.println("niven");
        }

    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scn.nextInt();
        pronic(num);
        abundant(num);
        niven(num);

    }
}
