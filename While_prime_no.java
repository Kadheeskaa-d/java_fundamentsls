public class While_prime_no
{
    public static void main(String[] args) 
    {
        int limit = 100; 
        int num = 2;

        while (num <= limit) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) 
            {
                if (num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) 
            {
                System.out.println(num);
            }
            num++;
        }
    }
}
