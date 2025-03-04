public class All_Strong_Number
{
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        for ( int num = 1 ; num <= 1000 ; num++)
        {
            int temp = num;
            int sum = 0;

           while (temp > 0) {
               int digits = temp % 10;
               sum = sum + factorial(digits);
               temp = temp / 10;
           }
           if (sum == num) {
               System.out.println("The given number " + num + " is a Strong number");
           }
       }
    }
}

